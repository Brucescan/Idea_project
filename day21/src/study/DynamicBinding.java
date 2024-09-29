package study;

//java中的动态绑定机制     (！！！！！！！！！！非常非常重要)
//
public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型是A，运行类型是B
        A a = new B();
        System.out.println(a.sum());//40->30
        System.out.println(a.suml());//30->20
    }
}


class A{
    public int i = 10;
    //动态绑定机制
    //1、当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    //在这个例子中   父类的sum中调用的是子类getl,因为调用sum的对象的运行类型是子类，所以这个getl是子类中的getl
    //而这个属性，因为没有动态绑定机制，所以直接使用该类中声明的变量即可
    //2、当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用，若是作用域中没有就会遵循
    public int sum(){
        //这里相当于this.getl()  不过这个this就是当前对象
        return getl()+10;
    }

    public int suml(){
        return i+10;
    }
    public int getl(){//父类的getl
        return i;
    }
}

class B extends A{
    public int i = 20;
//    public int sum(){
//        return i+20;
//    }
    public int getl(){//子类的getl
        return i;
    }
//    public int suml(){
//        return i+10;
//    }
}