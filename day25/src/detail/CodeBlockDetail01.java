package detail;

/**
 * 1、static 代码块也叫静态代码块，作用就是对类进行初始化，而且随着类的加载而执行，并且只会执行一次
 * 如果是普通代码块，每创建一个对象，就执行一次
 * 2、类什么时候被加载
 * (1) 创建对象实例(new)
 * (2) 创建子类对象实例，父类也会被加载
 * (3) 使用类的静态成员时(静态属性，静态方法)
 * 3、普通的代码块，在创建对象实例时，会被隐式的调用
 * 被创建一次，就会被调用一次
 * 如果只是使用类的静态成员时，普通代码块并不会被执行
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        new AA();
        System.out.println(AA.num);
        System.out.println(Cat.n1);
    }
}


class Cat {
    public static int n1 = 999;//静态属性

    static {
        System.out.println("Cat的静态代码块1被执行");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块1被执行");
    }
}

class AA extends BB {
    public static int num = 10;

    static {
        System.out.println("AA的静态代码块1被执行");
    }
}