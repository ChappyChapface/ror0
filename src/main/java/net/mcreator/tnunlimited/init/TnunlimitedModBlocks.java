
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tnunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.tnunlimited.block.ZincOreBlock;
import net.mcreator.tnunlimited.block.ZincDeepslateOreBlock;
import net.mcreator.tnunlimited.block.ZincBlockBlock;
import net.mcreator.tnunlimited.block.WetSandBlock;
import net.mcreator.tnunlimited.block.TitaniumoreBlock;
import net.mcreator.tnunlimited.block.TangeloBlossomBlock;
import net.mcreator.tnunlimited.block.TallMireshroomBlock;
import net.mcreator.tnunlimited.block.SupergraniteBlock;
import net.mcreator.tnunlimited.block.StrippedPalmWoodBlockBlock;
import net.mcreator.tnunlimited.block.StrippedPalmLogBlock;
import net.mcreator.tnunlimited.block.StrawberryBushstage4Block;
import net.mcreator.tnunlimited.block.StrawberryBushstage3Block;
import net.mcreator.tnunlimited.block.StrawberryBushstage2Block;
import net.mcreator.tnunlimited.block.StrawberryBushstage1Block;
import net.mcreator.tnunlimited.block.StrawberryBushstage0Block;
import net.mcreator.tnunlimited.block.SpawningEyeBlock;
import net.mcreator.tnunlimited.block.SlotsBlock;
import net.mcreator.tnunlimited.block.ShroomGrassBlock;
import net.mcreator.tnunlimited.block.RithiumBlockBlock;
import net.mcreator.tnunlimited.block.RawRithiumBlockBlock;
import net.mcreator.tnunlimited.block.QueensAltarBlock;
import net.mcreator.tnunlimited.block.QueensAltarActiveBlock;
import net.mcreator.tnunlimited.block.PurpleShroomslateWallsBlock;
import net.mcreator.tnunlimited.block.PurpleShroomslateStairsBlock;
import net.mcreator.tnunlimited.block.PurpleShroomslateSlabsBlock;
import net.mcreator.tnunlimited.block.PurpleLightglowBlock;
import net.mcreator.tnunlimited.block.PurpleCobbleShroomslateWallsBlock;
import net.mcreator.tnunlimited.block.PurpleCobbleShroomslateSlabBlock;
import net.mcreator.tnunlimited.block.PurpleCobbleShroomslateShairsBlock;
import net.mcreator.tnunlimited.block.PurpleCobbleShroomslateBlock;
import net.mcreator.tnunlimited.block.PurifiedenergyBlock;
import net.mcreator.tnunlimited.block.PolishedLemonstoneStairsBlock;
import net.mcreator.tnunlimited.block.PolishedLemonstoneSlabBlock;
import net.mcreator.tnunlimited.block.PolishedLemonstoneBlock;
import net.mcreator.tnunlimited.block.PolishedDaciteWallBlock;
import net.mcreator.tnunlimited.block.PolishedDaciteStairsBlock;
import net.mcreator.tnunlimited.block.PolishedDaciteSlabBlock;
import net.mcreator.tnunlimited.block.PolishedDacitePressurePlateBlock;
import net.mcreator.tnunlimited.block.PolishedDaciteButtonBlock;
import net.mcreator.tnunlimited.block.PolishedDaciteBlock;
import net.mcreator.tnunlimited.block.PlushStoatmanBlock;
import net.mcreator.tnunlimited.block.PlushPurpleKnightBlock;
import net.mcreator.tnunlimited.block.PlushHivemasterBlock;
import net.mcreator.tnunlimited.block.PlushGlowingGolemBlock;
import net.mcreator.tnunlimited.block.PlushAnimeRacoonBlock;
import net.mcreator.tnunlimited.block.PlushAardvarkmanBlock;
import net.mcreator.tnunlimited.block.PlamLeavesBlock;
import net.mcreator.tnunlimited.block.PalmWoodWoodBlock;
import net.mcreator.tnunlimited.block.PalmWoodLogBlock;
import net.mcreator.tnunlimited.block.PalmTrapdoorBlock;
import net.mcreator.tnunlimited.block.PalmStairsBlock;
import net.mcreator.tnunlimited.block.PalmPressurePlateBlock;
import net.mcreator.tnunlimited.block.PalmPlanksBlock;
import net.mcreator.tnunlimited.block.PalmPlankSlabBlock;
import net.mcreator.tnunlimited.block.PalmFenceGateBlock;
import net.mcreator.tnunlimited.block.PalmFenceBlock;
import net.mcreator.tnunlimited.block.PalmDoorBlock;
import net.mcreator.tnunlimited.block.PalmButtonBlock;
import net.mcreator.tnunlimited.block.OverdriveTableBlock;
import net.mcreator.tnunlimited.block.NubriumOreBlock;
import net.mcreator.tnunlimited.block.NubriumBlockBlock;
import net.mcreator.tnunlimited.block.NetherRithiumOreBlock;
import net.mcreator.tnunlimited.block.MireshroomBlock;
import net.mcreator.tnunlimited.block.LemonstoneStairsBlock;
import net.mcreator.tnunlimited.block.LemonstoneSlabBlock;
import net.mcreator.tnunlimited.block.LemonstoneBlock;
import net.mcreator.tnunlimited.block.LeadTrapdoorBlock;
import net.mcreator.tnunlimited.block.LeadSpikeBlockBlock;
import net.mcreator.tnunlimited.block.LeadOreBlock;
import net.mcreator.tnunlimited.block.LeadDoorBlock;
import net.mcreator.tnunlimited.block.LeadBarsBlock;
import net.mcreator.tnunlimited.block.IceRoseBlock;
import net.mcreator.tnunlimited.block.GlowingiceBlock;
import net.mcreator.tnunlimited.block.FrostAntEggSackBlock;
import net.mcreator.tnunlimited.block.DoneBlockBlock;
import net.mcreator.tnunlimited.block.DeepslateLeadOreBlock;
import net.mcreator.tnunlimited.block.DeepslateAntinomyOreBlock;
import net.mcreator.tnunlimited.block.DeepaardiumBlock;
import net.mcreator.tnunlimited.block.DaciteWallBlock;
import net.mcreator.tnunlimited.block.DaciteStairsBlock;
import net.mcreator.tnunlimited.block.DaciteSlabBlock;
import net.mcreator.tnunlimited.block.DaciteBricksWallBlock;
import net.mcreator.tnunlimited.block.DaciteBricksStairsBlock;
import net.mcreator.tnunlimited.block.DaciteBricksSlabBlock;
import net.mcreator.tnunlimited.block.DaciteBricksBlock;
import net.mcreator.tnunlimited.block.DaciteBlock;
import net.mcreator.tnunlimited.block.CrackedDaciteBricksBlock;
import net.mcreator.tnunlimited.block.CookieBlockBlock;
import net.mcreator.tnunlimited.block.CoffeePlantBlock;
import net.mcreator.tnunlimited.block.CoconutBlock;
import net.mcreator.tnunlimited.block.CobbledDaciteWallBlock;
import net.mcreator.tnunlimited.block.CobbledDaciteStairsBlock;
import net.mcreator.tnunlimited.block.CobbledDaciteSlabBlock;
import net.mcreator.tnunlimited.block.CobbledDaciteBlock;
import net.mcreator.tnunlimited.block.ChiseledLemonstoneBlock;
import net.mcreator.tnunlimited.block.ChiseledDaciteBricksBlock;
import net.mcreator.tnunlimited.block.CattailBlock;
import net.mcreator.tnunlimited.block.CakesplatterBlock;
import net.mcreator.tnunlimited.block.BlueShroomslateBlock;
import net.mcreator.tnunlimited.block.BlueShroomThronsBlock;
import net.mcreator.tnunlimited.block.BlueShroomStemBlock;
import net.mcreator.tnunlimited.block.BlueShroomRootsBlock;
import net.mcreator.tnunlimited.block.BlueShroomOreBlock;
import net.mcreator.tnunlimited.block.BlueShroomFungiBlock;
import net.mcreator.tnunlimited.block.BlueShroomBlockBlock;
import net.mcreator.tnunlimited.block.BlueLavanderBlock;
import net.mcreator.tnunlimited.block.BlockofrawleadBlock;
import net.mcreator.tnunlimited.block.BlockofAardiumBlock;
import net.mcreator.tnunlimited.block.BlockOfTitaniumBlock;
import net.mcreator.tnunlimited.block.BlockOfRoseGoldBlock;
import net.mcreator.tnunlimited.block.BlockOfRawTitaniumBlock;
import net.mcreator.tnunlimited.block.BlockOfRawRoseGoldBlock;
import net.mcreator.tnunlimited.block.BlockOfRawFerrotitaniumBlock;
import net.mcreator.tnunlimited.block.BlockOfRawAntimonyBlock;
import net.mcreator.tnunlimited.block.BlockOfRawAardiumBlock;
import net.mcreator.tnunlimited.block.BlockOfLeadBlock;
import net.mcreator.tnunlimited.block.BlockOfFerrotitaniumBlock;
import net.mcreator.tnunlimited.block.BlockOfAntimonyBlock;
import net.mcreator.tnunlimited.block.AntimonyOreBlock;
import net.mcreator.tnunlimited.block.AardiumoreBlock;
import net.mcreator.tnunlimited.TnunlimitedMod;

