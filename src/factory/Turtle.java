package factory;

/**
 * Created by roxy on 11/15/2014.
 * In clasa Turtle care implementeaza interfata Reptile, am implementat metoda eat mostenita din interfata
 */
public class Turtle implements Reptile {
    @Override
    public void eat() {
        System.out.println("Turtle eats raspberry");
    }
}
