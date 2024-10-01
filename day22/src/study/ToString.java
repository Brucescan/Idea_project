package study;
//toString 方法，
//默认返回：全类名 (包名+类名) + @ + 哈希值的十六进制     查看Object的toString方法
//子类往往重写toString方法，用于返回对象的属性信息
//
//重写toString方法，打印或者拼接对象时，都会自动调用搞对象的toString形式

//当直接输出一个对象时，toString方法会被默认调用
public class ToString {
    public static void main(String[] args) {
        /*
         public String toString() {
              return getClass().getName() + "@" + Integer.toHexString(hashCode());
         }
         */
//        Object
        //可以看到对于Object类中的toString方法返回先是类的名称，加上@之后将哈希码值转换成16进制的字符串格式拼接起来
        Object o = new Object();
        System.out.println(o);
        //java.lang.Object@1eb44e46
        //若是toString 方法被重写，则会调用重写的toString 方法

    }
}
