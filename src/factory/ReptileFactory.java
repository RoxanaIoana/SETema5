package factory;

/**
 * Created by roxy on 11/15/2014.
 * Clasa ReptileFactory extinde clasa abstracta AbstractFactory si implementeaza metodele abstracte ale acesteia
 */
public class ReptileFactory extends AbstractFactory{
    @Override
    Mammal getMammal(String mammal) {
        return null;
    }

    @Override
    Reptile getReptile(String reptile) {
        if(reptile == null) {
            return null;
        }

        // Compar parametrul pentru a afla carei clase ii apartine
        if("Crocodile".equals(reptile)) {
            return new Crocodile();
        }
        else if("Turtle".equals(reptile)) {
            return new Turtle();
        }
        else if("Snake".equals(reptile)) {
            return new Snake();
        }


        return null;
    }
}
