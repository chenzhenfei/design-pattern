1、抽象工厂模式
     ：（为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类。）
+   通用类图
    -   抽象产品类 AbstractProduct:
        负责定义产品的共性，和产品的抽象的定义
    -   具体的产品实现 ConcreteProduct:
        对产品的具体实现
    -   抽象创建类 AbstractCreator:
        也就是抽象工厂
    -   具体的实现工厂 ConcreteCreator:
        对某类型产品簇的具体生产的工厂
+    ![avatar](http://note.youdao.com/noteshare?id=69bda5178a810c8c93bd69fdcbdb09fe&sub=93D7C71718334344AC227CCCE288EB5C)
+   推荐书籍：《设计模式之禅(第二版)》