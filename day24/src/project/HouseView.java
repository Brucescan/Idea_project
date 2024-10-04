package project;

/**
 * 界面层
 * 1、此类用来显示界面
 * 2、接受用户的输入
 * 3、调用其他类完成对房屋信息的各种操作(CRUD)
 */
public class HouseView {

    private HouseService houseService = new HouseService(10, this);

    public void showMainMenu() {
        System.out.println("=================房屋出租系统==================");
        System.out.println("\t\t\t 1 新增房源");
        System.out.println("\t\t\t 2 查找房屋");
        System.out.println("\t\t\t 3 删除房屋信息");
        System.out.println("\t\t\t 4 修改房屋信息");
        System.out.println("\t\t\t 5 显示房屋信息");
        System.out.println("\t\t\t 6 退      出");
        System.out.print("请输入你的选择(1-6)：");
    }

    public void listHouses() {
        System.out.println("=================房屋列表==================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租//已出租)");
        House[] houses = houseService.list();//得到所有的房屋的信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=================房屋列表显示完毕==================");
    }

    //显示添加房源的界面，并接受输入，创建house对象
    public void addHouse() {
        System.out.println("=================添加房屋==================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租金：");
        int rent = Utility.readInt();
        System.out.println("当前状态(已出租/未出租)：");
        String status = Utility.readString(3);
        //创建一个House对象   注意id是系统分配的，用户不能输入
        House house = new House(0, name, phone, address, rent, status);
        if (houseService.add(house)) {
            System.out.println("=================添加房屋成功==================");
        } else {
            System.out.println("=================房屋列表扩容中==================");
            houseService.add(house);
            System.out.println("=================添加房屋成功==================");
        }
    }

    //删除房屋界面
    public void deleteHouse() {
        System.out.println("=================删除房屋==================");
        System.out.println("请输入待删除房屋的编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=================退出删除房屋==================");
            return;
        }
        //注意该方法本身就有循环判断的逻辑，必须输如Y/N
        char answer = Utility.readConfirmSelection();
        if (answer == 'Y') {
            if (houseService.delete(delId)) {
                System.out.println("=================删除房屋成功==================");
            } else {
                System.out.println("=================删除房屋失败==================");
            }
        } else {
            System.out.println("=================退出删除房屋==================");
        }

    }

    //退出界面的显示
    public boolean quitHouse() {
        if (houseService.quit()) {
            System.out.println("=================退出成功==================");
            return true;
        } else {
            System.out.println("=================退出失败==================");
            return false;
        }
    }

    //查找房屋的显示
    public void getHouse() {
        System.out.println("=================查找房屋==================");
        System.out.println("输入你要查找的编号：");
        int getId = Utility.readInt();
        if (houseService.get(getId) == null) {
            System.out.println("此房屋不存在");
            return;
        }
        System.out.println("你要查找的信息如下：");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租//已出租)");
        System.out.println(houseService.get(getId));

    }

    //修改房屋信息界面
    public void putHouse() {
        System.out.println("=================更新房屋==================");
        System.out.println("输入你要更新的房屋的编号：");
        int putId = Utility.readInt();
        if(houseService.get(putId)==null){
            System.out.println("此房屋不存在");
            return;
        }
        System.out.println("输入你想要更改的房屋信息选项：");
        System.out.print("1、姓名");
        System.out.print("2、电话");
        System.out.print("3、地址");
        System.out.print("4、月租金");
        System.out.println("5、当前状态(已出租/未出租)");
        int choice = Utility.readInt();
        if(choice==4){
            System.out.println("输入你想要更新后的内容：");
            int detail = Utility.readInt();
            if(houseService.put(putId,detail)){
                System.out.println("=================更新成功==================");
            }else{
                System.out.println("=================更新失败==================");
            }
        }else{
            System.out.println("输入你想要更新后的内容：");
            String detail = Utility.readString(10);
            if(houseService.put(putId,choice,detail)){
                System.out.println("=================更新成功==================");
            }else{
                System.out.println("=================更新失败==================");
            }
        }

    }

    public void run() {
        houseService.runService();
        System.out.println("============你退出了房屋出租系统===========");
    }
}
