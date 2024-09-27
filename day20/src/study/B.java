package study;

public class B extends A {
    int n1 = 200;

    public void hi() {
        //可以看到super不能调用私有属性
        System.out.println(super.n1);
        System.out.println(n1);//这样也可以调用父类属性，但是若是类中已经有此变量那么调用的就是这个类中的变量
        System.out.println(super.n2);
        System.out.println(super.n3);
        super.test100();
        super.test200();
        super.test300();
//        super.test400();//不能访问父类的private方法·
        super.cal();
        this.cal();
        cal();
        //如果属性或者方法与父类没有重名,使用super,this,直接访问是一样的效果！
    }

    public B() {
//        super();
//        super("bruces");
        super("bruces", 10);
    }
}
