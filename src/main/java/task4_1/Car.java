package ua.org.oa.a.andrew.task4_1;

/**
 * Created by andr_ on 13.03.2017.
 */
public class Car {
    private String type;
    private String color;
    private String brand;
    private int yearOfIssue;

    public Car(String type, String color, String brand, int yearOfIssue) {
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
