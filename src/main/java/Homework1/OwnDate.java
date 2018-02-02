package ua.org.oa.a.andrew.Homework1;


import java.util.*;

public class OwnDate {
    private Day myDay;
    private Year myYear;
    private Month myMonth;

    public OwnDate(int myDay, int myMonth, int myYear) {
        this.myDay = new Day(myDay);
        this.myMonth = new Month(myMonth);
        this.myYear = new Year(myYear);
    }

    public Day getMyDay() {
        return myDay;
    }

    public void setMyDay(Day myDay) {
        this.myDay = myDay;
    }

    public Year getMyYear() {
        return myYear;
    }

    public void setMyYear(Year myYear) {
        this.myYear = myYear;
    }

    public Month getMyMonth() {
        return myMonth;
    }

    public void setMyMonth(Month myMonth) {
        this.myMonth = myMonth;
    }


    public class Day {
        private int days;

        Day(int myDay) {
            this.days = myDay;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }

    public class Year {
        private int years;
        private boolean leapyear;
        private int totalDaysInYear;

        Year(int myYear) {
            this.years = myYear;
            if (years % 4 == 0) {
                if ((years % 100 != 0) || (years % 400 == 0))
                    setLeapyear(true);
                settotalDaysInYear(366);
            } else
                setLeapyear(false);
            settotalDaysInYear(365);
        }

        public int indexOfYear() {
            int x = years % 100; // вычисляем 2 последние цифры года
            int y = x / 12; // делим 2 последние цифры года на 12
            int z = x % 12; //остаток от деления 2х последних цифр года на 12
            int b = z / 4; // деление остатка на 4
            int iY = y + z + b; //индекс года
            return iY;
        }


        public int gettotalDaysInYear() {
            return totalDaysInYear;
        }

        public void settotalDaysInYear(int totalDaysInYear) {
            this.totalDaysInYear = totalDaysInYear;
        }

        public boolean isLeapyear() {
            return leapyear;
        }

        public void setLeapyear(boolean leapyear) {
            this.leapyear = leapyear;
        }

        public void getLeapyear() {
            this.leapyear = leapyear;
        }

        public int getYears() {
            return years;
        }

        public void setYears(int years) {
            this.years = years;
        }

    }

    public class Month {
        private int monthes;
        int monthesArray[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public int getMonthes() {
            return monthes;
        }

        public void setMonthes(int monthes) {
            this.monthes = monthes;
        }

        Month(int myMonth) {
            this.monthes = myMonth;
            if (monthes == 0 || monthes > 12) {
                System.out.println("You input wrong serial number. Try to input number from 1 till 12");
            }
        }

        public int monthIndex() {
            int m = 0;
            if (monthes == 3) m = 1;
            if (monthes == 4) m = 2;
            if (monthes == 5) m = 3;
            if (monthes == 6) m = 4;
            if (monthes == 7) m = 5;
            if (monthes == 8) m = 6;
            if (monthes == 9) m = 7;
            if (monthes == 10) m = 8;
            if (monthes == 11) m = 9;
            if (monthes == 12) m = 10;
            if (monthes == 2) m = 12;
            if (monthes == 1) m = 11;

            return m;
        }
    }

    public void daysBetween() {
        int specifiendYear = getMyYear().getYears();
        int z = getMyYear().gettotalDaysInYear();
        Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        int currentDay = calendar.get(Calendar.DAY_OF_YEAR);
        //SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy.MM.dd.");
        int DaysInspecifiendYear = getMyDay().getDays() + getMyYear().getYears() * 365 + getMyYear().getYears() / 4 - getMyYear().getYears() / 100 + getMyYear().getYears() / 400;
        int DaysInCurrentYear = currentDay + currentYear * 365 + currentYear / 4 - currentYear / 100 + currentYear / 400;
        System.out.println("Разница между введенной датой и текущей = " + Math.abs(DaysInspecifiendYear - DaysInCurrentYear) + " days.");
    }

    public enum Days {
        SUNDAY(0),
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6);

        private int index;

        Days(int index) {

            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public static Days valueOf(int index) {
            for (Days d : Days.values()) {
                if (d.getIndex() == index) {
                    return d;
                }

            }
            return null;
        }
    }

    public int getDayOfWeek() {
        int indexOfWeek;
        int dayOfWeek;
        int monthNum = getMyMonth().monthIndex();
        int yearNum = getMyYear().getYears();
        int indexOfCentury = getMyYear().getYears() / 100;
        if (getMyMonth().getMonthes() < 3) {
            monthNum += 10;
        } else {
            monthNum = monthNum - 2;
        }

        indexOfWeek = ((getMyDay().getDays() + Math.abs((13 * monthNum - 1) / 5) + myYear.indexOfYear() +
                Math.abs(myYear.indexOfYear() / 4) + Math.abs(indexOfCentury / 4) - 2 * indexOfCentury) % 7);
        return indexOfWeek;
    }

    public int GetDayOfYear() {
        int result = 0;
        if (myYear.isLeapyear()) {
            myMonth.monthesArray[1] = 29;
            for (int i = 0; i < getMyMonth().getMonthes(); i++) {
                result += myMonth.monthesArray[i];
                break;
            }

        }
        return result += getMyDay().getDays();
    }
}












