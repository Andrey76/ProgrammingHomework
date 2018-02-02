package Homework7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by andr_ on 10.04.2017.
 */
public class Clock extends Thread {
    static {
        i = 2;
    }
    static int i  = 1;


    @Override
    public void run() {

           DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           while (true){
           Calendar cal = Calendar.getInstance();
           System.out.println(df.format(cal.getTime()));
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
