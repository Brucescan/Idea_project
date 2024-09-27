package study;
//理解起来较为困难
//对象的多态
//1、一个对象的编译类型和运行类型可以不一致
//2、编译类型在定义对象时，就确定了，不能改变
//3、运行类型是可以变化的
//4、编译类型看定义时 = 号 的左边， 运行类型看 = 号的右边
public class PolyObject {
    public static void main(String[] args) {
        //animal这里的编译类型是 Animal，运行类型是Dog
        Animal animal = new Dog();//在这里，编译类型是Animal,运行类型是Dog
        //因为运行时，这时(执行到第九句话时),animal运行类型是dog，所以这个cry就是dog的cry
        animal.cry();
        //此时animal这里的编译类型还是animal，运行类型是Cat
        animal = new Cat();//animal 的运行类型变成了Cat，编译类型仍然是Animal，所以这个cry就是cat的cry
        animal.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    public void cry(){
        System.out.println("小狗叫");
    }
}

class Cat extends Animal{
    public void cry(){
        System.out.println("小猫叫");
    }

}