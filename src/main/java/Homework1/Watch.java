package ua.org.oa.a.andrew.Homework1;

/**
 * Created by andr_ on 12.02.2017.
 */
public class Watch {
    class Year {
        int year;
        boolean leapYear;
        public Year(int year) {
            this.year = year;
            if ((year % 100) % 4 == 0) leapYear = true; // проверка на високостность года
        }
        public int getYear() {
            return year;
        }
        //расчет индекса года
        public int indexOfYear() {
            int x = year % 100; // вычисляем 2 последние цифры года
            int y = x / 12; // делим 2 последние цифры года на 12
            int z = x % 12; //остаток от деления 2х последних цифр года на 12
            int b = z / 4; // деление остатка на 4
            int iY = y + z + b; //индекс года
            return iY;
        }
        //расчет индекса века
        public int indexOfCentury() {
            if ((year / 100) == 19) return 1;
            return 0;
        }
    }
    class Month {
        private int monthNumber;
        public Month(int month) {
            monthNumber = month;
        }
        public int monthes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // получить количество дней в заданном месяце
        public int getDays(int monthNumber, boolean leapYear) {
            if (leapYear) monthes[1] = 29;
            return monthes[monthNumber - 1];
        }
        // индекс месяца
        public int indexOfMonth() {
            int m = 0;
            if ((monthNumber == 1) | (monthNumber == 10)) m = 6;
            if ((monthNumber == 2) | (monthNumber == 3) | (monthNumber == 11)) m = 2;
            if ((monthNumber == 4) | (monthNumber == 7)) m = 5;
            if (monthNumber == 5) m = 0;
            if (monthNumber == 6) m = 3;
            if (monthNumber == 8) m = 1;
            if ((monthNumber == 9) | (monthNumber == 12)) m = 4;
            return m;
        }
    }
    public enum DayOfWeek {
        MONDAY(0),
        TUESDAY(1),
        WEDNESDAY(2),
        THURSDAY(3),
        FRIDAY(4),
        SATURDAY(5),
        SUNDAY(6);
        private int param;
        DayOfWeek(int param) {
            this.param = param;
        }
        public int getParam() {
            return param;
        }
        //получение значения дня недели взависимости от полученного индекса
        public static DayOfWeek valueOf(int index) {
            for (DayOfWeek p : DayOfWeek.values()) {
                if (p.getParam() == index) {
                    return p;
                }
            }
            return null;
        }
    }
    class Day {
        private int day;
        Day(int day) {
            this.day = day;
        }
        public int getDay() {
            return day;
        }
    }
    public Day day;
    public Month month;
    public Year year;
    public Watch(int day, int month, int year) {
        this.day = new Day(day); //создание  объекта внутреннего класса Day в классе Date
        this.month = new Month(month); //создание  объекта внутреннего класса Month в классе Date
        this.year = new Year(year); //создание  объекта внутреннего класса Year в классе Date
    }
    //получить индекс дня недели
    public int getDayOfWeek() {
        int d = 0;
        d = (year.indexOfYear() + month.indexOfMonth() + day.getDay() + year.indexOfCentury()) % 7 - 1;
        if (d == -1) d = 6;
        return d;
    }
    // получить порядковый номер дня в году
    public int getDayOfYear() {
        if (year.leapYear) month.monthes[1] = 29;
        int sum = 0;
        for (int i = 0; i < month.monthNumber-1; i++) {
            sum += month.monthes[i];
        }
        return sum + day.getDay();
    }
    //получить кол-во дней, которое прошло с момента начала нашей эры (т.е. первый день=1)
    public int getIndexDayinEra() {
        return (year.getYear() - 1) * 365 + (year.getYear() - 1) / 4 + getDayOfYear();
    }
    //расчет количества дней в заданно временно промежутке
    public int daysBetween(Watch date) {
        return Math.abs(getIndexDayinEra() - date.getIndexDayinEra());
    }
}

