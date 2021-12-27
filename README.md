# 内存与垃圾回收

## 类加载子系统

### 类加载子系统的作用

![image-20200705081813409](./README.assets/20211227174450.png)

+ 类加载器子系统负责从文件系统或者网络中加载Class文件，class文件在文件开头有特定的文件标识。

+ ClassLoader只负责class文件的加载，至于它是否可以运行，则由Execution Engine决定。

+ 加载的类信息存放于一块称为方法区的内存空间。除了类的信息外，方法区中还会存放运行时常量池信息，可能还包括字符串字面量和数字常量（这部分常量信息是Class文件中常量池部分的内存映射）

![img](./README.assets/20211227174459.png)

- class file存在于本地硬盘上，可以理解为设计师画在纸上的模板，而最终这个模板在执行的时候是要加载到JVM当中来根据这个文件实例化出n个一模一样的实例。
- class file加载到JVM中，被称为DNA元数据模板，放在方法区。
- 在.class文件->JVM->最终成为元数据模板，此过程就要一个运输工具（类装载器Class Loader），扮演一个快递员的角色。

### 类的加载过程

![image-20200705082255746](./README.assets/20211227174510.png)

完整的流程图如下所示

![image-20200705082601441](./README.assets/20211227174517.png)



# 相关工具

## idea安装jclasslib

选中字节码文件，view中show With Jclasslib即可查看字节码指令

![image-20211227170720770](./README.assets/20211227174525.png)

## Notepad++字节码

[HexEdit下载地址](https://github.com/chcg/NPP_HexEdit/releases/tag/0.9.5.11)

下载对应版本的dll文件，在notepad++插件文件夹创建HexEdit文件夹，将解压的dll文件放入，重启即可。

![image-20211227170551121](./README.assets/20211227174533.png)

# 推荐笔记

 **[陌溪](https://gitee.com/moxi159753) / [LearningNotes](https://gitee.com/moxi159753/LearningNotes)**

