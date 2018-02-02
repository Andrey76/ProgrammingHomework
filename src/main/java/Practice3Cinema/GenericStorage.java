package ua.org.oa.a.andrew.Practice3Cinema;


public interface GenericStorage<K, V> {
    V get (K id);
    K put (V value);
    V delete (K id);
    class Node{
       // private K id;
        //private V value;
    }

}
