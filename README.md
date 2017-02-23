# SeeLogDemo
这个demo演示了如何用[SeeLogPlugin](https://github.com/oldcwj/SeeLogPlugin)和[SeeLog](https://github.com/oldcwj/SeeLog)两个库实现对Android字节码插桩, 实现用户点击界面采集数据,将采集的数据保存到SD卡, 路径是应用程序的包名
如:/sdcard/seelog.oldcwj.com.seelogdemo/log/2017-x-xx.txt

这里主要对用户在某个时间点点击Activity中的某个位置做了记录,
将所有的记录通过时间串起来,可以分析用户对app的使用习惯

用到两个库:
SeeLogPlugin:[SeeLogPlugin](https://github.com/oldcwj/SeeLogPlugin) gradle插件,用于编译阶段修改字节码
SeeLog:[SeeLog](https://github.com/oldcwj/SeeLog) 用于保存log

用法非常简单,只需要配置就可以,对java代码毫无侵入性

## 使用步骤如下
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
	
## TODO

	用户行为明文保存到了SD卡,需要对内容加密