rootProject.name = "gradle-version-catalogs"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("quarkus") {
            from(files("gradle/quarkus.versions.toml"))
        }
    }
}
