package com.study.inherit.improve;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

//        Pupil pupil1 = new Pupil();
        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 100;
        graduate.testing();
        graduate.setScore(6);
        graduate.showInfo();
    }
}
