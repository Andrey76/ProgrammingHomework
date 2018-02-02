package ua.org.oa.a.andrew.Homework1;

/**
 * Created by andr_ on 26.01.2017.
 */
public class App {
    public static void main(String[] args) {
        OwnDate myOwnDate = new OwnDate(20, 01, 2017);
        myOwnDate.daysBetween();
        int index = myOwnDate.getDayOfWeek();
        System.out.println("Порядковый номер дня в году - "  +  myOwnDate.GetDayOfYear() + " . ");
        System.out.println("День недели введенной даты - " + OwnDate.Days.valueOf(index) + " . ");

    }
}
