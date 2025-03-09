package fr.cyrilneveu.flatty;

import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = FlattyTags.MODID, version = FlattyTags.VERSION, name = FlattyTags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class Flatty {
    public static final Logger LOGGER = LogManager.getLogger(FlattyTags.MODID);
    public static WorldType flattyWorldType;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        flattyWorldType = new FlattyWorldType();
    }
}
