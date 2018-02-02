package ua.org.oa.a.andrew.task4_1;

/**
 * Created by andr_ on 15.03.2017.
 */
public class App {
    public static void main(String[] args) {
        Computer myComputer = new Computer(2, "2000", 4096);
        Computer myComputer1 = new Computer(4, "2600", 6096);
        Computer myComputer2 = new Computer(8, "4000", 16000);
        Computer myComputer3 = new Computer(1, "3200", 8192);
        System.out.println(myComputer1.compareTo(myComputer2));
        Computer [] myComputers = {myComputer,myComputer1,myComputer2,myComputer3};
        System.out.println(StaticMethod.finddMax(myComputers));
        Car myCar = new Car("sedan", "black", "Honda", 1980);
        Car myCar1 = new Car("sedan", "red", "Mazda", 2015);
        Car myCar2 = new Car("sedan", "blue", "Porshe", 1999);
        Car[] cars = {myCar,myCar1,myCar2};
        //next string is commented, becase its give a compilation mistake
        //System.out.println(StaticMethod.finddMax(cars));
        String[]myString = {"B","A","Z"};
        //compare array of strings by our static method
        System.out.println(StaticMethod.finddMax(myString));
        //compare array of integers by our static method
        Integer[] ints = {1,2,3,4,11,22,44,33};
        System.out.println(StaticMethod.finddMax(ints));
    }
}
