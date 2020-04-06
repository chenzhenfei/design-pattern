1、迭代器模式
     ：（它提供一种方法迭代一个容器对象中各个元素，而又不需暴露该对象的内部细节。）
+   通用类图
    -   Iterator抽象迭代器：
        抽象迭代器负责定义访问和遍历元素的接口，而且基本上是有固定 的3个方法：first()获得第一个元素，next()访问下一个元素，isDone()是 否已经访问到底部（Java叫做hasNext()方法）
    -   ConcreteIterator具体迭代器:
        具体迭代器角色要实现迭代器接口，完成容器元素的遍历。
    -   Aggregate抽象容器:
        容器角色负责提供创建具体迭代器角色的接口，必然提供一个类似 createIterator()这样的方法，在Java中一般是iterator()方法。
    -   Concrete Aggregate具体容器
        具体容器实现容器接口定义的方法，创建出容纳迭代器的对象。
+   目前已经是一个没落的模式，基本上 没人会单独写一个迭代器，除非是产品性质的开发; 
    如果你是做Java开发，尽量不要自己写迭代器模式！省省吧，使用 Java提供的Iterator一般就能满足你的要求了
+    ![avatar](http://note.youdao.com/noteshare?id=f8068446d4bee8a700ac659c01ee6366&sub=CCB7BE726B90403A97277ECFA2AADB9C)
+   推荐书籍：《设计模式之禅(第二版)》