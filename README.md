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

>MVP的使用
![](https://segmentfault.com/image?src=http://7xih5c.com1.z0.glb.clouddn.com/15-10-12/94032090.jpg&objectId=1190000003927200&token=62cb9888184d6fe02a4b3ae814ca17e8)

使用MVP步骤：

- 创建IPresenter接口，把所有的业务逻辑都放在这里，并创建它的实现类PresenterCompl
- 创建IView接口，把所有视图逻辑都放着这里，其实现类是当前的Activity和Fragment
- 由图可以可以看出，Activity里面包含一个IPresenter，而PresenterCompl里面又饱含一个IView，并且倚赖了Model。Activity里只保留了对IPresenter的调用，其它工作全部留到PresenterCompl中实现


#TheMVP实现

将Activity作为Presenter来写，需要让View变得可复用，必须解决的一个问题就是setContentView（）

我们需要把视图抽离出来独立实现，可以定义一个接口，来限定View层必须实现的方法（这个接口定义，也就是View层的代理对象）























  















