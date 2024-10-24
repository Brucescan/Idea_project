package chapter13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        New n1 = new New("新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣域\"引民众担忧");
        New n2 = new New("新闻二：男子突然想起2个月前钓的鱼还在网兜中,捞起一看赶紧放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(n1);
        arrayList.add(n2);
        arrayList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -1;
            }
        });
        System.out.println("arrayList = " + arrayList);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            New oneNew = (New) next;
            oneNew.setTitle(oneNew.getTitle().substring(0, 15) + "...");
        }
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class New {
    private String title;
    private String text;

    public New(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                '}';
    }
}