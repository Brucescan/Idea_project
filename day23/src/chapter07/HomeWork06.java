package chapter07;

public class HomeWork06 {
    public static void main(String[] args) {
        new Demo().test();
        //Test
        //Demo
        //Rose
        //jack
        new Demo("join").test();
        //join
        //jack
    }
}


class Test {
    String name = "Rose";

    Test() {
        System.out.println("Test");
    }

    Test(String name) {
        this.name = name;
    }
}

class Demo extends Test {
    String name = "jack";

    Demo() {
        super();
        System.out.println("Demo");
    }

    Demo(String s) {
        super(s);
    }

    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}