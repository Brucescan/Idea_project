package study;

/**
 * @author bruces
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {

    }
}

/*
1、当我们使用enum关键字开发一个枚举类的时候，默认会继承Enum类
如何证明     使用javap 的工具来证明
2、传统的 public static final Season2 SPRING = new Season2("春天"，“温暖”);
简化成SPRING("春天","温暖");这里必须知道，它调用的是哪个构造器
3、如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
4、当有多个枚举对象时，使用，间隔，最后一个有；结尾
5、枚举对象必须放在枚举类的行首
 */
