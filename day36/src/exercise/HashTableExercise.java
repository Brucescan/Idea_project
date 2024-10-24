package exercise;

import java.util.Hashtable;

/**
 * @author bruces
 * @version 1.0
 */
public class HashTableExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("join",100);
        hashtable.put(null,100);//异常
        hashtable.put("john",null);//异常
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lic",88);
        System.out.println(hashtable);
    }
}
