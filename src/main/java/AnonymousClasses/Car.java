package AnonymousClasses;

/**
 * Created by andr_ on 29.01.2017.
 */
public class Car {
    private String name;
    private String type;
    private int price;

    public Car(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return type != null ? type.equals(car.type) : car.type == null;

    }

    public class Clasz {

    }

}
