package com.Moyashi.Nekokamiko.repayhopper.item;


import javax.annotation.Nullable;

import com.Moyashi.Nekokamiko.hopper.core.OriginalHopperEntity;
import com.Moyashi.Nekokamiko.hopper.entity.AbstractHopperBlockEntity;
import com.Moyashi.Nekokamiko.minecart.entity.GoldenHopperMinecart;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.Hopper;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.items.CapabilityItemHandler;
/**
 * Author: MrCrayfish
 */

/**
 * このクラスでは、Mainカートが出された時に周りにあるのがレールか否かを判定して、Mainカートを任意の座標に出現させる
 */
public class RepayHopperItem extends Item {
    private static final DispenseItemBehavior MINECART_DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior()
    {
        //デフォルトのアイテムディスペンサーの挙動を格納するためのフィールド宣言
        private final DefaultDispenseItemBehavior behaviourDefaultDispenseItem = new DefaultDispenseItemBehavior();

        //アイテムディスペンサーがアイテムを発射する際に実行されるメソッド
        //ディスペンサーの無機、レベル。座標情報の取得
        @Override
        public ItemStack execute(BlockSource source, ItemStack stack)
        {
            //ディスペンサーの向き
            Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
            //レベル情報
            Level level = source.getLevel();
            //座標情報を取得
            double posX = source.x() + (double) direction.getStepX() * 1.125D;
            double posY = Math.floor(source.y()) + (double) direction.getStepY();
            double posZ = source.z() + (double) direction.getStepZ() * 1.125D;
            //隣接するブロック情報取得
            BlockPos adjacentPos = source.getPos().relative(direction);
            BlockState adjacentState = level.getBlockState(adjacentPos);
            RailShape adjacentShape = adjacentState.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) adjacentState.getBlock()).getRailDirection(adjacentState, level, adjacentPos, null) : RailShape.NORTH_SOUTH;
            double yOffset;
            //隣接するブロックがレールだとすれば
            if(adjacentState.is(BlockTags.RAILS))
            {
                //レールの形状に応じてマインカートのY座標を調整
                //レールの形状が昇降中かどうかで位置を微調整
                if(adjacentShape.isAscending())
                {
                    yOffset = 0.6D;
                }
                else
                {
                    yOffset = 0.1D;
                }
            }
            else
            {
                if(!adjacentState.isAir() || !level.getBlockState(adjacentPos.below()).is(BlockTags.RAILS))
                {
                    return this.behaviourDefaultDispenseItem.dispense(source, stack);
                }

                BlockState state = level.getBlockState(adjacentPos.below());
                RailShape shape = state.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) state.getBlock()).getRailDirection(state, level, adjacentPos.below(), null) : RailShape.NORTH_SOUTH;
                if(direction != Direction.DOWN && shape.isAscending())
                {
                    yOffset = -0.4D;
                }
                else
                {
                    yOffset = -0.9D;
                }
            }
            //レベルに新しいMainカートのエンティティを追加
            AbstractMinecart minecart = new GoldenHopperMinecart(level, posX, posY + yOffset, posZ);
            if(stack.hasCustomHoverName())
            {
                minecart.setCustomName(stack.getHoverName());
            }
            //ディスペンサーから発射した後、アイテムstackから１つ減少させる
            level.addFreshEntity(minecart);
            stack.shrink(1);
            return stack;
        }

        @Override
        protected void playSound(BlockSource source)
        {
            source.getLevel().levelEvent(1000, source.getPos(), 0);
        }
    };

    //コンストラクタで、ゴールデンホッパーMainカートアイテムの生成および、ディスペンサーの挙動を登録
    public RepayHopperItem(Item.Properties builder)
    {
        super(builder);
        DispenserBlock.registerBehavior(this, MINECART_DISPENSER_BEHAVIOR);
    }
    //特定のアクションが行われた際に実行されるメソッド
    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        //アクションが行われたワールド取得
        Level level = context.getLevel();
        //アクションが行われたブロックの座標取得
        BlockPos pos = context.getClickedPos();
        //ブロックの座標から対応するブロックのお状態取得
        BlockState state = level.getBlockState(pos);
        //取得したブロックの状態がレールでない場合の条件判定
        if(!state.is(BlockTags.RAILS))
        {
            //アクションをキャンセルして、失敗したことを示す結果を返す
            return InteractionResult.FAIL;
        }
        ItemStack stack = context.getItemInHand();
        //サーバーサイドでの処理
        if(!level.isClientSide)
        {
            //レール状態から形状取得。昇降中かどうかでY座標の微調整
            RailShape shape = state.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) state.getBlock()).getRailDirection(state, level, pos, null) : RailShape.NORTH_SOUTH;
            double yOffset = 0.0D;
            if(shape.isAscending())
            {
                yOffset = 0.5D;
            }
            //ブロック座標からMainカートを生成して、カスタムの名前が設定されてればそれ仕様
            AbstractMinecart minecart = new GoldenHopperMinecart(level, pos.getX() + 0.5, pos.getY() + 0.0625 + yOffset, pos.getZ() + 0.5);
            if(stack.hasCustomHoverName())
            {
                minecart.setCustomName(stack.getHoverName());
            }
            //Mainカートエンティティの追加
            level.addFreshEntity(minecart);
        }
        //アクションを行ったstackから１つ減少させる
        stack.shrink(1);
        return InteractionResult.SUCCESS;
    }
}