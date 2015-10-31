# AndroidLibraryDemo

###this project demonstrate how to use android Library and publish it into maven control center.

###1.create a library and use it in your own project

####1.1create a new android project
####1.2create a new library module
file->new->new module...->android library->..finish

in android studio, project is composed with modules.

the default app module is compiled with: `apply plugin: 'com.android.application'`,

the library module is compiled with : `apply plugin: 'com.android.library'`

every build config is written in the build.gradle under each module and the root project.

write your library source code in your library module, you can use it in your own project,
such as, you can use it in app module 
```java
dependencies {
    compile project(':mylibrary')
}
```

###2.publish your library
you can publish your library into maven control. you can use official maven repository or jcenter, but
it is complicated.
in this project we use github as our maven repository.

####2.1 register a account in [jitpack](https://jitpack.io/)
recommend you use your github account to login
####2.2 edit build.gradle
- in your root `build.gradle`
```java
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:1.3.0'

        //this is for jitpack
        classpath 'com.github.dcendents:android-maven-gradle-plugin:1.3'
    }
}
```
- in your library `build.gradle`
add following lines:
```java
apply plugin: 'com.github.dcendents.android-maven'
```
####2.3 share your project on github
remember to upload gradle/wrapper folder to repo
####2.4 add release version control 
####2.5 generate maven reference
input your github repo site into  https://jitpack.io/

you can see the version and commit reference script

now you've published your library into maven control.

others can use your library by following the reference script

###reference
https://jitpack.io/docs/ANDROID/

https://github.com/blog/1547-release-your-software








