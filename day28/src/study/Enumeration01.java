package study;

/**
 * @author bruces
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTNMN);
        System.out.println(Season2.WINTER);
    }
}

/*
使用enum关键字来实现前面的枚举案例
 */
enum Season2{
    //如果使用enum来实现枚举类
    //常量名(实参列表)
    //如果有多个常量(对象)，使用，间隔即可，如下所示
    //如果使用enum来实现枚举，要求将定义的常量对象写在最前面
    SPRING ("春天", "温暖"),
    SUMMER ("夏天", "燥热"),
    AUTNMN ("秋天", "凉爽"),
    //若是有无参构造器，在实例化对象的时候可以不写实参列表和
    WINTER ("冬天", "寒冷");
    private String name;
    private String desc;

    //可以看到我们写上private是灰色的，说明默认为private
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }



    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}