[Lombok](https://projectlombok.org)

[Lombok plugin](https://github.com/mplushnikov/lombok-intellij-plugin)

[Lombok makes Java cool again](https://bytes.grubhub.com/lombok-makes-java-cool-again-171102bdcc52)

[Lombok介绍-掘金](https://juejin.im/post/5a6eceb8f265da3e467555fe)

[Introduction to Project Lombok](https://www.baeldung.com/intro-to-project-lombok)

[Lombok使用介绍](http://kriszhang.com/lombok/)

1：Lombok的作用？

通过注解减少源码级别的各种简单重复性的代码，比如：Setter/Getter/ToString/构造方法/HashCode/Equals等等。

2：Lombok的原理？

编译时将注解转换成对应的字节码

大部分java jar包都工作在运行时，而Lombok是工作在编译时的，它在编译时修改了语法树（不清楚咋修改的？）相当于在编译时修改了代码，把注解编程了响应的代码

3：Lombok的使用成本？

3-1：稍微的学习成本，可忽略
3-2：开发环境需要统一安装一下Lombok的插件，这样好识别Lombok的语法
3-3：增加了阅读和理解难度，针对有些代码debug有些障碍
3-4：如果沟通不好，有没有安装Lombok插件的同学，这样会导致有些问题排查困难
