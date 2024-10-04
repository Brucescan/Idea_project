package project;

/**
 * 业务层
 * 1、响应HouseService的调用
 * 2、完成对房屋信息的各种操作(增删改查)
 */
public class HouseService {
    //属性
    private House[] houses;
    private HouseView houseView;
    //控制循环
    private boolean loop = true;
    private char key = ' ';//接受用户选择
    //记录数组长度
    private int houseNums = 1;
    //记录id的自赠的值
    private int idCounter = 1;

    //构造器
    public HouseService(int size, HouseView houseView) {
        houses = new House[size];//在初始化的时候指定数组的大小
        houses[0] = new House(1, "bruces", "666", "海淀区", 30, "未出租");
        this.houseView = houseView;
    }

    //写一个list方法，直接返回house列表即可
    public House[] list() {
        return houses;
    }

    //新增房源
    public boolean add(House newHouse) {
        //先判断是否添加(暂时先不考虑数组扩容的问题)
        if (houseNums == houses.length) {
            House[] newHouses = new House[houses.length * 2];
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = houses[i];
            }
            houses = newHouses;
            return false;
        }
        houses[houseNums++] = newHouse;//将第二个数组的引用赋给传进来的新的对象
        //我们还需要一个id自赠的逻辑

        //这里的newHouse依然指向我们新增的那个房源
        newHouse.setId(++idCounter);
        return true;
    }

    //删除房屋信息
    public boolean delete(int delid) {
        int index = -1;
        //循环遍历寻找删除的id对应的下标值
        for (int i = 0; i < houseNums; i++) {
            if (delid == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        //先把index后面n-1个元素前移
        for (int i = index; i < houseNums - 1; i++) {//为什么减一？ 因为我们根本不需要到最后一个数，就可以完成前移的操作
            //当下标值大于等于我们的哨兵值的时候，使当前的引用指向后一个引用即可
            houses[i] = houses[i + 1];
        }
        //最后一个元素置为空
        houses[--houseNums] = null;
        return true;
    }

    //确认是否退出房屋出租系统
    public boolean quit() {
        do {
            System.out.println("确认是否退出(Y/N)");
            char answer = Utility.readChar();
            if (answer == 'y' || answer == 'Y') {
                break;
            } else if (answer == 'n' || answer == 'N') {
                return false;
            }
        } while (true);
        return true;
    }
    //查找房屋信息，返回一个房屋对象
    public House get(int id){
        if(id<=0 || id>houseNums){
            return null;
        }
        for (int i = 0; i < houseNums; i++) {
            if(id==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    //修改房屋的信息
    public boolean put(int id,int detail){
        for (int i = 0; i < houseNums; i++) {
            if(id==houses[i].getId()){
                houses[i].setRent(detail);
                break;
            }
        }
        return true;
    }
    public boolean put(int id,int detailId,String detail){
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(id == houses[i].getId()){
                index = i;
            }
        }
        switch(detailId){
            case 1:
                houses[index].setName(detail);
                break;
            case 2:
                houses[index].setPhone(detail);
                break;
            case 3:
                houses[index].setAddress(detail);
                break;
            case 5:
                houses[index].setStatus(detail);
                break;
        }
        return true;
    }

    public void runService() {
        do {
            houseView.showMainMenu();
            key = Utility.readChar();
            switch (key) {
                case '1':
                    houseView.addHouse();
                    break;
                case '2':
                    houseView.getHouse();
                    break;
                case '3':
                    houseView.deleteHouse();
                    break;
                case '4':
                    houseView.putHouse();
                    break;
                case '5':
                    houseView.listHouses();
                    break;
                case '6':
                    if (houseView.quitHouse()) {
                        loop = false;
                    }
                    break;
            }
        } while (loop);
    }
}
