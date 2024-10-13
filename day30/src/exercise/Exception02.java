package exercise;

import java.util.Scanner;

/**
 * @author bruces
 * @version 1.0
 */
public class Exception02 {
    public static void main(String[] args) {
        boolean loop = true;
        String answer;
        do {
            System.out.print("输入一个整数:");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();
            try{
                int num = Integer.parseInt(answer);
                System.out.println("输入的整数是"+num);
                loop = false;
            }catch(NumberFormatException e){
                System.out.println("输入不正确，重新输入");
            }
        }while(loop);
    }
}
