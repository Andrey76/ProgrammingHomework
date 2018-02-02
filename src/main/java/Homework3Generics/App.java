package Homework3Generics;

/**
 * Created by andr_ on 12.03.2017.
 */
public class App {
    public static void main(String[] args) throws Exception {
        GenericStorage<String> gstor = new GenericStorage<>();
        gstor.add("11");
        gstor.add("2");
        gstor.add("3");
        gstor.add("4");
        gstor.add("5");
        gstor.add("6");
        for (int i = 0; i < gstor.getActuallSize(); i++) {
            System.out.println(gstor.get(i));
        }
        gstor.getAll();
        gstor.update(2, "33");
        gstor.getAll();
        gstor.delete(1);
        gstor.getAll();
        gstor.delete("11");
        gstor.getAll();
        System.out.println(gstor.getActuallsize());
        GenericStorage<Double> gstor2 = new GenericStorage<>(10);
        gstor2.add(99.9);
        gstor2.add(99.8);
        gstor2.add(99.7);
        gstor2.add(99.6);
        gstor2.add(99.5);
        gstor2.add(99.4);
        gstor2.add(99.3);
        gstor2.add(99.2);
        gstor2.add(99.1);
        gstor2.getAll();
        gstor2.update(0, 99.999);
        gstor2.getAll();
        gstor2.delete(1);
        gstor2.getAll();
        gstor2.delete(99.1);
        gstor2.getAll();



    }
}
