package tech.wiberg.isoores;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ISOOres.MODID, version = ISOOres.VERSION)
public class ISOOres
{
    public static final String MODID = "isoores";
    public static final String VERSION = "1.0";
    public static final String NAME = "ISO Ores";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        System.out.println("ISO Ores works!");
    }
}
