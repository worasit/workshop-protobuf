# Workshop - Protocol Buffer 101

### Prerequisite

- Java 8
- [Protoc](https://github.com/google/protobuf-gradle-plugin)
- Docker
- Gradle

### Set up

- Install protoc gradle plugin https://github.com/google/protobuf-gradle-plugin
- Configure build.gradle
    ```kotlin
    apply plugin: 'com.google.protobuf'
      
    dependencies {
        implementation 'com.google.protobuf:protobuf-java:3.19.1'
        implementation 'com.google.protobuf:protobuf-java-util:3.19.1'
        implementation 'com.google.protobuf:protobuf-gradle-plugin:0.8.18'
        testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
        testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
    }
    
    buildscript {
       repositories {
           mavenCentral()
       }
       dependencies {
           classpath 'com.google.protobuf:protobuf-gradle-plugin:0.8.18'
       }
    }
    ```
- configure IntelliJ to build and compile proto files before running
  ![gradle run](/Users/worasit.daimongkol/Repositories/learning/workshop-protobuf/docs/img/gradle_compile_proto.png)