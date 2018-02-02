package Homework3Generics;


import java.util.Arrays;

public class GenericStorage<T> {
    public T[] array;
    private int allocatedSize;
    private int actuallSize;

    GenericStorage() {
        array = (T[]) new Object[10];
        this.allocatedSize = 10;
    }

    GenericStorage(int allocatedsize) {
        array = (T[]) new Object[allocatedsize];
        this.allocatedSize = allocatedsize;
    }

    public void add(T obj) {
        if (actuallSize == allocatedSize)
            throw new IndexOutOfBoundsException("Index " + actuallSize + " is out of bounds!");
        else {
            array[actuallSize] = obj;
            actuallSize++;
        }
    }

    public T get(int index) {
        if (index >= allocatedSize) throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        return array[index];
    }

    public T[] getAll() {
        System.out.println(Arrays.toString(array));
        return array;
    }

    public T update(int index, T obj) throws Exception {
        if (index > actuallSize) {
            throw new Exception("NotActualSizeException");
        }
        return array[index] = obj;
    }

    public void delete(int index) throws Exception {
        if (index > actuallSize) {
            throw new Exception("CannotDeleteEmptyCell");
        }
        for (int i = index; i < actuallSize; i++) {
            array[i] = array[i + 1];
        }
        --actuallSize;
    }

    public void delete(T obj) throws Exception {
        for(int i = 0; i < allocatedSize; i++){
            if(array[i] == obj){
                delete(i);
            }
        }
    }
    public  int getActuallsize(){
        return actuallSize;
    }


    public int getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(int allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    public int getActuallSize() {
        return actuallSize;
    }

    public void setActuallSize(int actuallSize) {
        this.actuallSize = actuallSize;
    }
}
