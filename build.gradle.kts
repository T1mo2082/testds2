buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        // Add this for ConstraintLayout support
        implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

        // Add this for Google's Material Design 3 components
        implementation 'com.google.android.material:material:1.11.0'
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath(kotlin("gradle-plugin", version = "1.4.30"))
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.3")
        classpath("com.akaita.android:easylauncher:1.3.1")
    }
}

allprojects {
    repositories {
        google()
        maven { url = uri("https://jitpack.io") }
        jcenter()
    }
}

tasks.register("clean", Delete::class.java, Action<Delete> {
    delete(rootProject.buildDir)
})
