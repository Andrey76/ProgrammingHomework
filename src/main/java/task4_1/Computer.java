package ua.org.oa.a.andrew.task4_1;

/**
 * Created by andr_ on 13.03.2017.
 */
public class Computer implements Comparable<Computer> {
    private int numberOfCores;
    private String coreSpeed;
    private int ram;

    public Computer(int numberOfCores, String coreSpeed, int ram) {
        this.numberOfCores = numberOfCores;
        this.coreSpeed = coreSpeed;
        this.ram = ram;
    }
    // implement interface Comparable
    @Override
    public int compareTo(Computer o) {
        if (this.ram == o.ram) {
            return 0;
        } else if (this.ram > o.ram) {
            return 1;
        } else
            return -1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                '}';
    }
}


