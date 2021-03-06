package biomesoplenty.common.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;

public class BOPConfigurationIDs
{
	public static Configuration config;
	
	public static int promisedLandDimID;

	//Biome IDs
	public static int alpsID;
	public static int alpsForestID;
	public static int alpsBaseID;
	public static int arcticID;
	public static int autumnHillsID;
	public static int badlandsID;
	public static int bambooForestID;
	public static int bayouID;

	public static int beachGravelID;
	public static int beachOvergrownID;

	public static int birchForestID;
	public static int bogID;
	public static int borealForestID;
	public static int brushlandID;
	public static int canyonID;
	public static int canyonRavineID;
	public static int chaparralID;
	public static int cherryBlossomGroveID;
	public static int coniferousForestID;
	public static int coniferousForestSnowID;
	public static int cragID;
	public static int deadForestID;
	public static int deadForestSnowID;
	public static int deadSwampID;
	public static int deadlandsID;
	public static int deciduousForestID;
	public static int dunesID;
	public static int fenID;
	public static int flowerFieldID;
	public static int frostForestID;
	public static int fungiForestID;
	public static int gardenID;
	public static int glacierID;
	public static int grasslandID;
	public static int groveID;
	public static int heathlandID;
	public static int highlandID;
	public static int hotSpringsID;
	public static int icyHillsID;
	public static int jadeCliffsID;
	public static int lavenderFieldsID;
	public static int lushDesertID;
	public static int lushSwampID;
	public static int mangroveID;
	public static int mapleWoodsID;
	public static int marshID;
	public static int meadowID;
	public static int meadowForestID;
	public static int mesaID;
	public static int moorID;
	public static int mountainID;
	public static int mysticGroveID;
	public static int mysticGroveThinID;

	public static int netherBaseID;
	public static int netherGardenID;
	public static int netherDesertID;
	public static int netherLavaID;
	public static int netherBoneID;
	public static int netherBloodID;

	public static int oasisID;

	public static int oceanAbyssID;
	public static int oceanCoralID;
	public static int oceanKelpID;

	public static int ominousWoodsID;
	public static int ominousWoodsThickID;
	public static int orchardID;
	public static int originValleyID;
	public static int outbackID;
	public static int overgrownGreensID;
	public static int pastureID;
	public static int pastureMeadowID;
	public static int pastureThinID;
	public static int polarID;
	public static int prairieID;

	public static int wonderousWoodsID;
	public static int majesticMeadowID;
	public static int promisedLandShrubID;
	public static int blessedBogID;

	public static int quagmireID;
	public static int rainforestID;
	public static int redwoodForestID;
	public static int reefID;
	public static int sacredSpringsID;
	public static int savannaID;
	public static int savannaPlateauID;
	public static int scrublandID;
	public static int seasonalForestID;
	public static int seasonalSpruceForestID;
	public static int shieldID;
	public static int shoreID;
	public static int shrublandID;
	public static int shrublandForestID;
	public static int silkgladesID;
	public static int sludgepitID;
	public static int spruceWoodsID;
	public static int steppeID;
	public static int temperateRainforestID;
	public static int thicketID;
	public static int timberID;
	public static int timberThinID;
	public static int tropicalRainforestID;
	public static int tropicsID;
	public static int tropicsMountainID;
	public static int tundraID;
	public static int volcanoID;
	public static int wastelandID;
	public static int wetlandID;
	public static int woodlandID;

	public static int entityMudballID;
	public static int entityDartID;
	public static int entityPoisonDartID;

	public static int jungleSpiderID;
	public static int rosesterID;
	public static int globID;
	public static int phantomID;
	public static int waspID;
	public static int birdID;
	public static int pixieID;
	
