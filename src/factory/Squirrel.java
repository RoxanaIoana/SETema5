package factory;

/**
 * Created by roxy on 11/15/2014.
 * Clasa Squirrel implementeaza interfata Mammal, in aceasta clasa implementez metoda eat
 */
public class Squirrel implements Mammal {

    @Override
    public void eat() {
        System.out.println("Squirrel eats peanuts");
    }
}
