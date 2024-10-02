package exercise.coinpass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //1、先完成显示菜单
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

        //5、完成退出确认


        //定义一个循环结构，首先执行一遍，所以要用do while循环
        do {
            System.out.println("\n-----------零钱通菜单-----------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消\t费");
            System.out.println("\t\t4 退\t出");
            System.out.print("请选择(1-4):");
            //接受答案
            answer = myScanner.nextInt();
            //进行答案额度判断并进行相关的操作
            switch (answer) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.print("收益入账金额：");
                    money = myScanner.nextDouble();
                    //money的值的校验。
                    if (money <= 0) {
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }

                    balance += money;
                    //获取当前日期
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    //到此我们detail的拼接就完成了
                    break;
                case 3:
                    System.out.print("消费金额：");
                    consume = myScanner.nextDouble();
                    //consume的值的校验。
                    if (consume <= 0 || consume > balance) {
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance -= consume;
                    System.out.print("消费说明：");
                    note = myScanner.next();
                    date = new Date();//消费时间
                    details += "\n" + note + "\t-" + consume + "\t" + sdf.format(date) + "\t余额：" + balance;
                    //到此detail就拼接完成了
                    break;
                case 4:
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

                    //注意我们写代码的时候，建议建议一段代码写一个功能，当然这只是建议
                    //这样可以保证代码的高内聚以及低耦合性
                    break;
                default:
                    System.out.println("-----------输入有误-----------");
                    break;
            }

        } while (loop);

    }
}
