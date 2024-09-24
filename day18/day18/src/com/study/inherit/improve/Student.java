package com.study.inherit.improve;

//pupil 和 graduate 的父类
public class Student {
//    公有属性
    public String name;//姓名
    public int age;//年龄
    private double score;//成绩

//    公有方法
    public void setScore(double score) {
        this.score = score;
    }

    //    public void testing() {//这是和小学生不一样的，剩下全是一样的！！！！！！！！！！！！！！！！
//        System.out.println("大学生" + name + "正在考高等数学.....");
//    }
    public void showInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("score = " + score);
    }
}
