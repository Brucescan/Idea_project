package study;

/**
 * 接口的多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        //这样是错的，因为Teacher并没有实现,若是让IG继承IH，那么IH也能指向实现IG接口的类的对象的实例
        //实际上也相当于Teacher实现了IH接口
        //这个就是接口的多态的传递现象
        IH ih = new Teacher();
    }
}

interface IH{

}

interface IG extends IH{

}

class Teacher implements IG{

}