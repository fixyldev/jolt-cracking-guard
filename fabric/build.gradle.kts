plugins {
    id("loader-conventions")
    id("net.fabricmc.fabric-loom") version BuildConfig.FABRIC_LOOM_VERSION
}

dependencies {
    minecraft("com.mojang:minecraft:${BuildConfig.MINECRAFT_VERSION}")
    implementation("net.fabricmc:fabric-loader:${BuildConfig.FABRIC_LOADER_VERSION}")
}

loom {
    runConfigs {
        named("client") {
            client()
            displayName = "Fabric - Client"
            generateRunConfig = true
        }

        configureEach {
            runDirectory = rootDir.resolve("run")
        }
    }
}

expandTemplates {
    expand("version", BuildConfig.MOD_VERSION)
}
