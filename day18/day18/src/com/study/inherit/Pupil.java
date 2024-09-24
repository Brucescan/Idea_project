package com.study.inherit;

//小学生类--->模拟小学生考试
public class Pupil {
    public String name;//姓名
    public int age;//年龄
    private double score;//成绩

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("小学生" + name + "正在考小学数学.....");
    }

    public void showInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("score = " + score);
    }
}
