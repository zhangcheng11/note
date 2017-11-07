#### 利用 Nexus 来构建企业级 Maven 仓库

**一、简介**

Nexus是Maven仓库管理器，用来搭建一个本地仓库服务器，这样做的好处是便于管理，节省网络资源，速度快，还有一个非常有用的功能就是可以通过项目的SNAPSHOT版本管理，来进行模块间的高效依赖开发

**一、为什么要用Nexus**

虽然可以通过中央仓库来获取我们所需要的jar包，但是现实往往是存在很多问题：

- 网速慢，我们可能需要花很长的时间来下载所需要的jar
- 如果我们的公司很大，有几百甚至几千人在用Maven，那么这些人都去通过中央仓库来获取jar，那么这是一个很大的资源浪费
- 如果存在模块之间的依赖开发，我们的伙伴就不能很方便的获取快照版本。
- 在实际开发过程中，有些jar的版本可能在中央仓库里面不存在，或者更新不及时，我们是获取不到这个jar的。

   所有以上问题，可以通过Nexus解决。

- 这个仓库是本地的，下载的速度是从远程下载不可比的。
- 它可以为我们公司的所有Maven使用者服务，进行统一管理
- 它能很好的帮我们进行存在模块依赖的项目的开发
- 可以添加自己的第三方包

**二、下载与安装**

​     下载地址：<http://www.sonatype.org/nexus/go>

​      执行命令：

​      cd C:\nexus\nexus-2.0.4\bin\jsw\windows-x86-64\

​      安装：install-nexus.bat

​      启动： start-nexus.bat



**三、登录和修改密码**

访问：<http://localhost:8081/nexus>

   点击右上角登录，用户名/密码：admin/admin123

   按如下图所示修改密码 
[![image](http://images.cnitblog.com/blog/722277/201502/091818005118064.png)](http://images.cnitblog.com/blog/722277/201502/091817580117494.png)

**四、搜索jar和仓库介绍**

   可以在搜索栏搜索想要的jar包和pom，点击repositories可以看到当前的仓库

   以Maven中心仓库为例，下图是仓库信息的简介

[![image](http://images.cnitblog.com/blog/722277/201502/091818045581362.png)](http://images.cnitblog.com/blog/722277/201502/091818026983962.png)

**五、自定义仓库**

   如下图点击add->hosted Repository

[![image](http://images.cnitblog.com/blog/722277/201502/091818075117859.png)](http://images.cnitblog.com/blog/722277/201502/091818060269644.png)

   输入Repository id和Repository name然后点击save即可

   成功后将会在仓库列表中显示

**六、上传jar到仓库**

   上一步新建了仓库名为test，点击test，在Artifact Upload中填写内容如下图，并上传jar包，点击提交即可

[![image](http://images.cnitblog.com/blog/722277/201502/091818110113257.png)](http://images.cnitblog.com/blog/722277/201502/091818090738114.png)

**七、组合仓库**

   在仓库列表中有一个名叫Public Repositories的仓库，该仓库是由多个仓库组合而成，客户端将会默认使用Public 仓库里面的jar包，这个Public 仓库是可以进行配置的，如下图，将右边的仓库移到左边，则该仓库将变为可用的。

[![image](http://images.cnitblog.com/blog/722277/201502/091818154334739.png)](http://images.cnitblog.com/blog/722277/201502/091818130111912.png)

**八、代理第三方仓库**

​      添加Proxy仓库可以代理第三方的仓库，以便扩大私服的jar包索引

