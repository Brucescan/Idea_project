package exercise.coinpass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP面相对象的思想
 */
public class SmallChangeSysOOP {
    //属性
    //定义循环相关变量，默认为true
    boolean loop = true;
    //输入答案的扫描器
    Scanner myScanner = new Scanner(System.in);
    //答案
    int answer = -1;

    //2、完成零钱通明细
    //(1) 可以把收益入账和消费，保存到数组
    //(2) 可以使用对象
    //(3) 简单的话可以使用String进行拼接
    String details = "-----------零钱通明细-----------";

    //3、完成收益入账
    double balance = 0;//余额
    double money = 0;//入账
    Date date = null;//入账日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的对象

    //4、完成消费
    String note = "";
    double consume = 0;


    public void showMainMenu() {
        System.out.println("\n-----------零钱通菜单-----------");
        System.out.println("\t\t1 零钱通明细");
        System.out.println("\t\t2 收益入账");
        System.out.println("\t\t3 消\t费");
        System.out.println("\t\t4 退\t出");
        System.out.print("请选择(1-4):");
    }

    //明细
    public void detail() {
        System.out.println(details);
    }

    //收入
    public void income() {
        System.out.print("收益入账金额：");
        money = myScanner.nextDouble();
        //money的值的校验。
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;
        }

        balance += money;
        //获取当前日期
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
    }

    //消费
    public void pay() {
        System.out.print("消费金额：");
        consume = myScanner.nextDouble();
        //consume的值的校验。
        if (consume <= 0 || consume > balance) {
            System.out.println("收益入账金额需要大于0");
            return;
        }
        balance -= consume;
        System.out.print("消费说明：");
        note = myScanner.next();
        date = new Date();//消费时间
        details += "\n" + note + "\t-" + consume + "\t" + sdf.format(date) + "\t余额：" + balance;
    }

    //退出
    public void quit() {
        System.out.println("-----------退出-----------");
        //定义一个变量接受你的答案
        String choice = "";
        do {
            System.out.println("你确定要退出吗？y/n");
            choice = myScanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        } while (true);

        if ("y".equals(choice)) {
            loop = false;
        }
    }

    //运行函数
    public void run() {
        do {
            this.showMainMenu();
            answer = myScanner.nextInt();
            //进行答案额度判断并进行相关的操作
            switch (answer) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    this.quit();
                    break;
                default:
                    System.out.println("-----------输入有误-----------");
                    break;
            }

        } while (loop);
    }

}
