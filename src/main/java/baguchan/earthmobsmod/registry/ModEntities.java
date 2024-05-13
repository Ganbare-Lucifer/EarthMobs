package baguchan.earthmobsmod.registry;

import baguchan.earthmobsmod.EarthMobsMod;
import baguchan.earthmobsmod.entity.*;
import baguchan.earthmobsmod.entity.projectile.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@EventBusSubscriber(modid = EarthMobsMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, EarthMobsMod.MODID);

    public static final Supplier<EntityType<CluckShroom>> CLUCK_SHROOM = ENTITIES.register("cluck_shroom", () -> EntityType.Builder.of(CluckShroom::new, MobCategory.CREATURE).sized(0.4F, 0.7F).clientTrackingRange(10).build(prefix("cluck_shroom")));
    public static final Supplier<EntityType<FancyChicken>> FANCY_CHICKEN = ENTITIES.register("fancy_chicken", () -> EntityType.Builder.of(FancyChicken::new, MobCategory.CREATURE).sized(0.4F, 0.85F).clientTrackingRange(10).build(prefix("fancy_chicken")));
    public static final Supplier<EntityType<WoolyCow>> WOOLY_COW = ENTITIES.register("wooly_cow", () -> EntityType.Builder.of(WoolyCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("wooly_cow")));
    public static final Supplier<EntityType<UmbraCow>> UMBRA_COW = ENTITIES.register("umbra_cow", () -> EntityType.Builder.of(UmbraCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("umbra_cow")));
	public static final Supplier<EntityType<EarthCow>> ASHEN_COW = ENTITIES.register("ashen_cow", () -> EntityType.Builder.of(EarthCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("ashen_cow")));
	public static final Supplier<EntityType<AlbinoCow>> ALBINO_COW = ENTITIES.register("albino_cow", () -> EntityType.Builder.of(AlbinoCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("albino_cow")));
	public static final Supplier<EntityType<CreamCow>> CREAM_COW = ENTITIES.register("cream_cow", () -> EntityType.Builder.of(CreamCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("cream_cow")));
	public static final Supplier<EntityType<EarthCow>> COOKIE_COW = ENTITIES.register("cookie_cow", () -> EntityType.Builder.of(EarthCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("cookie_cow")));
	public static final Supplier<EntityType<EarthCow>> DAIRY_COW = ENTITIES.register("dairy_cow", () -> EntityType.Builder.of(EarthCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("dairy_cow")));
	public static final Supplier<EntityType<EarthCow>> PINTO_COW = ENTITIES.register("pinto_cow", () -> EntityType.Builder.of(EarthCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("pinto_cow")));
	public static final Supplier<EntityType<EarthCow>> SUNSET_COW = ENTITIES.register("sunset_cow", () -> EntityType.Builder.of(EarthCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).build(prefix("sunset_cow")));
	public static final Supplier<EntityType<TeaCupPig>> TEACUP_PIG = ENTITIES.register("teacup_pig", () -> EntityType.Builder.of(TeaCupPig::new, MobCategory.CREATURE).sized(0.4F, 0.4F).clientTrackingRange(10).build(prefix("teacup_pig")));
    public static final Supplier<EntityType<MagmaCow>> MAGMA_COW = ENTITIES.register("magma_cow", () -> EntityType.Builder.of(MagmaCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10).fireImmune().build(prefix("magma_cow")));


    public static final Supplier<EntityType<HornedSheep>> HORNED_SHEEP = ENTITIES.register("horned_sheep", () -> EntityType.Builder.of(HornedSheep::new, MobCategory.CREATURE).sized(0.9F, 1.3F).clientTrackingRange(10).build(prefix("horned_sheep")));
    public static final Supplier<EntityType<HyperRabbit>> HYPER_RABBIT = ENTITIES.register("hyper_rabbit", () -> EntityType.Builder.of(HyperRabbit::new, MobCategory.CREATURE).sized(0.4F, 0.6F).clientTrackingRange(8).build(prefix("hyper_rabbit")));
    public static final Supplier<EntityType<Moobloom>> MOOBLOOM = ENTITIES.register("moobloom", () -> EntityType.Builder.of(Moobloom::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(8).build(prefix("moobloom")));
    public static final Supplier<EntityType<Moolip>> MOOLIP = ENTITIES.register("moolip", () -> EntityType.Builder.of(Moolip::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(8).build(prefix("moolip")));
    public static final Supplier<EntityType<JumboRabbit>> JUMBO_RABBIT = ENTITIES.register("jumbo_rabbit", () -> EntityType.Builder.of(JumboRabbit::new, MobCategory.CREATURE).sized(0.7F, 1.2F).clientTrackingRange(8).build(prefix("jumbo_rabbit")));
    public static final Supplier<EntityType<ZombifiedPig>> ZOMBIFIED_PIG = ENTITIES.register("zombified_pig", () -> EntityType.Builder.of(ZombifiedPig::new, MobCategory.CREATURE).sized(0.6F, 0.85F).fireImmune().build(prefix("zombified_pig")));
    public static final Supplier<EntityType<Duck>> DUCK = ENTITIES.register("duck", () -> EntityType.Builder.of(Duck::new, MobCategory.CREATURE).sized(0.4F, 0.7F).build(prefix("duck")));
    public static final Supplier<EntityType<JollyLlama>> JOLLY_LLAMA = ENTITIES.register("jolly_llama", () -> EntityType.Builder.of(JollyLlama::new, MobCategory.CREATURE).sized(0.9F, 1.87F).clientTrackingRange(10).build(prefix("jolly_llama")));


    public static final Supplier<EntityType<MelonGolem>> MELON_GOLEM = ENTITIES.register("melon_golem", () -> EntityType.Builder.of(MelonGolem::new, MobCategory.MISC).sized(0.7F, 1.9F).immuneTo(Blocks.POWDER_SNOW).clientTrackingRange(8).build(prefix("melon_golem")));
    public static final Supplier<EntityType<FurnaceGolem>> FURNACE_GOLEM = ENTITIES.register("furnace_golem", () -> EntityType.Builder.of(FurnaceGolem::new, MobCategory.MISC).sized(1.4F, 2.7F).clientTrackingRange(10).build(prefix("furnace_golem")));


    public static final Supplier<EntityType<BoneSpider>> BONE_SPIDER = ENTITIES.register("bone_spider", () -> EntityType.Builder.of(BoneSpider::new, MobCategory.MONSTER).sized(1.4F, 0.9F).build(prefix("bone_spider")));
    public static final Supplier<EntityType<StrayBoneSpider>> STRAY_BONE_SPIDER = ENTITIES.register("stray_bone_spider", () -> EntityType.Builder.of(StrayBoneSpider::new, MobCategory.MONSTER).sized(1.4F, 0.9F).build(prefix("stray_bone_spider")));

    public static final Supplier<EntityType<VilerWitch>> VILER_WITCH = ENTITIES.register("viler_witch", () -> EntityType.Builder.of(VilerWitch::new, MobCategory.MONSTER).sized(0.6F, 1.95F).build(prefix("viler_witch")));

    public static final Supplier<EntityType<BoulderingZombie>> BOULDERING_ZOMBIE = ENTITIES.register("bouldering_zombie", () -> EntityType.Builder.of(BoulderingZombie::new, MobCategory.MONSTER).sized(0.6F, 1.95F).build(prefix("bouldering_zombie")));
    public static final Supplier<EntityType<LobberZombie>> LOBBER_ZOMBIE = ENTITIES.register("lobber_zombie", () -> EntityType.Builder.of(LobberZombie::new, MobCategory.MONSTER).sized(0.6F, 1.95F).build(prefix("lobber_zombie")));

    public static final Supplier<EntityType<BoulderingDrowned>> BOULDERING_DROWNED = ENTITIES.register("bouldering_drowned", () -> EntityType.Builder.of(BoulderingDrowned::new, MobCategory.MONSTER).sized(0.6F, 1.95F).build(prefix("bouldering_drowned")));
    public static final Supplier<EntityType<LobberDrowned>> LOBBER_DROWNED = ENTITIES.register("lobber_drowned", () -> EntityType.Builder.of(LobberDrowned::new, MobCategory.MONSTER).sized(0.6F, 1.95F).build(prefix("lobber_drowned")));

	public static final Supplier<EntityType<TropicalSlime>> TROPICAL_SLIME = ENTITIES.register("tropical_slime", () -> EntityType.Builder.of(TropicalSlime::new, MobCategory.MONSTER).sized(0.52F, 0.52F).eyeHeight(0.325F).clientTrackingRange(10).build(prefix("tropical_slime")));

    public static final Supplier<EntityType<SkeletonWolf>> SKELETON_WOLF = ENTITIES.register("skeleton_wolf", () -> EntityType.Builder.of(SkeletonWolf::new, MobCategory.MONSTER).sized(0.6F, 0.85F).build(prefix("skeleton_wolf")));
    public static final Supplier<EntityType<WitherSkeletonWolf>> WITHER_SKELETON_WOLF = ENTITIES.register("wither_skeleton_wolf", () -> EntityType.Builder.of(WitherSkeletonWolf::new, MobCategory.MONSTER).sized(0.6F, 0.85F).fireImmune().immuneTo(Blocks.WITHER_ROSE).build(prefix("wither_skeleton_wolf")));
    public static final Supplier<EntityType<BabyGhast>> BABY_GHAST = ENTITIES.register("baby_ghast", () -> EntityType.Builder.of(BabyGhast::new, MobCategory.CREATURE).sized(0.45F, 0.45F).fireImmune().build(prefix("baby_ghast")));

    public static final Supplier<EntityType<ZombifiedRabbit>> ZOMBIFIED_RABBIT = ENTITIES.register("zombified_rabbit", () -> EntityType.Builder.of(ZombifiedRabbit::new, MobCategory.MONSTER).sized(0.4F, 0.6F).clientTrackingRange(8).build(prefix("zombified_rabbit")));

    public static final Supplier<EntityType<SmellyEgg>> SMELLY_EGG = ENTITIES.register("smelly_egg", () -> EntityType.Builder.<SmellyEgg>of(SmellyEgg::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("smelly_egg")));
    public static final Supplier<EntityType<FancyEgg>> FANCY_EGG = ENTITIES.register("fancy_egg", () -> EntityType.Builder.<FancyEgg>of(FancyEgg::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("fancy_egg")));
    public static final Supplier<EntityType<DuckEgg>> DUCK_EGG = ENTITIES.register("duck_egg", () -> EntityType.Builder.<DuckEgg>of(DuckEgg::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("duck_egg")));

    public static final Supplier<EntityType<BoneShard>> BONE_SHARD = ENTITIES.register("bone_shard", () -> EntityType.Builder.<BoneShard>of(BoneShard::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("bone_shard")));
    public static final Supplier<EntityType<StrayBoneShard>> STRAY_BONE_SHARD = ENTITIES.register("stray_bone_shard", () -> EntityType.Builder.<StrayBoneShard>of(StrayBoneShard::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("stray_bone_shard")));

    public static final Supplier<EntityType<MelonSeed>> MELON_SEED = ENTITIES.register("melon_seeds", () -> EntityType.Builder.<MelonSeed>of(MelonSeed::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("melon_seeds")));
    public static final Supplier<EntityType<ZombieFlesh>> ZOMBIE_FLESH = ENTITIES.register("zombie_flesh", () -> EntityType.Builder.<ZombieFlesh>of(ZombieFlesh::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(prefix("zombie_flesh")));


	private static String prefix(String path) {
		return EarthMobsMod.MODID + "." + path;
	}

	@SubscribeEvent
	public static void registerSpawnPlacement(SpawnPlacementRegisterEvent event) {
        Raid.RaiderType.create("viler_witch", VILER_WITCH.get(), new int[]{0, 0, 1, 0, 1, 1, 2, 1});

		event.register(CLUCK_SHROOM.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, CluckShroom::checkCluckShroomSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(FANCY_CHICKEN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(WOOLY_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(UMBRA_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(ALBINO_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(ASHEN_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(COOKIE_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(CREAM_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(DAIRY_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(PINTO_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(SUNSET_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(TEACUP_PIG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MAGMA_COW.get(), SpawnPlacementTypes.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, MagmaCow::checkMagmaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);


		event.register(HORNED_SHEEP.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(HYPER_RABBIT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, HyperRabbit::checkHyperSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MOOBLOOM.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MOOLIP.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(JUMBO_RABBIT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, JumboRabbit::checkJumboSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(ZOMBIFIED_PIG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(DUCK.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(JOLLY_LLAMA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);


		event.register(MELON_GOLEM.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(FURNACE_GOLEM.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(BONE_SPIDER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(STRAY_BONE_SPIDER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(VILER_WITCH.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(BOULDERING_ZOMBIE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BoulderingZombie::checkBoulderingSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(LOBBER_ZOMBIE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(BOULDERING_DROWNED.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BoulderingDrowned::checkBoulderingDrownedSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(LOBBER_DROWNED.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, LobberDrowned::checkLobberDrownedSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(TROPICAL_SLIME.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, TropicalSlime::checkTropicalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(SKELETON_WOLF.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SkeletonWolf::checkSkeletonWolfSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(WITHER_SKELETON_WOLF.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SkeletonWolf::checkSkeletonWolfSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(BABY_GHAST.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BabyGhast::checkGhastSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(ZOMBIFIED_RABBIT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZombifiedRabbit::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	}

	@SubscribeEvent
	public static void registerEntityAttribute(EntityAttributeCreationEvent event) {
		event.put(CLUCK_SHROOM.get(), Chicken.createAttributes().build());
		event.put(FANCY_CHICKEN.get(), Chicken.createAttributes().build());
		event.put(WOOLY_COW.get(), Cow.createAttributes().build());
		event.put(UMBRA_COW.get(), Cow.createAttributes().build());
		event.put(ALBINO_COW.get(), Cow.createAttributes().build());
		event.put(ASHEN_COW.get(), Cow.createAttributes().build());
		event.put(CREAM_COW.get(), Cow.createAttributes().build());
		event.put(COOKIE_COW.get(), Cow.createAttributes().build());
		event.put(DAIRY_COW.get(), Cow.createAttributes().build());
		event.put(PINTO_COW.get(), Cow.createAttributes().build());
		event.put(SUNSET_COW.get(), Cow.createAttributes().build());


		event.put(TEACUP_PIG.get(), TeaCupPig.createAttributes().build());
        event.put(MAGMA_COW.get(), MagmaCow.createAttributes().build());

		event.put(HORNED_SHEEP.get(), HornedSheep.createAttributes().build());
		event.put(HYPER_RABBIT.get(), HyperRabbit.createAttributes().build());
		event.put(MOOBLOOM.get(), Cow.createAttributes().build());
		event.put(MOOLIP.get(), Cow.createAttributes().build());
		event.put(JUMBO_RABBIT.get(), JumboRabbit.createAttributes().build());
		event.put(ZOMBIFIED_PIG.get(), ZombifiedPig.createAttributes().build());
        event.put(DUCK.get(), Chicken.createAttributes().build());
        event.put(JOLLY_LLAMA.get(), Llama.createAttributes().build());

		event.put(MELON_GOLEM.get(), MelonGolem.createAttributes().build());
		event.put(FURNACE_GOLEM.get(), FurnaceGolem.createAttributes().build());


		event.put(BONE_SPIDER.get(), BoneSpider.createAttributes().build());
		event.put(STRAY_BONE_SPIDER.get(), BoneSpider.createAttributes().build());
		event.put(VILER_WITCH.get(), VilerWitch.createAttributes().build());
		event.put(BOULDERING_ZOMBIE.get(), BoulderingZombie.createAttributes().build());
		event.put(LOBBER_ZOMBIE.get(), Zombie.createAttributes().build());
		event.put(BOULDERING_DROWNED.get(), BoulderingDrowned.createAttributes().build());
		event.put(LOBBER_DROWNED.get(), Zombie.createAttributes().build());
		event.put(TROPICAL_SLIME.get(), Monster.createMonsterAttributes().build());
		event.put(SKELETON_WOLF.get(), SkeletonWolf.createAttributes().build());
		event.put(WITHER_SKELETON_WOLF.get(), SkeletonWolf.createAttributes().build());
		event.put(BABY_GHAST.get(), BabyGhast.createAttributes().build());
		event.put(ZOMBIFIED_RABBIT.get(), ZombifiedRabbit.createAttributes().build());
	}
}