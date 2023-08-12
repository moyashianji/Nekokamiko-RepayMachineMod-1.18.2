package com.Moyashi.Nekokamiko.minecart.entity;

import com.Moyashi.Nekokamiko.hopper.core.OriginalHopperEntity;
import com.Moyashi.Nekokamiko.hopper.entity.AbstractHopperBlockEntity;
import com.Moyashi.Nekokamiko.init.ModEntities;
import com.Moyashi.Nekokamiko.init.ModBlocks;
import com.Moyashi.Nekokamiko.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.util.Mth;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.vehicle.AbstractMinecartContainer;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.Hopper;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author: MrCrayfish
 */
public class GoldenHopperMinecart extends AbstractMinecartContainer implements Hopper, WorldlyContainer
{
    private boolean blocked = true;
    private int transferTicker = -1;
    private final BlockPos lastPosition = BlockPos.ZERO;

    public GoldenHopperMinecart(EntityType<?> type, Level level)
    {
        super(type, level);
    }

    public GoldenHopperMinecart(Level level, double x, double y, double z)
    {
        super(ModEntities.GOLDEN_HOPPER_MINECART.get(), x, y, z, level);
    }

    public boolean isBlocked()
    {
        return blocked;
    }

    public void setBlocked(boolean blocked)
    {
        this.blocked = blocked;
    }

    public void setTransferTicker(int transferTicker)
    {
        this.transferTicker = transferTicker;
    }

    public boolean canTransfer()
    {
        return this.transferTicker > 0;
    }


    @Override
    public int getDefaultDisplayOffset()
    {
        return 1;
    }

    @Override
    public ItemStack getCartItem()
    {
        return new ItemStack(ModItems.GOLDEN_HOPPER_MINECART.get());
    }

    @Override
    public ItemStack getPickResult()
    {
        return new ItemStack(ModItems.GOLDEN_HOPPER_MINECART.get());
    }

    @Override
    public Type getMinecartType()
    {
        return Type.HOPPER;
    }

    @Override
    public double getLevelX()
    {
        return this.getX();
    }

    @Override
    public double getLevelY()
    {
        return this.getY() + 0.5D;
    }

    @Override
    public double getLevelZ()
    {
        return this.getZ();
    }

    @Override
    public int getContainerSize()
    {
        return 6;
    }

    //指定されたインデックスのスロットにアイテムを配置できるかどうか判定
    //インデックスはインベントリの行
    //行が０いがいで、スロットがからか、stackされているアイテムが同じ課の時にtrueになる
    @Override
    public boolean canPlaceItem(int index, ItemStack stack)
    {
        return index != 0 && (this.getItem(0).isEmpty() || stack.getItem() == this.getItem(0).getItem());
    }
    //指定された方向からアイテムを受け入れることができるスロットのインデックスの配列を返す
    //インデックス1からコンテナのサイズまでの連続した整数を含む配列を返す。
    //じょれは、１行目のスロットがアイテムの受け入れ先になる
    @Override
    public int[] getSlotsForFace(Direction side)
    {
        return IntStream.range(1, this.getContainerSize()).toArray();
    }
    //指定された方向からアイテムを特定のスロットに配置できるかどうか判定
    //インデックス0以外で、スロットに空きがあるか、もしくはstackされているアイテムが同じアイテム種類である場合にtrue返す
    //
    @Override
    public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction)
    {
        return index != 0 && (this.getItem(0).isEmpty() || stack.getItem() == this.getItem(0).getItem());
    }
    //指定された方向からアイテムを特定のスロットから取り出せるかの判定
    //０行目以外の時にtrue返す
    @Override
    public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction)
    {
        return index != 0;
    }
    //受け取った信号が現在のブロック状態と反対である場合blockedフラグの値を反転させる、
    @Override
    public void activateMinecart(int x, int y, int z, boolean receivingPower)
    {
        if(receivingPower == this.isBlocked())
        {
            this.setBlocked(!receivingPower);
        }
    }

    //tickメソッドはゲームのタイム米に呼び出されるアップデート処理を行う
    //
    @Override
    public void tick()
    {
        super.tick();
        if(!this.level.isClientSide && this.isAlive() && this.isBlocked())
        {
            BlockPos pos = this.blockPosition();
            if(pos.equals(this.lastPosition))
            {
                this.transferTicker--;
            }
            else
            {
                this.setTransferTicker(0);
            }

            if(!this.canTransfer())
            {
                this.setTransferTicker(0);
                if(this.captureDroppedItems())
                {
                    this.setTransferTicker(4);
                    this.setChanged();
                }
            }
        }

    }

    private boolean captureDroppedItems()
    {
        if(OriginalHopperEntity.suckInItems(this.level, this))
        {
            return true;
        }
        List<ItemEntity> list = this.level.getEntitiesOfClass(ItemEntity.class, this.getBoundingBox().inflate(0.25D, 0.0D, 0.25D), EntitySelector.ENTITY_STILL_ALIVE);
        if(!list.isEmpty())
        {
            this.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(handler -> {
                AbstractHopperBlockEntity.addItemEntity(this, handler, list.get(0));
            });
        }
        return false;
    }

    //エンティティの追加データをcompoundtagとして保存する際に呼び出されれう
    //transferTickerとblockedを保存する
    @Override
    protected void addAdditionalSaveData(CompoundTag compound)
    {
        super.addAdditionalSaveData(compound);
        compound.putInt("TransferCooldown", this.transferTicker);
        compound.putBoolean("Enabled", this.blocked);
    }
    //エンティティの追加のセーブデータを読み込むときに呼び出される
    //compoundからエンティティ固有のデータを読み込む
    //transferTickerとblocked の値を読み込む
    @Override
    protected void readAdditionalSaveData(CompoundTag compound)
    {
        super.readAdditionalSaveData(compound);
        this.transferTicker = compound.getInt("TransferCooldown");
        this.blocked = !compound.contains("Enabled") || compound.getBoolean("Enabled");
    }

    @Override
    protected AbstractContainerMenu createMenu(int p_38222_, Inventory p_38223_) {
        return null;
    }

    //エンティティが破壊されるときに呼び出される　
    //ゲームルールが有効である場合、ModBlocks.GOLDEN_HOPPERをドロップするようにする

    @Override
    public Packet<?> getAddEntityPacket()
    {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public int getComparatorLevel()
    {
        float filled = IntStream.range(1, this.getContainerSize())
                .mapToObj(this::getItem)
                .filter(stack -> !stack.isEmpty())
                .map(stack -> stack.getCount() / (float) Math.min(this.getMaxStackSize(), stack.getMaxStackSize()))
                .reduce(0F, Float::sum);
        filled /= (this.getContainerSize() - 1.0F);
        return Mth.floor(filled * 14.0F) + (filled > 0 ? 1 : 0);
    }
}

