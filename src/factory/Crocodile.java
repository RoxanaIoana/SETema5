package factory;

/**
 * Created by roxy on 11/15/2014.
 * In clasa Crocodile care implementeaza interfata Reptile, am definit metoda eat mostenita
 */
public class Crocodile implements Reptile {
    @Override
    public void eat() {
        System.out.println("Crocodiles eat fish");
    }
}
