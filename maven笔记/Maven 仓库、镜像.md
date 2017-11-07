#### Maven 仓库、镜像

摘要: 项目构建工具Maven的学习笔记，主要讲解Maven 的仓库、镜像 相关信息

### **1、仓库中jar包定位**

​    在maven世界中任何一个依赖、插件或者项目构建的输出都可以称为构件，任何一个构件都有一个坐标作为唯一的标识。

这个坐标就是：group、artifactId、version；根据这个坐标就可以定义其在仓库的唯一存储路径，那么就可以在项目中引用。

 ```xml
 	<groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.10</version>
 ```



### **2、Maven仓库原理**

​    Maven仓库是基于简单文件系统存储的，只要在文件系统中没有发现相关的文件，说明这几依赖并不存在，因此，我们很容易在本地仓库查找具体的依赖是否存在。

### **3、仓库的分类信息（本地仓库、远程仓库）**

​    1）本地仓库就是我们自己机器上的文件系统，所以他是唯一的，项目构建时首先在本地仓库查找依赖，如果本地没有依赖时才会去寻找远程仓库。

​    2）远程仓库指的是非本地的其他所有仓库，中央仓库、私服等都是远程仓库的一种。如果本地仓库没有项目构建需要的构件，你们就会从远程仓库下载，可是远程仓库如果也没有的话，你们就会项目报错。

![img](http://static.oschina.net/uploads/space/2015/0718/225147_LGR8_1989321.png)



### **4、本地仓库设置**

`<localRepository>D:\Program Files\apache-maven-3.2.2-repository</localRepository>`

安装的时候有个一conf/settings.xml文件，这个文件时全局控制文件，另外，还有一个就是C:\Users\Heweipo\.m2 下面也会有一个settings.xml文件，这个代表的是个人局部配置文件，然而，我们使用Eclipse默认采用这个settings.xml文件，可以通过如下截图修改：

![img](http://static.oschina.net/uploads/space/2015/0718/225215_8zCv_1989321.png)



### **5、中央仓库**

​    Maven必须知道至少一个可用的远程仓库，才能执行Maven命令的时候下载到需要的构件。中央仓库就是这样一个默认的远程仓库，Maven安装文件自带远程仓库的位置是

​    <http://repo.maven.apache.org/maven2>

具体中央仓库在settings.xml文件的配置如下：

```
    <repositories>
           <repository>
                     <id>central</id>
                     <name>Central Repository</name>          
                     <url>http://repo.maven.apache.org/maven2</url>          
                     <layout>default</layout>          
                     <snapshots>
                         <enabled>true</enabled>
                         <updatePolicy>always</updatePolicy>
                         <checksumPolicy>always</checksumPolicy>
                     </snapshots> 
            </repository> 
    </repositories>
```

![img](http://static.oschina.net/uploads/space/2015/0718/225315_4a3F_1989321.png)



### **6、私服**

​    私服是一种特殊的远程仓库，他是架设在局域网内的仓库服务，私服代理广域网上的远程仓库，供局域网内的Maven用户使用。当Maven需要下载构件的时候，它从私服请求，如果私服上不存在改构件，则从外部的远程仓库下载，同时缓存在私服之上，然后为Maven下载请求提供服务，另外，对于第三方的jar无法从仓库下载（JDBC驱动）可以从本地上传到私服供客户端下载。

​    优点主要有：

​    1）节省外网宽带

​    2）加速Maven构建

​    3）部署第三方构件

​    4）提高稳定性、增强控制：原因是外网不稳定

​    5）降低中央仓库的负荷：原因是中央仓库访问量太大

![img](http://static.oschina.net/uploads/space/2015/0718/225354_LA0X_1989321.png)

### **7、远程仓库认证**

​    有时候登录一个远程仓库需要用户名和密码进行身份验证，所以，需要远程仓库认证。配置认证信息和配置仓库信息不同，仓库信息可以直接配置POM文件中，但是认证信息必须配置在settings.xml文件中，目的就是安全性。当然，我们可以把仓库信息配置在settings.xml 中，这样的缺点就是好动态控制仓库，但是一般情况下不会改变仓库，我们本地私服一般都是唯一的。

```
   <server>
      <id>deploymentRepo_releases</id>
      <username>repouser</username>
      <password>repopwd</password>
    </server>
```

值得注意的是，ID代表的是某个repository元素配置的ID。

### **8、远程仓库部署**

```
 <distributionManagement>
    <repository>
        <id>deploymentRepo_releases</id>
        <name>Nexus Release Repository</name>
        <url>http://localhost:8081/nexus/content/repositories/releases/</url>
    </repository>
    <snapshotRepository>
        <id>deploymentRepo_snapshots</id>
        <name>Nexus Snapshot Repository</name>
        <url>http://localhost:8081/nexus/content/repositories/snapshots/</url>
    </snapshotRepository>
</distributionManagement>
```

我们开发的版本可以通过 mvn deploy 把项目部署到对应的私服上去对于为什么要把发行版本和快照版本分开主要还是为了方便后期项目维护和当时的协同开发。比如发行版本肯定是稳定版，但是他的功能可能没有那么多，对于一些要求稳定的客户就可以给他发行版本；可是对于快照版本来说，是一个正在开发的版本，这个版本可能随时都会被另外一个项目依赖，如果他需要我的功能我就会进行代码提交，也就是部署到私服上去，然而，这个时候Maven就会把我的快照版本做一个时间戳添加在快照版本之后，别人依赖的快照版本也会自动更新为最新的快照版本，这些都是Maven帮我们完成，我们只要项目提交就好。



### **9、镜像**

​    如果仓库X可以提供仓库Y存储的所有内容，那么就可以认为X是Y的一个镜像，某些情况下使用镜像可以提高项目构建效率。

​    settings.xml 中配置镜像

```
  <mirrors>

    <mirror>
      <id>mirrorId</id>
      <mirrorOf>repositoryId</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://my.repository.com/repo/path</url>
    </mirror>

  </mirrors>
```

镜像的意思是，当你访问mirrorOf的仓库时，就会转到对应的镜像url中请求对应的资源。一般镜像都是和私服结合使用。由于私服可以代理任何外部的公共仓库（包括中央仓库），因此，对于组织内部的Maven用户来说，使用一个私服地址就等于使用了所有需要的外部仓库，这个可以将配置集中到私服，从而简化Maven本身的配置。在这种情况下，任何需要的构件都可以从私服中获得，私服就是所有仓库的镜像。这猴子那个镜像如下配置：

```
  <mirrors>

    <mirror>
      <id>mirrorId</id>
      <mirrorOf>*</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://my.repository.com/repo/path</url>
    </mirror>

  </mirrors>
```

### **10 仓库中jar包搜索**

- 仓库搜索：

**![img](http://static.oschina.net/uploads/space/2015/0718/225549_DuBP_1989321.png)**

- 中央仓库

​    http://repo1.maven.org/maven2/

​    http://repository.jboss.com/maven2/

​    http://repository.sonatype.org/content/groups/public/