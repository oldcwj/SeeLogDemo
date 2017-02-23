# SeeLogDemo
Android字节码插桩, 实现用户点击界面采集数据,将采集的数据保存到SD卡, 保存的文件路径是package


## Steps
### Get Gradle Plugin

1. add following to the build.gradle of your root project.
>classpath 'com.oldcwj.seelogplugin:seelogplugin:0.9.7'

	build.gradle maybe look like this:
	
	```
	buildscript {
	    repositories {
	        jcenter()
	    }
	    dependencies {
	        classpath 'com.android.tools.build:gradle:2.2.0'
	        classpath 'com.oldcwj.seelogplugin:seelogplugin:0.9.7'
	    }
	}
	```
2. add following to your build.gradle:

	>apply plugin: "com.oldcwj.seelog.SeeLogPlugin"

### Get SeeLog SDK

* gradle dependency:

	```	
	dependencies {
		compile 'com.oldcwj.seelog:seelog:1.0.9'
	}
	```