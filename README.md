## BetaGo

Scala Dev

A Scalable Language, by Martin Odersky.

Object-Oriented Meets Functional. Have the best of both worlds.

http://scalac.com/

### Java

#### info

* JSON
* Spring
* MySQL
* MyBitas
* Apache Coomons

#### log

1. 2017.02.04 梳理目录结构，添加 commons-lang3-3.5，commons-math3-3.6.1；
2. 2017.02.06 学习Java面向对象编程，笔记：[Object Oriented](http://scalac.com/index.php?title=Object-Oriented)；
3. 2017.02.08 学习数组，循环，运算符号，笔记：[Language Basics](http://scalac.com/index.php?title=Language_Basics)；

### Scala

#### info

* Akka
* Scalatra
* Spark

#### log

1. 2017.02.03 建立工程，并在 GitHub 托管代码；

### PHP

#### info

WordPress、MediaWiki 均为[PHP](http://scalac.com/index.php?title=PHP)编写，借此机会学习基本的语法、函数，以能编写简单的PHP脚本为目标。

#### log

1. 2017.02.18 在src目录建立php文件夹，下载Intellij IDEA PHP 插件；
2. 2017.02.18 学习调用新浪微博短链接服务接口；
3. 2017.02.18 为Wamp配置alias，可在本地调试PHP程序；
4. 2017.02.19 完善 PHP 相册，按作者的建议，实现了完美的权限控制；

```
Alias /betago "C:/Dev/idea-projects/betago/"

<Directory "C:/Dev/idea-projects/betago/">
	Options Indexes FollowSymLinks MultiViews
  AllowOverride all
  <ifDefine APACHE24>
		Require local
	</ifDefine>
	<ifDefine !APACHE24>
		Order Deny,Allow
    Deny from all
    Allow from localhost ::1 127.0.0.1
	</ifDefine>
</Directory>
```

### Python

#### info

Python 的确是很好的语言，很优雅，有个性，功能强大。

Life's pathetic, let's Pythonic.

#### log

1. 2017.02.18 在src目录建立python文件夹，下载Intellij IDEA Python 插件；
2. 2017.02.18 配置Python运行时环境，可跑简单的脚本；

### JavaSCript

#### info

* jQuery
* Underscore
* Zepto
* React


#### log

1. 2017.02.03 添加 jQuery 库；
2. 2017.02.16 学习 Bootstrap 简单布局，[新浪微博组件](http://scalac.com/static/ivy/dwz/index.html)，Lorem Ipsum；
3. 2017.02.17 学习 jQuery Ajax，[新浪微博短链接服务](http://scalac.com/static/ivy/dwz/tcn.html)；
4. 2017.02.18 升级短链接服务至[正式版](http://scalac.com/static/ivy/dwz/tcn-pro.html)，服务器端语言PHP；
5. 2017.02.19 进一步完善短链接服务，添加客户端验证，学习正则表达式；

### CSS

#### info

* Bootstrap
* Less
* Sass
* Foundation

#### log

1. 2017.02.03 添加 [Meyerweb Reset CSS](http://meyerweb.com/eric/tools/css/reset/)；
2. 2017.02.18 学习 Bootstrap [表单布局](http://getbootstrap.com/css/#forms)；

### HTML

#### info

* xhtml
* html5

#### log

1. 2017.02.17 整理[百度搜索](http://www1.pconline.com.cn/api/libs/foundation/index.html)手机无广告版；
2. 2017.02.17 制作 Bootstrap + jQuery 版的[跳转计数生成工具](http://scalac.com/static/ivy/dwz/useParam-jQuery.html)；

