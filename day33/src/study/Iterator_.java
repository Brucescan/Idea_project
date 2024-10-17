package study;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author bruces
 * @version 1.0
 */
public class Iterator_ {
    public static void main(String[] args) {
        //1、Iterator   对象称为迭代器，主要用于遍历Collection 集合中的元素
        //2、所有实现了Collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象
        //，即返回一个迭代器
        //3、Iterator  的结构
        //4、Iterator仅用于遍历集合，Iterator本身并不存在对象
//        Collection

        //迭代器的执行原理
        //注意，在调用it.next() 方法之前必须要调用it.hasNext() 进行检测。若不调用，且下一条记录无效，直接调用it.next()会抛出异常
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));


        System.out.println("col = " + col);
        //现在我们希望遍历这个 col集合
        //1、先得到这个集合对应的迭代器
        Iterator iterator = col.iterator();
        //2、使用while循环遍历即可
        while(iterator.hasNext()){//判断是否还有数据
            Object next = iterator.next();
            System.out.println(next);
        }
        //如果不重置并且 还要往下 遍历的话   会报出NoSuchElementException
        //再次遍历需要重置迭代器
        iterator = col.iterator();
    }
}


class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
