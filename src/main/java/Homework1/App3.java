package ua.org.oa.a.andrew.Homework1;

/**
 * Created by andr_ on 12.02.2017.
 */
public class App3 {
    public static void main(String[] args) {
        //Вложенные классы и перечисления
        Watch date1 = new Watch(12, 4, 1963);
        Watch date2 = new Watch(4, 6, 2017);
        int index1 = date1.getDayOfWeek();
        System.out.println("День недели для первой даты: " + Watch.DayOfWeek.valueOf(index1));
        System.out.println("Порядковый номер дня в году: " + date1.getDayOfYear());
        int index2 = date2.getDayOfWeek();
        System.out.println("День недели для второй даты: " + Watch.DayOfWeek.valueOf(index2));
        System.out.println("Порядковый номер дня в году: " + date2.getDayOfYear());
        int daysBetween = date2.daysBetween(date1);
        System.out.println("Количество дней между заданными датами: " + daysBetween);
    }
}
