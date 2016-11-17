# Android MVP学习笔记
>MVP模式介绍

按照MVC的分层，Activity和Fragment属于View层，用于展示UI界面，以及接收用户的输入。

**MVP核心思想：把Activity中的UI逻辑抽象成View接口，把业务逻辑抽象成Presenter接口，Model类还是原来的Model**

这样Activity的工作就简单了，只用来响应生命周期，其它工作都丢到Presenter中去完成。可以看出Presenter是Model和View之间的桥梁，为了让结构更加简单，View不对Model直接操作，这也是MVC与MVP最大的区别。

>MVP的作用

- 分离了试图逻辑和业务逻辑，降低耦合
- Activity只处理生命周期的任务，代码变得更加简洁
- 试图逻辑和业务逻辑分别抽象到View和Presenter的接口中去，提高代码的可阅读性
- Presenter被抽象成接口，可以有多种具体的实现，所以方便进行单元测试
- 把业务楼机抽象到Presenter中去，避免后台线程引用着Activity导致Activity的资源无法被系统回收从而引起内存泄露核OOM

