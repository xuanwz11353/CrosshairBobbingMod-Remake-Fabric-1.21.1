package krash220.xbob.game.api;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;

public class Loader {

    public static String getPlatform() {
        return "Fabric";
    }

    public static String getVersion() {
        return FabricLoader.getInstance().getModContainer("minecraft")
            .map(c -> c.getMetadata().getVersion().getFriendlyString())
            .orElse("unknown");
    }

    public static boolean isClient() {
        return FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT;
    }
}
