package study;
//多态数组
//数组的定义为父类类型，里面保存的实际元素类型为子类类型


public class PolyArray {
    public static void main(String[] args) {
        Person[] arr = new Person[5];
        arr[0] = new Person("bruces",18);
        arr[1] = new Student("jack",30,60);
        arr[2] = new Student("smith",20,100);
        arr[3] = new Teacher("liu",40,5000);
        arr[4] = new Teacher("su",30,6000);
//        Student s1 = (Student)arr[1];
//        Teacher t1 = (Teacher)arr[3];
//        s1.study();
//        t1.teach();

        for (Person value : arr) {
            //编译类型是Person，运行类型是根据实际情况有jvm机来进行判断
            System.out.println(value.say());//动态绑定机制
            if(value instanceof Student){//判断类型
//                Student s = (Student)value;//向下转型，使其能够调用子类的特有的方法
//                s.study();//调用方法
                //优化
                ((Student)value).study();
            } else if (value instanceof Teacher) {
//                Teacher t = (Teacher)value;
//                t.teach();
                ((Teacher)value).teach();
            }

        }


    }
}


