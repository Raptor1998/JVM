package com.raptor.first.T03;

/**
 * 子类的初始化<clinit>
 * 1.j=method()
 * 2.子类的静态代码块
 * <p>
 * 先初始化父类  （5）（1）
 * 初始化子类 （10） （6）
 * <p>
 * 子类实例化方法：
 * 1.super()（最前）  （9） （3） （2）
 * 2.i=test()          （9）
 * 3.子类的非静态代码块    （8）
 * 4.子类的无参构造（最后）   （7）
 * <p>
 * 因为创建了两个Son对象，因此实例化方法<init>()执行两次
 * <p>
 * （9） （3） （2） （9） （8） （7）
 * <p>
 * <p>
 * <p>
 * 哪些方法不能被重写：
 * final方法
 * 静态方法
 * private等子类中不可见方法
 * 对象的多态：
 * 子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码
 * 非静态方法默认的调用对象是this
 * this对象在构选器或者说<init>方法中就是正在创建的对象
 */
public class Son extends Father {
    private int i = test();
    public static int j = method();

    static {
        System.out.println("(6)");
    }

    Son() {
        //super();   写或不写，在子类构造器中一定会调用父类的构造器
        System.out.println("(7)");
    }

    {
        System.out.println("(8)");
    }

    @Override
    public int test() {
        System.out.println("(9)");
        return 1;
    }

    public static int method() {
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        /**
         * 类初始化过程：
         * 1.一个类的创建实例需要先加载初始化该类
         *      main方法所在的类需要先加载和初始化
         *      仅发生类初始化 ，不发生实例初始化 （5）（1）（10）（6）
         * 2.一个子类要初始化需要先初始化父类
         * 3.一个类初始化就是执行<clinit>()方法
         *      <clinit>方法由静态类变量显示赋值代码和静态代码块组成
         *      类变量显式赋值代码和静态代码块代码从上到下顺序执行
         *      <clinit>方法只执行一次
         *
         * 实例初始化过程：
         * 1.实力初始化就是执行<init>()方法
         *      <init>()方法可能重在有多个，有几个构造器就有几个<init>()方法
         *      <init>()方法由非静态实例变量显示赋值代码和非静态代码块、对应构造器代码组成
         *      非静态实例变量显示赋值代码和非静态代码块代码从上到下顺序执行，而对应构造器的代码最后执行
         *      每次创建实例对象，调用对应构造器，执行的就是对应的<init>方法
         *      <init>方法的首行是super()或super(实参列表)，即对应父类的<init>方法
         */
        Son son1 = new Son();
        System.out.println();
        Son son2 = new Son();
    }
}
/**
 * 方法重载的规则？
 * 方法名一致，参数列表中参数的顺序，类型，个数不同。
 * 重载与方法的返回值无关，存在于父类和子类，同类中。
 * 可以抛出不同的异常，可以有不同修饰符。
 * <p>
 * 方法重写的规则？
 * 参数列表、方法名、返回值类型必须完全一致，构造方法不能被重写；
 * 声明为 final 的方法 不能被重写；
 * 声明为 static 的方法不存在重写(重写和多态联合才有意义);
 * 访问权限不能比 父类更低;重写之后的方法不能抛出更宽泛的异常
 * <p>
 * 重载和重写的区别？
 * 方法的重写 Overriding 和重载 Overloading 是 Java 多态性的不同表现。
 * 重写 Overriding 是父类与子类之间多态性的一种表现，
 * 重载 Overloading 是一个类中多态性的一种表现。
 * 如 果在子类中定义某方法与其父类有相同的名称和参数，我们说该方法被重写 (Overriding)。 子类的对象使用这个方法时，将调用子类中的定义，对它而言，父类中的定义如同被“屏蔽” 了。
 * 如果在一个类中定义了多个同名的方法，它们或有不同的参数个数或有不同的参数类型， 则称为方法的重载(Overloading)。
 */