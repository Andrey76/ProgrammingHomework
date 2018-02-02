package Homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andr_ on 10.04.2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Clock.i);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        System.out.println("Choose what task u want to start: \n  1: \n 2: \n 3:");
        try {
            choice = br.readLine();
            switch (choice) {
                case ("1"):
                    Clock myClock = new Clock();
                    myClock.start();

                    //       String s = br.readLine();
//                    if (s.isEmpty()) {
//
//                    } else {
//                        myClock.interrupt();
//                    }
                case ("2"):
                    final Object mutexA = new Object();
                    final Object mutexB = new Object();

                    new Thread() {
                        @Override
                        public void run() {
                            try {
                                synchronized (mutexA) {
                                    Thread.sleep(50);
                                    synchronized (mutexB) {
                                        System.out.println("OMG!");
                                    }
                                }
                            } catch (InterruptedException ex) {
                            }
                        }
                    }.start();

                    new Thread() {

                        @Override
                        public void run() {
                            try {
                                synchronized (mutexB) {
                                    Thread.sleep(50);
                                    synchronized (mutexA) {
                                        System.out.println("OMG!");
                                    }
                                }
                            } catch (InterruptedException ex) {
                            }
                        }
                    }.start();
                case ("3"):
                    System.out.println("No synchronize rezult");
                    Counter count = new Counter();
                    Counter count2 = new Counter();
                    Counter count3 = new Counter();
                    System.out.println("___________________ \n Synchronize rezult");
                    CounterSync counts1 = new CounterSync();
                    CounterSync counts2 = new CounterSync();
                    CounterSync counts3 = new CounterSync();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
