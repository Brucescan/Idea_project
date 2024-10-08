package study;

/**
 * 一个类的内部又完整的嵌套了另一个类结构。被嵌套的类称为内部类(inner class)，嵌套其他类的类称为外部类(outer class)
 * 是我们类的第五大成员
 * 内部类的最大特点是可以直接访问私有属性，并且可以体现类与类之间的包含关系
 */
public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer{//外部类
    class Inner{//内部类

    }
}

class Other{//外部其他类

}