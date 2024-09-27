package detail;

/**
 * 讲解继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        //当子类对象创建好后，建立查找的关系
        Son son = new Son();//内存的布局到底是什么？？？？？？，具体看图片
        System.out.println(son.name);
        //->按照查找关系来返回数据，
        // (1)首先看子类的属性
        // (2)如果子类有这个属性，并且可以访问，则返回信息
        // (3)如果没有就往上找，继续执行1步骤，直到找到该属性
        // (4)如果都没有，则会报错
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends  GrandPa{
    String name = "大头爸爸";
    int age = 39;
}

class Son extends Father{
    String name = "大头儿子";
}
