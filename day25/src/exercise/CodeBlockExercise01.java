package exercise;

public class CodeBlockExercise01 {
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}


class Test {
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");

    static {
        System.out.println("static块被执行");
        if(sam==null){
            System.out.println("sam is null");
        }
    }
    Test(){
        System.out.println("Test默认构造函数被调用");
    }

    public static void main(String[] args) {
        Test a = new Test();
        //静态成员sam初始化
        //static块被执行
        //sam1成员初始化
        //Test默认构造函数被调用
    }
}
