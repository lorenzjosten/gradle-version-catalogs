group = "de.lj"
version = "1.0-SNAPSHOT"

plugins {
    `version-catalog`
    `maven-publish`
}

repositories {
    gradlePluginPortal()
}

publishing {
    publications {
        create<MavenPublication>("quarkus") {
            println("Version Catalogs:")
            versionCatalogs.catalogNames.forEach { println(it) }
            from(components["versionCatalog"])
        }
    }
}