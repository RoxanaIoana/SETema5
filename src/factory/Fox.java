package factory;

/**
 * Created by roxy on 11/15/2014.
 *  Clasa Fox implementeaza interfata Mammal, in aceasta clasa definesc metoda eat
 */
public class Fox implements Mammal{
    @Override
    public void eat() {
        System.out.println("Fox eats cats");

    }
}
