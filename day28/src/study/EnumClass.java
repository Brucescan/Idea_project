package study;

/**
 * @author bruces
 * @version 1.0
 */
public class EnumClass {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "寒冷");
        Season summmer = new Season("夏天", "燥热");
        Season autumn = new Season("秋天", "凉爽");
        //因为对于季节而言   它的对象只能是上面的四种，不会有更多的
        //因此这样的设计不好，按照传统的思路不太好  所以我们引出了枚举
        Season other = new Season("红天", "：）");
    }
}

class Season {
    private String name;//名字
    private String desc;//描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}