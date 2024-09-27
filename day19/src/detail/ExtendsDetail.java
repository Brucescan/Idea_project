package detail;

//继承带来的便利性
//(1)代码的复用性提高了
//(2)代码额度扩展性和维护行提高了


import study.Sub;

public class ExtendsDetail {
    public static void main(String[] args) {
        //1、子类继承了所有的属性(继承不等于能用，可以通过打断点查看)与方法，
        // 非私有的属性和方法可以直接访问，但是私有属性不能直接在子类直接访问，
        // 要通过父类提供公共的方法去访问
        //2、子类必须调用父类的构造器，完成父类的初始化
        //3、当创建子类对象时，不管是用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
        //如果父类没有提供无参构造器，则必须在子类的构造器中使用super去指定使用父类的哪个构造器完成对父类的初始化工作，否则编译不会通过
        //？？？？？？？？ 王德发  怎样理解？？
        //4、如果希望指定去调用父类的某个构造器。则显示的调用一下
        //5、super在使用时，需要放在构造器第一行(super只能在构造器中使用)
        //6、super()和this() 都只能放在构造器的第一行，因此两个方法不能共存在一个构造器
        //本意是在说先调用super初始化父类的构造器之后，再调用子类的构造函数，为什么不行呢？？因为他们两个都必须放在第一行，没得商量
        //7、java中所有的类都是Object类的子类
        //Object 是所有类的基类，按住ctrl + H键  可以看到我们继承的关系图，可以看到base类继承自Object类
        //8、父类构造器的调用不限于直接父类！，将一直向上追溯直到Object类(顶级父类)
        //往上追就完了
        //9、子类最多只能继承一个父类(指直接继承),即java中是！！！！！！单继承机制。
        //思考？？？？？？？ 如何让A类继承B,C类
        //可以让a继承b，再让b继承c，即可完成
        //10、不能滥用继承，子类和父类必须满足is-a 的逻辑关系
        System.out.println("========第一个对象=========");
        Sub sub = new Sub();
        System.out.println("========第二个对象=========");
        Sub bruces = new Sub("bruces");
        System.out.println("========第三个对象=========");
        Sub jack = new Sub("jack", 10);
//      sub.sayOk();


    }
}
