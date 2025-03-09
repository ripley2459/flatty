package fr.cyrilneveu.flatty;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlattyWorldType extends WorldType {
    public FlattyWorldType() {
        super("flatty");
    }

    @Override
    public IChunkGenerator getChunkGenerator(World world, String generatorOptions) {
        return new FlattyOverworldGenerator(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), generatorOptions);
    }

    @Override
    public boolean isCustomizable() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasInfoNotice() {
        return true;
    }
}