public class TnunlimitedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TnunlimitedMod.MODID);
	public static final RegistryObject<Block> AARDIUMORE = REGISTRY.register("aardiumore", () -> new AardiumoreBlock());
	public static final RegistryObject<Block> DEEPAARDIUM = REGISTRY.register("deepaardium", () -> new DeepaardiumBlock());
	public static final RegistryObject<Block> BLOCKOF_AARDIUM = REGISTRY.register("blockof_aardium", () -> new BlockofAardiumBlock());
	public static final RegistryObject<Block> BLOCK_OF_RAW_ROSE_GOLD = REGISTRY.register("block_of_raw_rose_gold", () -> new BlockOfRawRoseGoldBlock());
	public static final RegistryObject<Block> BLOCK_OF_ROSE_GOLD = REGISTRY.register("block_of_rose_gold", () -> new BlockOfRoseGoldBlock());
	public static final RegistryObject<Block> ZINC_ORE = REGISTRY.register("zinc_ore", () -> new ZincOreBlock());
	public static final RegistryObject<Block> ZINC_DEEPSLATE_ORE = REGISTRY.register("zinc_deepslate_ore", () -> new ZincDeepslateOreBlock());
	public static final RegistryObject<Block> ZINC_BLOCK = REGISTRY.register("zinc_block", () -> new ZincBlockBlock());
	public static final RegistryObject<Block> NETHER_RITHIUM_ORE = REGISTRY.register("nether_rithium_ore", () -> new NetherRithiumOreBlock());
	public static final RegistryObject<Block> RAW_RITHIUM_BLOCK = REGISTRY.register("raw_rithium_block", () -> new RawRithiumBlockBlock());
	public static final RegistryObject<Block> RITHIUM_BLOCK = REGISTRY.register("rithium_block", () -> new RithiumBlockBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = REGISTRY.register("deepslate_lead_ore", () -> new DeepslateLeadOreBlock());
	public static final RegistryObject<Block> BLOCKOFRAWLEAD = REGISTRY.register("blockofrawlead", () -> new BlockofrawleadBlock());
	public static final RegistryObject<Block> BLOCK_OF_LEAD = REGISTRY.register("block_of_lead", () -> new BlockOfLeadBlock());
	public static final RegistryObject<Block> ANTIMONY_ORE = REGISTRY.register("antimony_ore", () -> new AntimonyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ANTINOMY_ORE = REGISTRY.register("deepslate_antinomy_ore", () -> new DeepslateAntinomyOreBlock());
	public static final RegistryObject<Block> BLOCK_OF_RAW_ANTIMONY = REGISTRY.register("block_of_raw_antimony", () -> new BlockOfRawAntimonyBlock());
	public static final RegistryObject<Block> BLOCK_OF_ANTIMONY = REGISTRY.register("block_of_antimony", () -> new BlockOfAntimonyBlock());
	public static final RegistryObject<Block> NUBRIUM_ORE = REGISTRY.register("nubrium_ore", () -> new NubriumOreBlock());
	public static final RegistryObject<Block> NUBRIUM_BLOCK = REGISTRY.register("nubrium_block", () -> new NubriumBlockBlock());
	public static final RegistryObject<Block> SUPERGRANITE = REGISTRY.register("supergranite", () -> new SupergraniteBlock());
	public static final RegistryObject<Block> PURIFIEDENERGY = REGISTRY.register("purifiedenergy", () -> new PurifiedenergyBlock());
	public static final RegistryObject<Block> DONE_BLOCK = REGISTRY.register("done_block", () -> new DoneBlockBlock());
	public static final RegistryObject<Block> TITANIUMORE = REGISTRY.register("titaniumore", () -> new TitaniumoreBlock());
	public static final RegistryObject<Block> LEMONSTONE = REGISTRY.register("lemonstone", () -> new LemonstoneBlock());
	public static final RegistryObject<Block> POLISHED_LEMONSTONE = REGISTRY.register("polished_lemonstone", () -> new PolishedLemonstoneBlock());
	public static final RegistryObject<Block> CHISELED_LEMONSTONE = REGISTRY.register("chiseled_lemonstone", () -> new ChiseledLemonstoneBlock());
	public static final RegistryObject<Block> LEMONSTONE_SLAB = REGISTRY.register("lemonstone_slab", () -> new LemonstoneSlabBlock());
	public static final RegistryObject<Block> LEMONSTONE_STAIRS = REGISTRY.register("lemonstone_stairs", () -> new LemonstoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_LEMONSTONE_SLAB = REGISTRY.register("polished_lemonstone_slab", () -> new PolishedLemonstoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_LEMONSTONE_STAIRS = REGISTRY.register("polished_lemonstone_stairs", () -> new PolishedLemonstoneStairsBlock());
	public static final RegistryObject<Block> PALM_WOOD_WOOD = REGISTRY.register("palm_wood_wood", () -> new PalmWoodWoodBlock());
	public static final RegistryObject<Block> PALM_WOOD_LOG = REGISTRY.register("palm_wood_log", () -> new PalmWoodLogBlock());
	public static final RegistryObject<Block> COCONUT = REGISTRY.register("coconut", () -> new CoconutBlock());
	public static final RegistryObject<Block> BLUE_SHROOM_STEM = REGISTRY.register("blue_shroom_stem", () -> new BlueShroomStemBlock());
	public static final RegistryObject<Block> BLUE_SHROOM_BLOCK = REGISTRY.register("blue_shroom_block", () -> new BlueShroomBlockBlock());
	public static final RegistryObject<Block> GLOWINGICE = REGISTRY.register("glowingice", () -> new GlowingiceBlock());
	public static final RegistryObject<Block> COOKIE_BLOCK = REGISTRY.register("cookie_block", () -> new CookieBlockBlock());
	public static final RegistryObject<Block> DACITE = REGISTRY.register("dacite", () -> new DaciteBlock());
	public static final RegistryObject<Block> DACITE_SLAB = REGISTRY.register("dacite_slab", () -> new DaciteSlabBlock());
	public static final RegistryObject<Block> DACITE_STAIRS = REGISTRY.register("dacite_stairs", () -> new DaciteStairsBlock());
	public static final RegistryObject<Block> COBBLED_DACITE = REGISTRY.register("cobbled_dacite", () -> new CobbledDaciteBlock());
	public static final RegistryObject<Block> COBBLED_DACITE_SLAB = REGISTRY.register("cobbled_dacite_slab", () -> new CobbledDaciteSlabBlock());
	public static final RegistryObject<Block> COBBLED_DACITE_STAIRS = REGISTRY.register("cobbled_dacite_stairs", () -> new CobbledDaciteStairsBlock());
	public static final RegistryObject<Block> POLISHED_DACITE = REGISTRY.register("polished_dacite", () -> new PolishedDaciteBlock());
	public static final RegistryObject<Block> POLISHED_DACITE_SLAB = REGISTRY.register("polished_dacite_slab", () -> new PolishedDaciteSlabBlock());
	public static final RegistryObject<Block> POLISHED_DACITE_STAIRS = REGISTRY.register("polished_dacite_stairs", () -> new PolishedDaciteStairsBlock());
	public static final RegistryObject<Block> DACITE_BRICKS = REGISTRY.register("dacite_bricks", () -> new DaciteBricksBlock());
	public static final RegistryObject<Block> DACITE_BRICKS_SLAB = REGISTRY.register("dacite_bricks_slab", () -> new DaciteBricksSlabBlock());
	public static final RegistryObject<Block> DACITE_BRICKS_STAIRS = REGISTRY.register("dacite_bricks_stairs", () -> new DaciteBricksStairsBlock());
	public static final RegistryObject<Block> CRACKED_DACITE_BRICKS = REGISTRY.register("cracked_dacite_bricks", () -> new CrackedDaciteBricksBlock());
	public static final RegistryObject<Block> DACITE_WALL = REGISTRY.register("dacite_wall", () -> new DaciteWallBlock());
	public static final RegistryObject<Block> COBBLED_DACITE_WALL = REGISTRY.register("cobbled_dacite_wall", () -> new CobbledDaciteWallBlock());
	public static final RegistryObject<Block> POLISHED_DACITE_WALL = REGISTRY.register("polished_dacite_wall", () -> new PolishedDaciteWallBlock());
	public static final RegistryObject<Block> DACITE_BRICKS_WALL = REGISTRY.register("dacite_bricks_wall", () -> new DaciteBricksWallBlock());
	public static final RegistryObject<Block> COFFEE_PLANT = REGISTRY.register("coffee_plant", () -> new CoffeePlantBlock());
	public static final RegistryObject<Block> MIRESHROOM = REGISTRY.register("mireshroom", () -> new MireshroomBlock());
	public static final RegistryObject<Block> TALL_MIRESHROOM = REGISTRY.register("tall_mireshroom", () -> new TallMireshroomBlock());
	public static final RegistryObject<Block> OVERDRIVE_TABLE = REGISTRY.register("overdrive_table", () -> new OverdriveTableBlock());
	public static final RegistryObject<Block> SPAWNING_EYE = REGISTRY.register("spawning_eye", () -> new SpawningEyeBlock());
	public static final RegistryObject<Block> PLUSH_AARDVARKMAN = REGISTRY.register("plush_aardvarkman", () -> new PlushAardvarkmanBlock());
	public static final RegistryObject<Block> PLUSH_PURPLE_KNIGHT = REGISTRY.register("plush_purple_knight", () -> new PlushPurpleKnightBlock());
	public static final RegistryObject<Block> PLUSH_HIVEMASTER = REGISTRY.register("plush_hivemaster", () -> new PlushHivemasterBlock());
	public static final RegistryObject<Block> PLUSH_GLOWING_GOLEM = REGISTRY.register("plush_glowing_golem", () -> new PlushGlowingGolemBlock());
	public static final RegistryObject<Block> PLUSH_ANIME_RACOON = REGISTRY.register("plush_anime_racoon", () -> new PlushAnimeRacoonBlock());
	public static final RegistryObject<Block> PLUSH_STOATMAN = REGISTRY.register("plush_stoatman", () -> new PlushStoatmanBlock());
	public static final RegistryObject<Block> STRAWBERRY_BUSHSTAGE_4 = REGISTRY.register("strawberry_bushstage_4", () -> new StrawberryBushstage4Block());
	public static final RegistryObject<Block> STRAWBERRY_BUSHSTAGE_3 = REGISTRY.register("strawberry_bushstage_3", () -> new StrawberryBushstage3Block());
	public static final RegistryObject<Block> STRAWBERRY_BUSHSTAGE_0 = REGISTRY.register("strawberry_bushstage_0", () -> new StrawberryBushstage0Block());
	public static final RegistryObject<Block> STRAWBERRY_BUSHSTAGE_2 = REGISTRY.register("strawberry_bushstage_2", () -> new StrawberryBushstage2Block());
	public static final RegistryObject<Block> STRAWBERRY_BUSHSTAGE_1 = REGISTRY.register("strawberry_bushstage_1", () -> new StrawberryBushstage1Block());
	public static final RegistryObject<Block> CAKESPLATTER = REGISTRY.register("cakesplatter", () -> new CakesplatterBlock());
	public static final RegistryObject<Block> TANGELO_BLOSSOM = REGISTRY.register("tangelo_blossom", () -> new TangeloBlossomBlock());
	public static final RegistryObject<Block> ICE_ROSE = REGISTRY.register("ice_rose", () -> new IceRoseBlock());
	public static final RegistryObject<Block> BLUE_SHROOMSLATE = REGISTRY.register("blue_shroomslate", () -> new BlueShroomslateBlock());
	public static final RegistryObject<Block> SHROOM_GRASS = REGISTRY.register("shroom_grass", () -> new ShroomGrassBlock());
	public static final RegistryObject<Block> BLUE_SHROOM_FUNGI = REGISTRY.register("blue_shroom_fungi", () -> new BlueShroomFungiBlock());
	public static final RegistryObject<Block> BLUE_SHROOM_ROOTS = REGISTRY.register("blue_shroom_roots", () -> new BlueShroomRootsBlock());
	public static final RegistryObject<Block> BLUE_SHROOM_ORE = REGISTRY.register("blue_shroom_ore", () -> new BlueShroomOreBlock());
	public static final RegistryObject<Block> BLUE_SHROOM_THRONS = REGISTRY.register("blue_shroom_throns", () -> new BlueShroomThronsBlock());
	public static final RegistryObject<Block> PURPLE_LIGHTGLOW = REGISTRY.register("purple_lightglow", () -> new PurpleLightglowBlock());
	public static final RegistryObject<Block> CATTAIL = REGISTRY.register("cattail", () -> new CattailBlock());
	public static final RegistryObject<Block> BLUE_LAVANDER = REGISTRY.register("blue_lavander", () -> new BlueLavanderBlock());
	public static final RegistryObject<Block> PURPLE_SHROOMSLATE_STAIRS = REGISTRY.register("purple_shroomslate_stairs", () -> new PurpleShroomslateStairsBlock());
	public static final RegistryObject<Block> PURPLE_SHROOMSLATE_SLABS = REGISTRY.register("purple_shroomslate_slabs", () -> new PurpleShroomslateSlabsBlock());
	public static final RegistryObject<Block> FROST_ANT_EGG_SACK = REGISTRY.register("frost_ant_egg_sack", () -> new FrostAntEggSackBlock());
	public static final RegistryObject<Block> PURPLE_SHROOMSLATE_WALLS = REGISTRY.register("purple_shroomslate_walls", () -> new PurpleShroomslateWallsBlock());
	public static final RegistryObject<Block> PURPLE_COBBLE_SHROOMSLATE = REGISTRY.register("purple_cobble_shroomslate", () -> new PurpleCobbleShroomslateBlock());
	public static final RegistryObject<Block> PURPLE_COBBLE_SHROOMSLATE_SHAIRS = REGISTRY.register("purple_cobble_shroomslate_shairs", () -> new PurpleCobbleShroomslateShairsBlock());
	public static final RegistryObject<Block> PURPLE_COBBLE_SHROOMSLATE_SLAB = REGISTRY.register("purple_cobble_shroomslate_slab", () -> new PurpleCobbleShroomslateSlabBlock());
	public static final RegistryObject<Block> PURPLE_COBBLE_SHROOMSLATE_WALLS = REGISTRY.register("purple_cobble_shroomslate_walls", () -> new PurpleCobbleShroomslateWallsBlock());
	public static final RegistryObject<Block> LEAD_BARS = REGISTRY.register("lead_bars", () -> new LeadBarsBlock());
	public static final RegistryObject<Block> LEAD_SPIKE_BLOCK = REGISTRY.register("lead_spike_block", () -> new LeadSpikeBlockBlock());
	public static final RegistryObject<Block> LEAD_DOOR = REGISTRY.register("lead_door", () -> new LeadDoorBlock());
	public static final RegistryObject<Block> POLISHED_DACITE_PRESSURE_PLATE = REGISTRY.register("polished_dacite_pressure_plate", () -> new PolishedDacitePressurePlateBlock());
	public static final RegistryObject<Block> POLISHED_DACITE_BUTTON = REGISTRY.register("polished_dacite_button", () -> new PolishedDaciteButtonBlock());
	public static final RegistryObject<Block> LEAD_TRAPDOOR = REGISTRY.register("lead_trapdoor", () -> new LeadTrapdoorBlock());
	public static final RegistryObject<Block> STRIPPED_PALM_LOG = REGISTRY.register("stripped_palm_log", () -> new StrippedPalmLogBlock());
	public static final RegistryObject<Block> STRIPPED_PALM_WOOD_BLOCK = REGISTRY.register("stripped_palm_wood_block", () -> new StrippedPalmWoodBlockBlock());
	public static final RegistryObject<Block> PALM_PLANKS = REGISTRY.register("palm_planks", () -> new PalmPlanksBlock());
	public static final RegistryObject<Block> PALM_PRESSURE_PLATE = REGISTRY.register("palm_pressure_plate", () -> new PalmPressurePlateBlock());
	public static final RegistryObject<Block> PALM_BUTTON = REGISTRY.register("palm_button", () -> new PalmButtonBlock());
	public static final RegistryObject<Block> PALM_STAIRS = REGISTRY.register("palm_stairs", () -> new PalmStairsBlock());
	public static final RegistryObject<Block> PALM_PLANK_SLAB = REGISTRY.register("palm_plank_slab", () -> new PalmPlankSlabBlock());
	public static final RegistryObject<Block> PALM_FENCE = REGISTRY.register("palm_fence", () -> new PalmFenceBlock());
	public static final RegistryObject<Block> PALM_FENCE_GATE = REGISTRY.register("palm_fence_gate", () -> new PalmFenceGateBlock());
	public static final RegistryObject<Block> PALM_DOOR = REGISTRY.register("palm_door", () -> new PalmDoorBlock());
	public static final RegistryObject<Block> PALM_TRAPDOOR = REGISTRY.register("palm_trapdoor", () -> new PalmTrapdoorBlock());
	public static final RegistryObject<Block> CHISELED_DACITE_BRICKS = REGISTRY.register("chiseled_dacite_bricks", () -> new ChiseledDaciteBricksBlock());
	public static final RegistryObject<Block> QUEENS_ALTAR = REGISTRY.register("queens_altar", () -> new QueensAltarBlock());
	public static final RegistryObject<Block> QUEENS_ALTAR_ACTIVE = REGISTRY.register("queens_altar_active", () -> new QueensAltarActiveBlock());
	public static final RegistryObject<Block> BLOCK_OF_RAW_TITANIUM = REGISTRY.register("block_of_raw_titanium", () -> new BlockOfRawTitaniumBlock());
	public static final RegistryObject<Block> BLOCK_OF_TITANIUM = REGISTRY.register("block_of_titanium", () -> new BlockOfTitaniumBlock());
	public static final RegistryObject<Block> BLOCK_OF_RAW_AARDIUM = REGISTRY.register("block_of_raw_aardium", () -> new BlockOfRawAardiumBlock());
	public static final RegistryObject<Block> BLOCK_OF_RAW_FERROTITANIUM = REGISTRY.register("block_of_raw_ferrotitanium", () -> new BlockOfRawFerrotitaniumBlock());
	public static final RegistryObject<Block> BLOCK_OF_FERROTITANIUM = REGISTRY.register("block_of_ferrotitanium", () -> new BlockOfFerrotitaniumBlock());
	public static final RegistryObject<Block> PLAM_LEAVES = REGISTRY.register("plam_leaves", () -> new PlamLeavesBlock());
	public static final RegistryObject<Block> WET_SAND = REGISTRY.register("wet_sand", () -> new WetSandBlock());
	public static final RegistryObject<Block> SLOTS = REGISTRY.register("slots", () -> new SlotsBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			CoffeePlantBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			CoffeePlantBlock.itemColorLoad(event);
		}
	}
}
