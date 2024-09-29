package exercise;

public class PolyExercise {
    public static void main(String[] args) {
//        double d = 13.4;
//        long l = (long)d;
//        System.out.println(l);//正确，这些都是基本数据类型，不存在什么
//
//        int in = 5;
////        boolean b = (boolean)in;//错误的，boolean不能参与这种运算
//        Object obj = "hello";
//        String objStr = (String) obj;//正确的，这是一个向下转型
//        System.out.println(objStr);
//
//        Object objPri = new Integer(5);
//        String str = (String) objPri;//错误的向下转型，objPri不指向String类对象
//        Integer str1 = (Integer) objPri;//正确的，因为指向的就是Integer的对象
        Sub s = new Sub();//创建子类对象
        System.out.println(s.count);//20 先找子类里面有，
        s.display();//20  这里的this是子类对象，也就是s,相当于s.count
        Base b = s;//向上转型
        System.out.println(b == s);//true 两者相等,因为指向的东西一样
        System.out.println(b.count);//属性没有重写之说，属性的值看编译类型，所以应该是10
        b.display();//方法具有重写，所以调用的是运行类型的display 里面的this 是b.count,依旧是20

        //属性看编译 方法看运行
    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}
