package AnonymousClasses;

/**
 * Created by andr_ on 29.01.2017.
 */
public class App {
    public static void main(String[] args) {
        Car myCar = new Car("Ferrari", "F500", 1_000_000);
        System.out.println(myCar);
        Car myCar1 = new Car("Honda", "RX5", 55_000){
            @Override
            public String toString() {
                return "Car{" +
                        "type of car =" + getType()+ '\'' +
                        ", name of car='" + getName()+ '\'' +
                        ", +  price of car='" + getPrice() + "$" + '\'' +
                        '}';
            }
        };

        System.out.println(myCar1);
        Car myCar2 = new Car("Honda", "Civic", 47_000){
            @Override
            public String toString() {
                return "Car{" +
                        "type of auto=" + getType()+ '\'' +
                        ", name of auto='" + getName()+ '\'' +
                        ", +  price of auto='" + getPrice() + '\'' +
                        '}';
            }
        };
    }


}
