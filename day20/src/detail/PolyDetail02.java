package detail;

//属性重写问题
//属性没有重写之说，属性的值看编译类型
// instanceOf 比较操作符，用于判断对象的运行类型是否为XX类型或者XX类型的子类型
public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说！属性的值看编译类型
        Base base = new Sub();//向上转型
//        System.out.println(base.count);//编译类型 10
//        Sub sub1 = new Sub();
//        System.out.println(sub1.count);//看编译类型 20
//        Sub sub = (Sub) base;//向下转型
//        System.out.println(sub.count);
        //base 的编译类型是Base 运行类型是Sub
        System.out.println(base instanceof Sub);//true
        System.out.println(base instanceof Base);//true
        //结果仍然是true,可以看出这里判断的是运行类型
    }
}

class Base {//父类
    int count = 10;//属性
}

class Sub extends Base {//子类
    int count = 20;//属性重写
}