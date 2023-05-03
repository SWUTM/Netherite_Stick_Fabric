package net.swutm.netheritestick;

import net.fabricmc.api.ClientModInitializer;
import net.swutm.netheritestick.util.ModModelPredicateProvider;

public class netheritestickClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();

    }
}
