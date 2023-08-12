package com.Moyashi.Nekokamiko.init;



import com.Moyashi.Nekokamiko.main.Reference;
import com.Moyashi.Nekokamiko.minecart.entity.ClientHandler;
import com.Moyashi.Nekokamiko.minecart.entity.GoldenHopperMinecart;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: MrCrayfish
 */
public class ModEntities
{
    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);

    public static final RegistryObject<EntityType<GoldenHopperMinecart>> GOLDEN_HOPPER_MINECART = REGISTER.register("golden_hopper_minecart", () -> EntityType.Builder.<GoldenHopperMinecart>of(GoldenHopperMinecart::new, MobCategory.MISC)
            .sized(0.98F, 0.7F)
            .setCustomClientFactory(
                    (entity, world) -> {
                        GoldenHopperMinecart minecart = new GoldenHopperMinecart(ModEntities.GOLDEN_HOPPER_MINECART.get(), world);
                        ClientHandler.handleGoldenHopperMinecartSpawn(minecart);
                        return minecart;
                        //ビルダーの設定完了なので、最後にエンティティをビルドして登録する
                    }).build("golden_hopper_minecart")
    );
}