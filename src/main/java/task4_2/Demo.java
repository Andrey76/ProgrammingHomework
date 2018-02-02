package ua.org.oa.a.andrew.task4_2;

import java.util.Iterator;

/**
 * Created by andr_ on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
            MyDeque<Number> deque = new MyDequeImpl<Number>();
            deque.addFirst(433);
            deque.addLast(8.88);

//            for (Number element : deque) {
//                System.out.println(element);
//            }
//            Iterator<Number> it = deque.iterator();
//            while (it.hasNext())
//                System.out.println(it.next());

    }
}

