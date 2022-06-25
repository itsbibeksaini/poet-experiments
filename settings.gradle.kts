buildscript{
    repositories{
        gradlePluginPortal()
        mavenCentral()
    }

    dependencies{

    }
}

rootProject.name = "poet-experiments"

include(":projects:java-poet")
include(":projects:kotlin-poet")