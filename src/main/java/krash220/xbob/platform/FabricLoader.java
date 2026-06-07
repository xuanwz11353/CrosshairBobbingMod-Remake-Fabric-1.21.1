package krash220.xbob.platform;

import java.lang.reflect.InvocationTargetException;

import net.fabricmc.api.ClientModInitializer;

public class FabricLoader implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        try {
            Class.forName("krash220.xbob.MainMod").getConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
