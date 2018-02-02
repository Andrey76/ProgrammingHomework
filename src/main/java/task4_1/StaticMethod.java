package ua.org.oa.a.andrew.task4_1;

/**
 * Created by andr_ on 13.03.2017.
 */
public class StaticMethod {
    public static <T extends Comparable> T finddMax(T[] array) {
        T max;
        max = array[0];
        for(int i = 0; i < array.length; i++){
           int result = max.compareTo(array[i]);
            if(result < 0){
                max = array[i];
            }
        }
        return max;
    }
}