	public static void init(File configFile)
	{
		config = new Configuration(configFile);

		try
		{
			config.load();
			
			promisedLandDimID = config.get("Dimension Settings", "Promised Land Dimension ID", 20, null).getInt();
			
			//Mob IDs
			jungleSpiderID = config.get("Mob IDs", "Jungle Spider ID", 101, null).getInt();
			rosesterID = config.get("Mob IDs", "Rosester ID", 102, null).getInt();
			globID = config.get("Mob IDs", "Glob ID", 106, null).getInt();
			phantomID = config.get("Mob IDs", "Phantom ID", 107, null).getInt();
	        waspID = config.get("Mob IDs", "Wasp ID", 108, null).getInt();
	        birdID = config.get("Mob IDs", "Bird ID", 109, null).getInt();
	        pixieID = config.get("Mob IDs", "Pixie ID", 110, null).getInt();

			//Projectile IDs
			entityMudballID = config.get("Entity IDs", "Mudball ID", 103, null).getInt();;
			entityDartID = config.get("Entity IDs", "Dart ID", 104, null).getInt();;
			entityPoisonDartID = config.get("Entity IDs", "Poison Dart ID", 105, null).getInt();;

			//23-79 ExtraBiomesXL

			promisedLandShrubID = config.get("Biome IDs", "Sublime Shrubland (Promised Land) ID", 53).getInt();
			mysticGroveThinID = config.get("Biome IDs", "Thinned Mystic Grove (Sub-Biome) ID", 54).getInt();
			netherBloodID = config.get("Biome IDs", "Bloody Heap (Nether) ID", 55).getInt();
			lavenderFieldsID = config.get("Biome IDs", "Lavender Fields ID", 56).getInt();
			tropicsMountainID = config.get("Biome IDs", "Tropics Mountain (Sub-Biome) ID", 57).getInt();
			autumnHillsID = config.get("Biome IDs", "Autumn Hills ID", 58).getInt();
			overgrownGreensID = config.get("Biome IDs", "Overgrown Greens ID", 59).getInt();
			silkgladesID = config.get("Biome IDs", "Silkglades ID", 60).getInt();
			savannaPlateauID = config.get("Biome IDs", "Savanna Plateau (Sub-Biome) ID", 61).getInt();
			seasonalSpruceForestID = config.get("Biome IDs", "Seasonal Spruce Forest (Sub-Biome) ID", 62).getInt();
			alpsBaseID = config.get("Biome IDs", "Alps Forest (Sub-Biome) ID", 63).getInt();
			alpsForestID = config.get("Biome IDs", "Alps Mountainside (Sub-Biome) ID", 64).getInt();
			timberThinID = config.get("Biome IDs", "Thinned Timber (Sub-Biome) ID", 65).getInt();
			pastureThinID = config.get("Biome IDs", "Thinned Pasture (Sub-Biome) ID", 66).getInt();
			pastureMeadowID = config.get("Biome IDs", "Pasture Meadow (Sub-Biome) ID", 67).getInt();
			ominousWoodsThickID = config.get("Biome IDs", "Thick Ominous Woods (Sub-Biome) ID", 68).getInt();
			shrublandForestID = config.get("Biome IDs", "Thick Shrubland (Sub-Biome) ID", 69).getInt();
			canyonRavineID = config.get("Biome IDs", "Canyon Ravine (Sub-Biome) ID", 70).getInt();
			meadowForestID = config.get("Biome IDs", "Meadow Forest (Sub-Biome) ID", 71).getInt();

			oceanAbyssID = config.get("Biome IDs", "Oceanic Abyss (Ocean) ID", 72).getInt();
			oceanCoralID = config.get("Biome IDs", "Coral Reef (Ocean) ID", 73).getInt();
			oceanKelpID = config.get("Biome IDs", "Kelp Forest (Ocean) ID", 74).getInt();

			beachGravelID = config.get("Biome IDs", "Gravel Beach ID", 75).getInt();
			beachOvergrownID = config.get("Biome IDs", "Overgrown Beach ID", 76).getInt();

			wonderousWoodsID = config.get("Biome IDs", "Wonderous Woods (Promised Land) ID", 77).getInt();
			majesticMeadowID = config.get("Biome IDs", "Majestic Meadow (Promised Land) ID", 78).getInt();
			blessedBogID = config.get("Biome IDs", "Blessed Bog (Promised Land) ID", 79).getInt();

			netherBaseID = config.get("Biome IDs", "Nether Base (Nether) ID", 80).getInt();
			netherGardenID = config.get("Biome IDs", "Undergarden (Nether) ID", 81).getInt();
			netherDesertID = config.get("Biome IDs", "Corrupted Sands (Nether) ID", 82).getInt();
			netherLavaID = config.get("Biome IDs", "Phantasmagoric Inferno (Nether) ID", 83).getInt();
			netherBoneID = config.get("Biome IDs", "Boneyard (Nether) ID", 84).getInt();

			//70-87 Twilight Forest < Changed on their end?

			//80-159 Better World Generation 4 < Changed on their end?
			
			//160-161 BuildCraft Oil Fields
			
			//162-169 Thaumcraft

			alpsID = config.get("Biome IDs", "Alps ID", 177).getInt();
			arcticID = config.get("Biome IDs", "Arctic ID", 178).getInt();
			badlandsID = config.get("Biome IDs", "Badlands ID", 179).getInt();
			bambooForestID = config.get("Biome IDs", "Bamboo Forest ID", 180).getInt();
			bayouID = config.get("Biome IDs", "Bayou ID", 181).getInt();
			birchForestID = config.get("Biome IDs", "Birch Forest ID", 182).getInt();
			bogID = config.get("Biome IDs", "Bog ID", 183).getInt();
			borealForestID = config.get("Biome IDs", "Boreal Forest ID", 184).getInt();
			brushlandID = config.get("Biome IDs", "Brushland ID", 185).getInt();
			canyonID = config.get("Biome IDs", "Canyon ID", 186).getInt();
			chaparralID = config.get("Biome IDs", "Chaparral ID", 187).getInt();
			cherryBlossomGroveID = config.get("Biome IDs", "Cherry Blossom Grove ID", 188).getInt();
			coniferousForestID = config.get("Biome IDs", "Coniferous Forest ID", 189).getInt();
			coniferousForestSnowID = config.get("Biome IDs", "Coniferous Forest (Snow) ID", 190).getInt();
			cragID = config.get("Biome IDs", "Crag ID", 191).getInt();
			deadForestID = config.get("Biome IDs", "Dead Forest ID", 192).getInt();
			deadForestSnowID = config.get("Biome IDs", "Dead Forest (Snow) ID", 193).getInt();
			deadSwampID = config.get("Biome IDs", "Dead Swamp ID", 194).getInt();
			deadlandsID = config.get("Biome IDs", "Deadlands ID", 195).getInt();
			deciduousForestID = config.get("Biome IDs", "Deciduous Forest ID", 196).getInt();
			dunesID = config.get("Biome IDs", "Dunes ID", 197).getInt();
			fenID = config.get("Biome IDs", "Fen ID", 198).getInt();
			flowerFieldID = config.get("Biome IDs", "Flower Field ID", 199).getInt();
			frostForestID = config.get("Biome IDs", "Frost Forest ID", 200).getInt();
			fungiForestID = config.get("Biome IDs", "Fungi Forest ID", 201).getInt();
			gardenID = config.get("Biome IDs", "Garden ID", 202).getInt();
			glacierID = config.get("Biome IDs", "Glacier ID", 203).getInt();
			grasslandID = config.get("Biome IDs", "Grassland ID", 204).getInt();
			groveID = config.get("Biome IDs", "Grove ID", 205).getInt();
			heathlandID = config.get("Biome IDs", "Heathland ID", 206).getInt();
			
			//207-209 left for Mo Creatures
			
			highlandID = config.get("Biome IDs", "Highland ID", 210).getInt();
			hotSpringsID = config.get("Biome IDs", "Hot Springs ID", 211).getInt();
			icyHillsID = config.get("Biome IDs", "Icy Hills ID", 212).getInt();
			jadeCliffsID = config.get("Biome IDs", "Jade Cliffs ID", 213).getInt();
			lushDesertID = config.get("Biome IDs", "Lush Desert ID", 214).getInt();
			lushSwampID = config.get("Biome IDs", "Lush Swamp ID", 215).getInt();
			mangroveID = config.get("Biome IDs", "Mangrove ID", 216).getInt();

			mapleWoodsID = config.get("Biome IDs", "Maple Woods ID", 217).getInt();
			marshID = config.get("Biome IDs", "Marsh ID", 218).getInt();
			meadowID = config.get("Biome IDs", "Meadow ID", 219).getInt();
			mesaID = config.get("Biome IDs", "Mesa ID", 220).getInt();
			moorID = config.get("Biome IDs", "Moor ID", 221).getInt();
			mountainID = config.get("Biome IDs", "Mountain ID", 222).getInt();
			mysticGroveID = config.get("Biome IDs", "Mystic Grove ID", 223).getInt();
			oasisID = config.get("Biome IDs", "Oasis ID", 224).getInt();
			ominousWoodsID = config.get("Biome IDs", "Ominous Woods ID", 225).getInt();
			orchardID = config.get("Biome IDs", "Orchard ID", 226).getInt();
			originValleyID = config.get("Biome IDs", "Origin Valley ID", 227).getInt();
			outbackID = config.get("Biome IDs", "Outback ID", 228).getInt();
			pastureID = config.get("Biome IDs", "Pasture ID", 229).getInt();
			polarID = config.get("Biome IDs", "Polar ID", 230).getInt();
			prairieID = config.get("Biome IDs", "Prairie ID", 231).getInt();
			quagmireID = config.get("Biome IDs", "Quagmire ID", 232).getInt();
			rainforestID = config.get("Biome IDs", "Rainforest ID", 233).getInt();
			redwoodForestID = config.get("Biome IDs", "Redwood Forest ID", 234).getInt();
			sacredSpringsID = config.get("Biome IDs", "Sacred Springs ID", 235).getInt();
			savannaID = config.get("Biome IDs", "Savanna ID", 236).getInt();
			scrublandID = config.get("Biome IDs", "Scrubland ID", 237).getInt();
			seasonalForestID = config.get("Biome IDs", "Seasonal Forest ID", 238).getInt();
			shieldID = config.get("Biome IDs", "Shield ID", 239).getInt();
			shoreID = config.get("Biome IDs", "Shore ID", 240).getInt();
			shrublandID = config.get("Biome IDs", "Shrubland ID", 241).getInt();
			sludgepitID = config.get("Biome IDs", "Sludgepit ID", 242).getInt();
			spruceWoodsID = config.get("Biome IDs", "Spruce Woods ID", 243).getInt();
			steppeID = config.get("Biome IDs", "Steppe ID", 244).getInt();
			temperateRainforestID = config.get("Biome IDs", "Temperate Rainforest ID", 245).getInt();
			thicketID = config.get("Biome IDs", "Thicket ID", 246).getInt();
			timberID = config.get("Biome IDs", "Timber ID", 247).getInt();
			tropicalRainforestID = config.get("Biome IDs", "Tropical Rainforest ID", 248).getInt();
			tropicsID = config.get("Biome IDs", "Tropics ID", 249).getInt();
			tundraID = config.get("Biome IDs", "Tundra ID", 250).getInt();
			volcanoID = config.get("Biome IDs", "Volcano ID", 251).getInt();
			wastelandID = config.get("Biome IDs", "Wasteland ID", 252).getInt();
			wetlandID = config.get("Biome IDs", "Wetland ID", 253).getInt();
			woodlandID = config.get("Biome IDs", "Woodland ID", 254).getInt();
		}
		catch (Exception e)
		{
			FMLLog.log(Level.ERROR, e, "Biomes O Plenty has had a problem loading its configuration");
		}
		finally
		{
			if (config.hasChanged()) 
			{
				config.save();
			}
		}
	}
}
