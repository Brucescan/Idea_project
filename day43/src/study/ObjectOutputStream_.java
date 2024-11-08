package study;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author bruces
 * @version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) {
        //对象处理流,以前我们保存值，现在我们保存数据类型
        //序列化和反序列化
        //1、序列化就是在保存数据时，保存数据的值和数据类型
        //2、反序列化就是在恢复数据时，恢复数据的值和数据类型
        //3、需要让某个对象支持序列化机制，则必须让其类是可序列化的，为了让某个类是可序列化的
        //该类必须实现如下两个接口之一：
        //Serializable
        //Externalizable
    }

    @Test
    public void m1() throws IOException {
        String filePath = "./src/study/data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到data.dat
        oos.write(100);//int -> Integer (实现了Serializable)
//        Integer
        oos.writeBoolean(true);
        oos.writeChar('a');//char -> Character(实现了Serializable)
        oos.writeDouble(9.5);//double -> Double (实现了Serializable)
        oos.writeUTF("你好世界");//String 也是实现了Serializable接口
        //保存一个dog对象
        oos.writeObject(new Dog("旺财",18));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

//如果需要序列化某个对象，需要实现Serializable
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}