桥接模式的应用场景：

jdbc 驱动模式就是通过桥接

Driver  
   mysqlDriver
   oracleDriver
   DB2Driver
   
Bridge
  - Driver  在桥接里面设置Driver 的实例
  
  - 提供对外的调用Driver 的方法
  - 提供对外的动态设置Drvier 的方法（get/set）


clinet 通过对Briger的调用就能实现对Driver 的动态获取和调用
