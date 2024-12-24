// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.instabug.library") version "14.0.0" apply false // optional, only add if using any Instabug plugins

}
buildscript {
    dependencies {
        classpath( "com.instabug.library:instabug-plugin:14.0.0")
    }
}