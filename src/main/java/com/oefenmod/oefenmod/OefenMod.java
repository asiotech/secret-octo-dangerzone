package com.oefenmod.oefenmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = OefenMod.MODID, version = OefenMod.VERSION, name = OefenMod.NAME)
public class OefenMod 
{
	public static final String MODID = "OefenMod";
	public static final String VERSION = "0.0.1";
	public static final String NAME = "Oefen";

	 @Instance
     public static OefenMod instance = new OefenMod();
	
	 /**
      * Run before anything else. Read your config, create blocks, items, etc, and 
      * register them with the GameRegistry.
      */
     @EventHandler
     public void preInit(FMLPreInitializationEvent e) 
     {
    	 System.out.println("Called method: preInit");
     }
	 
     /**
      * Do your mod setup. Build whatever data structures you care about. Register recipes.
      * Register new Handler
      */
     @EventHandler
     public void init(FMLInitializationEvent e) 
     {
    	 System.out.println("Called method: init");
     }
	
     /**
      * Handle interaction with other mods, complete your setup based on this.
      */
     @EventHandler
     public void postInit(FMLPostInitializationEvent e) 
     {
    	 System.out.println("Called method: postInit");
     }
	
}
