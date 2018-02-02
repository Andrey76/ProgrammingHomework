package task4_2;

import java.util.Iterator;

/**
 * Created by andr_ on 15.03.2017.
 */
public class MyDequeImpl<E> implements MyDeque<E>{
    private int size = 0;
    private Node<E> first;
    private Node<E> last;
    Object[] array;

    private static class Node<E> {
        // хранимый элемент
        E element;
        // ссылка на следующий элемент списка
        Node<E> next;
        // ссылка на предыдущий элемент списка
        Node<E> prev;

        Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void addFirst(E e) {
        Node<E> temp = new Node<E>(e, null, first);
        if (first == null) {
            last = temp;
        } else {
            first.prev = temp;
        }
        size++;
        first = temp;
    }

    @Override
    public void addLast(E e) {
        Node<E> temp = new Node<E>(e, last, null);
        if (last == null) {
            first = temp;
        } else {
            last.next = temp;
        }
        size++;
        last = temp;
    }

    @Override
    public E removeFirst() {
        Node<E> temp = first;
        first.prev = null;
        first = first.next;
        size--;
        return temp.element;
    }

    @Override
    public E removeLast() {
        Node<E> temp = last;
        last = last.prev;
        last.next = null;
        size--;
        return temp.element;
    }

    @Override
    public E getFirst() {
        return first.element;
    }

    @Override
    public E getLast() {
        return last.element;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element == null) {
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.element)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.element = null;
            x.prev = null;
            x.next = null;
            x = next;
        }
        first = null;
        last = null;
        size = 0;

    }

    @Override
    public Object[] toArray() {
        array = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            array[i] = x.element;
            i++;
        }
        return array;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsAll(MyDeque<? extends E> deque) {
        int l = deque.size();
        boolean result = false;
        for (Node<E> x = first; x != null; x = x.next) {
            if (deque.contains(x.element)) {
                continue;
            } else {
                result = false;
                return result;
            }
        }
        if (l == size) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        String s = "";
        Node<E> entry;
        for (entry = first; entry.next != null; entry = entry.next) {
            s = s + entry.element.toString() + ", ";
        }
        s = s + " " + entry.element.toString();
        s = "{" + s + "}";
        return s;
    }

    private class IteratorImpl implements Iterator<E> {
        Node<E> current;
        boolean flag;

        private IteratorImpl() {
            current = new Node<E>(null, null, first);
        }

        // проверяет, есть ли следующий элемент для выборки методом next
        public boolean hasNext() {
            if (current.next != null) {
                return true;
            }
            return false;
        }

        // возвращает следующий элемент
        public E next() {
            current = current.next;
            flag = true;
            return current.element;
        }

        // удаляет элемент, который был возвращен ранее методом next
        public void remove() {
            if (!flag) {
                throw new IllegalStateException();
            }
            current.prev = null;
            flag = false;
        }
    }

    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

}
