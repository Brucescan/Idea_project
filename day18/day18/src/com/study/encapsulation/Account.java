package com.study.encapsulation;

/**
 *
 *
 *
 */
public class Account {
    String name = "";
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        setName(name);
        setBalance(balance);
        setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len>=2&&len<=4){
            this.name = name;
        }else{
            System.out.println("输入有误，长度必须在2-4位之间");
            this.name = "";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>20){
            this.balance = balance;
        }else{
            System.out.println("余额必须大于20");
            //因为类属性默认初始化的时候，默认会赋值为0
        }

    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        int len = pwd.length();
        if(len==6){
            this.pwd = pwd;
        }else{
            System.out.println("密码长度只能为6位");
            this.pwd = "";
        }
    }

    public void showInfo() {
        System.out.println("name = "+name);
        System.out.println("blance = "+ balance);
        System.out.println("pwd = "+pwd);
    }
}
