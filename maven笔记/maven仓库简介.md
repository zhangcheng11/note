#### maven仓库简介

#### 一、作用

Maven仓库分为本地仓库和远程仓库，集中存放项目引用的jar包，无需将jar包放在程序中，结合Maven项目的pom.xml，使得项目管理jar包更容易，有以下几个优点：

- 对于项目来说，无需关心jar包存储问题，只管理好配置即可
- 易于搜索和使用jar包，不需要到网上到处找，仓库提供了几乎所有的jar包资源，并提供专业的搜索引擎，我们很容易就能找到我们所需的jar，并获取它的坐标信息，在Maven项目中增加相应的依赖即可，简单快捷
- 易于管理jar包版本，pom.xml中可以一目了然的看到jar包的版本，且可以通过相关配置来约束项目使用的jar包的版本
- 易于发现并排除jar包的依赖冲突，在传统方式管理jar包的情况下，如果出现多个jar包的依赖出现冲突的时候（如ssh相关的jar包），很难排除冲突和找到互相适应的版本，而使用Maven管理，这些将变的非常简单
- 管理自定义的jar包

​       有些jar包是我们自己开发的，我们也可以将其放在仓库里，供其他项目使用，Maven仓库使jar包的发布和管理变得简单和有效，且能有效的控制版本变更

#### 二、本地仓库

   本地仓库是远程仓库的一个缓冲和子集，当你构建Maven项目的时候，首先会从本地仓库查找资源，如果没有，那么Maven会从远程仓库下载到本地仓库，这样在下次使用的时候就不需要下载了。Maven缺省的本地仓库地址为${user.home}/.m2/repository，也可以在settings.xml文件中修改该地址

#### 三、远程仓库

   是指部署在远程的仓库，默认是Maven的中央仓库，也可以是Nexus仓库服务器

远程仓库拥有大量的jar包资源，运用Nexus可以在局域网搭建企业级的Maven仓库，下一章将会讲到

#### 四、仓库的配置

**1.Settings.xml中配置远程仓库**



```
<repositories>
        <repository>
          <id>jdk14</id>
          <name>Repository for JDK 1.4 builds</name>
          <url>http://www.myhost.com/maven/jdk14</url>
          <layout>default</layout>
          <snapshotPolicy>always</snapshotPolicy>
        </repository>
 </repositories>
```



**2.使用镜像，覆盖中央仓库的地址**

   有时候我们并不想从中央仓库下载，而是想直接从本地服务器仓库下，配置如下：

```
<mirrors>
     <mirror>
      <id>mirrorId</id>
      <mirrorOf>*</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://demo.shiyuesoft.com:8888/nexus-2.1.2/content/groups/public</url>
    </mirror>
  </mirrors>
```



**3.在Maven项目中pom.xml配置**



```
<!-- jar包仓库 -->
    <repositories>
        <repository>
            <id>nexus</id>
            <url>http://demo.shiyuesoft.com:8888/nexus-2.1.2/content/groups/public</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
    <!-- 插件仓库 -->
    <pluginRepositories>
        <pluginRepository>
            <id>nexus</id>
            <url>http://demo.shiyuesoft.com:8888/nexus-2.1.2/content/groups/public</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>
```















