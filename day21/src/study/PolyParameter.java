package study;

//多态的另一个应用    多态参数
//方法定义的形参类型为父类类型，实参类型允许为子类类型
public class PolyParameter {
    public static void showEmpAnal(Employee e) {
        System.out.println(e.getName()+"\t你的年工资是\t"+e.getAnanual());
    }
    public static void testWork(Employee e){
        if(e instanceof Woker){
            ((Woker)e).work();
        } else if (e instanceof Manger) {
            ((Manger)e).manage();
        }else{
            System.out.println("你是一名员工");
        }
    }
    public static void main(String[] args) {
        Employee e = new Employee("bruces",3000);
        Manger m = new Manger("jack",10000,2000);
        Woker w = new Woker("smith",5000);
        showEmpAnal(e);
        showEmpAnal(m);
        showEmpAnal(w);
        testWork(e);
        testWork(m);
        testWork(w);
        "hahha".equals("jiand");
    }
}

class Employee {//父类
    private String name;
    private double msalary;

    public Employee(String name, double msalary) {
        this.name = name;
        this.msalary = msalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMsalary() {
        return msalary;
    }

    public void setMsalary(double msalary) {
        this.msalary = msalary;
    }

    public double getAnanual() {
        return 12 * msalary;
    }
}

class Manger extends Employee {//子类
    private double bonus;

    public Manger(String name, double msalary, double bonus) {
        super(name, msalary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("这是一个管理方法");
    }

    @Override
    public double getAnanual() {
        return super.getAnanual() + 12 * bonus;
    }
}

class Woker extends Employee {//子类

    public Woker(String name, double msalary) {
        super(name, msalary);
    }

    public void work() {
        System.out.println("正在工作");
    }

    @Override
    public double getAnanual() {
        return super.getAnanual();
    }
}