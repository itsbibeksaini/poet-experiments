dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        mavenCentral()
    }
}

rootProject.name = "poet-experiments"

include(":projects:java-poet")
include(":projects:kotlin-poet")