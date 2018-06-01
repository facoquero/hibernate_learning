plugins {
    java
}

group = "hibernate-first"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("mysql", "mysql-connector-java", "5.1.46")
    compile("org.hibernate", "hibernate-core", "5.3.1.Final")
    compile("org.slf4j", "slf4j-api", "1.7.25")
    compile("org.slf4j","slf4j-log4j12", "1.7.25")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}