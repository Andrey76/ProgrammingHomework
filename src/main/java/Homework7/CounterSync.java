package Homework7;

/**
 * Created by andr_ on 13.04.2017.
 */
public class CounterSync implements Runnable {
    private Thread thread;
    private static int count = 0;
    private static int count2 = 0;
    public CounterSync() {
        thread = new Thread(this);
        thread.start();
    }

    public synchronized static void compareCount(){
        if(count == count2) {
            System.out.println("Countera are equals to each other"+ " by " + Thread.currentThread().getName());

        }
        else{
            System.out.println("Countera are not equals to each other"+ " by " + Thread.currentThread().getName());
        }

    }
    public synchronized static void increaseCount1(){
        count++;
    }
    public synchronized static void increaseCount2(){
        count2++;
    }
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        Counter.compareCount();
        Counter.increaseCount1();
        System.out.println("Counter 1 = " + count + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(10);
            Counter.increaseCount2();
            System.out.println("Counter 2 = " + count+ " by"  + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount2(int count2) {
        this.count2 = count2;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                ", count2=" + count2 +
                '}';
    }

}

