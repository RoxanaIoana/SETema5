package factory;

/**
 * Created by roxy on 11/15/2014.
 * Am folosit aceasta clasa pentru a determina tipul claselor
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String parametru) {
        if(parametru.equals("Mammal")) {
            return new MammalFactory();
        }
        else if (parametru.equals("Reptile")) {
            return new ReptileFactory();
        }

        return null;
    }
}
