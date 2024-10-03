package chapter07;

public class HomeWork07 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(10000);
        checkingAccount.deposit(100);
        checkingAccount.getBalance();


    }
}


class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public double getBalance() {
        System.out.println(balance);
//        System.out.println(balance);
        return balance;
    }

    public void setBalance(double balance) {
//        System.out.println(this.balance);
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}

class SavingsAccount extends BankAccount{
    private int count = 3;
    private int month = 0;
    //Todo 存储月份怎样模拟？
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

}