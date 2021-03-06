package biomesoplenty.common.biomes;

import java.util.HashMap;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;
import biomesoplenty.api.BOPBlockHelper;
import biomesoplenty.common.world.features.WorldGenBOPFlora;
import biomesoplenty.common.world.features.WorldGenBOPTallGrass;
import biomesoplenty.common.world.features.trees.WorldGenBrush1;
import biomesoplenty.common.world.features.trees.WorldGenBrush2;
import biomesoplenty.common.world.features.trees.WorldGenMiniShrub;

public class BiomeGenBrushland extends BOPBiome
{
	private static final Height biomeHeight = new Height(0.1F, 0.2F);
	
	public BiomeGenBrushland(int id)
	{
		super(id);
		
        //TODO: setHeight()
        this.setHeight(biomeHeight);
        //TODO:	setColor()
        this.setColor(13222271);
        this.setTemperatureRainfall(2.0F, 0.05F);

		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 6;
		this.theBiomeDecorator.flowersPerChunk = -999;
		
	    this.bopWorldFeatures.bopFlowersPerChunk = 5;
		this.bopWorldFeatures.thornsPerChunk = 4;
		this.bopWorldFeatures.shrubsPerChunk = 30;
		this.bopWorldFeatures.waterReedsPerChunk = 2;
		this.bopWorldFeatures.generateQuicksand = true;
	}

	@Override
	//TODO:						getRandomWorldGenForTrees()
	public WorldGenAbstractTree func_150567_a(Random random)
	{
		return random.nextInt(2) == 0 ? new WorldGenBrush2(Blocks.log, Blocks.leaves, 3, 0, Blocks.grass) : (random.nextInt(5) == 0 ?  new WorldGenBrush1() : new WorldGenMiniShrub(Blocks.log, Blocks.leaves, 0, 0, Blocks.grass, Blocks.sand));
	}
	
    @Override
    public HashMap<WorldGenBOPFlora, Integer> getWeightedWorldGenForBOPFlowers()
    {
        HashMap<WorldGenBOPFlora, Integer> flowerMap = new HashMap();
        
        flowerMap.put(new WorldGenBOPFlora(Blocks.red_flower, 2), 5);
        
        return flowerMap;
    }
	
    @Override
	public HashMap<WorldGenerator, Double> getWeightedWorldGenForGrass()
    {
    	HashMap<WorldGenerator, Double> grassMap = new HashMap();
    	
    	grassMap.put(new WorldGenBOPTallGrass(BOPBlockHelper.get("foliage"), 10), 0.5D);
    	grassMap.put(new WorldGenBOPTallGrass(BOPBlockHelper.get("foliage"), 11), 0.5D);
    	grassMap.put(new WorldGenBOPTallGrass(Blocks.tallgrass, 1), 1D);
    	
    	return grassMap;
    }

	@Override
	//TODO:		getBiomeGrassColor()
    public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_)
    {
		return 13222271;
	}

	@Override
	//TODO:		getBiomeFoliageColor()
	public int getBiomeFoliageColor(int x, int y, int z)
	{
		return 11716223;
	}
}
