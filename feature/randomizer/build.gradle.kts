plugins {
    id("ru.caravanlabs.elephants.convention.mobilefeature")
}

kotlin {
    sourceSets {
        commonMain.dependencies {

        }

        androidMain.dependencies {

        }

        iosMain.dependencies {

        }
    }
}

compose.resources {
    publicResClass = true
    generateResClass = auto
}