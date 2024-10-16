package exogenesis;

import mindustry.mod.*;
import exogenesis.util.util.Utils;
import exogenesis.content.ExoBlocks;
import exogenesis.content.ExoVanstarBlocks;
import exogenesis.content.ExoUnitTypes;
import exogenesis.content.ExoStatusEffects;
import exogenesis.content.*;
import mindustry.mod.Mod;
import mindustry.mod.Mods;
import exogenesis.gen.*;

public class
ExogenesisMod extends Mod{
    public static Mods.LoadedMod modInfo;
    @Override
    public void loadContent(){
        EntityRegistry.register();
        Utils.init();
        ExoStatusEffects.load();
        ExoAttribute.load();
        ExoSounds.load();
        ExoUnitTypes.load();
        ExoLiquids.load();
        ExoItems.load();
        ExoEnvironmentBlocks.load();
        ExoBlocks.load();
        ExoVanstarBlocks.load();
        TypeMultipliers.load();
        ExoPlanets.load();
        ExoVanstarTechTree.load();
    }
}
