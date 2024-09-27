package detail;
//多态细节
//多态的前提是：两个对象之间存在继承关系
//多态是建立在封装和继承的基础上的，没有封装与继承，多态就无从说起了
//多态具有向上转型

//本质是父类的引用指向了子类的对象(向上转型)
//语法：父类类型 引用名 = new 子类类型()
//特点：编译类型看左边   运行类型看右边
//可以调用父类中的所有成员(需要遵守访问权限)


//因为在编译阶段，能调用哪些成员是由编译类型来决定的，
//不能调用子类中特有成员
//最终运行效果看子类的具体实现


//多态的 向下转型  本质上是强行转变父类对象的引用！！！！！注意是他的引用 而不是他的对象本身
//1、语法：子类类型 引用名 = (子类类型) 父类引用;
//2、只能强转父类的引用，不能强转父类的对象
//3、要求父类的引用必须指向的是当前目标类型的对象，注意本来就是父类的引用指向目标类型的对象
//4、当向下转型后，可以调用子类成员中的所有的成员
public class PolyDetail {

}

