plugins {
    id("ru.caravanlabs.elephants.convention.application")
}

kotlin {
    sourceSets {
        androidMain.dependencies {

        }
        commonMain.dependencies {

        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

dependencies {
    debugImplementation(libs.compose.uiTooling)
}

