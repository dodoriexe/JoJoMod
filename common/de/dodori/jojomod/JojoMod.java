package de.dodori.jojomod;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = JojoMod.MOD_ID, name = JojoMod.MOD_NAME, version = JojoMod.VERSION, dependencies = JojoMod.DEPENDENCIES)
public class JojoMod {
	
	// Constants
	public static final String MOD_ID = "jojomod";
	public static final String MOD_NAME = "JoJo's Bizarre Adventure Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "";
	public static final String RESOURCE_PREFIX = MOD_ID + ":"; // "jojomod:"
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static JojoMod instance;
	
	@SidedProxy(clientSide = "de.dodori.jojomod.ClientProxy", serverSide = "de.dodori.jojomod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
}
