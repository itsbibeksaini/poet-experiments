pluginManagement{
    repositories{
        gradlePluginPortal()
        mavenCentral()
    }
    plugins{
    }
}

rootProject.name = "poet-experiments"

include(":projects:java-poet")
include(":projects:kotlin-poet")