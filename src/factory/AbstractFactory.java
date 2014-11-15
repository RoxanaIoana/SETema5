package factory;

/**
 * Created by roxy on 11/15/2014.
 * Clasa abstracta care contine metodele abstracte getMammal(String mammal) si getReptile(String reptile) implementate in FactoryProducer
 */
public abstract class AbstractFactory {

    abstract Mammal getMammal(String mammal);
    abstract Reptile getReptile(String reptile);
}
