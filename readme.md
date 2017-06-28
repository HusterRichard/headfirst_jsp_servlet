## 目的 ##
	web app开发入门学习，利用java的servlet技术，写一个小demo，端到端的实现一个web小应用。
	包括工程构建，编码，调试，编译打包，发布到tomcat（部署）等。
	
	这也是《Head First Servlet&JSP》这本书中的例子。

## 基本操作 ##
### 1.工程构建 ###
	step1.运行gradle脚本：
	$ ./1.dev.bat，生成web项目的工程文件
	
	step2.导入eclipse

### 2.调试 ###
	step1.下载tomcat
	
	step2.将工程导入至eclipse
	
	step3.创建tomcat server，将该web应用添加到服务，并发布到tomcat
	
	step4.debug运行tomcat服务
	
	step5.以“ch1”为例，测试url是：http://localhost:8080/ch1/Serv1

### 3.部署 ###
	step1.运行gradle脚本：
	$ ./2.build.bat，生成war包
	
	step2.以“ch1”为例，将./ch1/build/ch1.war拷贝至tomact/webapp目录
	
	step3.清除之前使用eclipse手动发布在tomcat/wtpwebapp目录下的server
	
	step4.运行tomcat服务：tomcat/bin/startup.bat
	
	step5.以“ch1”为例，测试url：http://localhost:8080/ch1/Serv1

## 关键点 ##
### 1.如果构建一个web project ###
	在build.gradle中添加插件：apply plugin: 'eclipse-wtp'

### 2.如何打包成一个war包 ###
	在build.gradle中添加插件：apply plugin: 'war'
	
### 3.web项目文件的目录结构 ###
	源代码：src/main/java
	资源文件：src/main/resources
	web配置文件：src/main/webapp
	
## Reference ##
	https://zhidao.baidu.com/question/144979919.html
	
	https://github.com/mike-neck/gradle-sample-web

	https://my.oschina.net/u/1177710/blog/270406