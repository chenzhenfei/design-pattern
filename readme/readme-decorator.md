1、装饰器模式
     ：（动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。）
+   通用类图
    -   Component：
    Component是一个接口或者是抽象类，就是定义我们最核心的对 象，也就是最原始的对象，如上面的成绩单
    -   ConcreteComponent
    ConcreteComponent是最核心、最原始、最基本的接口或抽象类的 实现，你要装饰的就是它。
    -   Decorator装饰角色
    一般是一个抽象类，做什么用呢？实现接口或者抽象方法，它里面 可不一定有抽象的方法呀，在它的属性里必然有一个private变量指向 Component抽象构件。
    -   具体装饰角色
    ConcreteDecoratorA和ConcreteDecoratorB是两个具体的装饰类，你 要把你最核心的、最原始的、最基本的东西装饰成其他东西，上面的例 子就是把一个比较平庸的成绩单装饰成家长认可的成绩单。
    
    ![avatar](http://note.youdao.com/noteshare?id=f0039926ed421ea051e351efc0cada29&sub=C37F89AF15654E709B83A2C2EAC5EA7A)
+   推荐书籍：《设计模式之禅(第二版)》