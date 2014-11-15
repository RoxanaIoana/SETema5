package factory;

/**
 * Created by roxy on 11/15/2014.
 * Clasa Rabbit implementeaza interfata Mammal, aici scriu cod pentru metoda eat mostenita din interfata
 */
public class Rabbit implements Mammal {

    @Override
    public void eat() {
        System.out.println("Rabbit eats carrot");

    }
}
