package factory;

/**
 * Created by roxy on 11/15/2014.
 * Clasa MammalFactory extinde clasa abstracta AbstractFactory si implementeaza metodele abstracte getMammal si getReptile
 */
public class MammalFactory extends AbstractFactory {


    @Override
    Mammal getMammal(String mammal) {

       // Daca parametrul este null, metoda returneaza null
        if(mammal == null) {
            return null;
        }

        // Compar parametrul pentru a afla carei clase ii apartine
        if("Squirrel".equals(mammal)) {
            return new Squirrel();
        }
        else if("Rabbit".equals(mammal)) {
            return new Rabbit();
        }
        else if("Fox".equals(mammal)) {
            return new Fox();
        }



        return null;
    }

    @Override
    Reptile getReptile(String reptile) {
        return null;
    }
}
