plugins {
    id("common-conventions")
    id("net.fabricmc.fabric-loom") version BuildConfig.FABRIC_LOOM_VERSION
}

dependencies {
    minecraft("com.mojang:minecraft:${BuildConfig.MINECRAFT_VERSION}")
    compileOnly("net.fabricmc:fabric-loader:${BuildConfig.FABRIC_LOADER_VERSION}")
}

loom {
    runConfigs.clear()
}
