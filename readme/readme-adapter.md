1、適配器模式
     ：（将一个类的接口变换成客户端所期待的另一种 接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起 工作。
   別名：包装模式（Wrapper）
+   Target目标角色
    该角色定义把其他类转换为何种接口，也就是我们的期望接口，例子中的IUserInfo接口就是目标角色。
+   Adaptee源角色
    你想把谁转换成目标角色，这个“谁”就是源角色，它是已经存在 的、运行良好的类或对象，经过适配器角色的包装，它会成为一个崭 新、靓丽的角色。
+   Adapter适配器角色
适配器模式的核心角色，其他两个角色都是已经存在的角色，而适 配器角色是需要新建立的，它的职责非常简单：把源角色转换为目标角 色，怎么转换？通过继承或是类关联的方式。
+   通用源码
    +   目标角色
    >   public interface Target {
            void request();
        }
    
    +   原角色
    >   public class Adaptee {
            //原有的业务逻辑
            public void doSomething() {
                System.out.println("I'm kind of busy,leave me alone,pls!");
            }
        }
    +   适配器角色
    >   public class Adapter extends Adaptee implements Target {
            @Override
            public void request() {
                System.out.println("我是适配器，将原角色doSomething 转化为目标角色的request");
                super.doSomething();
            }
        }
    +   ![avatar](http://note.youdao.com/noteshare?id=ae8cee6c5a0b21b36259743d542dc748&sub=C274F32AC5054A478050DF17967069E6)
+   推荐书籍：《设计模式之禅(第二版)》