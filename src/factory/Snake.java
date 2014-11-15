package factory;

/**
 * Created by roxy on 11/15/2014.
 * In clasa Snake care implementeaza interfata Reptile, am definit metoda eat
 */
public class Snake implements Reptile {

    @Override
    public void eat() {
        System.out.println("Snake eats frogs");
    }
}
