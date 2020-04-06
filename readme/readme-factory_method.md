1、工厂方法模式
     ：（定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。）
+   通用类图
    -   抽象产品类 Product:
        负责定义产品的共性，实现 对事物最抽象的定义
    -   抽象创建类 Creator:
         也就是抽象工厂
    -   具体的实现工厂 ConcreteCreator:
        具体如何创建产品类
+    ![avatar](http://note.youdao.com/noteshare?id=c60acd31b76281850db9d3bbca568d08&sub=B362D32F7E5D4FF592887F054BC31495)
+   推荐书籍：《设计模式之禅(第二版)》