package study;

/**
 * @author bruces
 * @version 1.0
 */
public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season_.SPRING);
        System.out.println(Season_.SUMMER);
        System.out.println(Season_.AUTNMN);
        System.out.println(Season_.WINTER);
    }
}

/*
枚举是一组常量的集合
可以这样理解：枚举属于一种特殊的类，里面只包含了一组有限的特定的对象
两种实现方法
1、自定义类实现枚举
不需要提供set方法，因为枚举对象值通常为只读
对枚举对象/属性使用final+static共同修饰，实现底层优化
枚举对象名通常使用全部大写，常量的命名规范
枚举对象根据需要，也可以有多个属性
2、使用enum关键字实现枚举
 */
class Season_{
    private String name;//名字
    private String desc;//描述
    public static final Season_ SPRING = new Season_("春天", "温暖");
    public static final Season_ SUMMER = new Season_("夏天", "燥热");
    public static final Season_ AUTNMN = new Season_("秋天", "凉爽");
    public static final Season_ WINTER = new Season_("冬天", "寒冷");

    //1、将构造器私有化，目的防止 直接new
    //2、去掉set方法，防止属性被修改
    //3、在Season内部直接创建固定的对象
    //4、优化，可以加个final修饰符
    //5、枚举对象根据需要，可以有多个属性
    private Season_(String name, String desc) {
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
        return "Season_{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

/*
进行自定义类实现枚举，有如下特点：
1、构造器私有化
2、本类内部创建一组对象
3、对外暴露对象(通过为对象添加public final static修饰符)
4、可以通过get方法，但是不能提供set方法
 */