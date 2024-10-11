package chapter10;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        A a = new A();
        a.work();
    }
}

class A {
    private String name = "jack";

    public void work() {
        class B {
            private String name = "bruces";

            public void show() {
                System.out.println("name=" + name);
                System.out.println("A name="+A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}