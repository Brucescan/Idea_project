package study;

//equals方法
//1、对于==来说，基本数据类型比较数值，引用类型比较地址
//2、equals方法 是Object类中的方法，只能判断引用类型，具体可以查看源码
//3、默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如Integer,String 等类型的源码
public class Equals01 {
    public static void main(String[] args) {
//        "hahha".equals("agsdjakd");
        /*String 中的      equals的源码
        public boolean equals(Object anObject) {
        if (this == anObject) {//判断是否是同一对象
            return true;
        }
        if (anObject instanceof String) {//判断类型是否想等
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {//先判断长度，再判断内容
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//一个一个的比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//如果两个字符串的所有字符都相等，则直接返回false
            }
        }
        return false;
    }
         */


        //Object中的equals
        /*
        public boolean equals(Object obj){
            //==在两个都是引用类型情况下，会判断地址
            return (this == obj);//   从这里可以看出Object中的equals方法只会判断引用类型，即地址是否相同
        }

        //Integer中的equals
        public boolean equals(Object obj){
            if(obj instanceof Interger){//先判断运行类型
                return value == ((Integer)obj).intValue();//判断值是否相同
            }
            return false;
        }
         */
        Integer integer = new Integer(1000);
        Integer integer1 = new Integer(1000);
        System.out.println(integer == integer1);//结果为false，因为对于==号以及引用类型来说   这个是判断两个的地址是否相同
        System.out.println(integer.equals(integer1));//结果为true，因为重写后的equals不是判断地址了，二十判断内容是否相同

        String str1 = new String("hahah");
        String str2 = new String("hahah");
        System.out.println(str1 == str2);//false,判断引用类型的时候是判断地址的
        System.out.println(str1.equals(str2));//true，对于重写的方法，先判断类型，再判断的是内容是否想等

    }
}
