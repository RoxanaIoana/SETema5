package factory;

/**
 * Created by roxy on 11/15/2014.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        // Aflu tipul clasei
        AbstractFactory mammalFactory = FactoryProducer.getFactory("Mammal");

        // Am declarat un obiect de tip Squirrel
        Mammal squirrel = mammalFactory.getMammal("Squirrel");

        // Apelez metoda eat folosind obiectul squirrel
        squirrel.eat();

        // Am declarat un obiect de tip Rabbit
        Mammal rabbit = mammalFactory.getMammal("Rabbit");

        // Apelez metoda eat folosind obiectul rabbit
        rabbit.eat();

        //Am declarat un obiect de tip Fox
        Mammal fox = mammalFactory.getMammal("Fox");

        //// Apelez metoda eat folosind obiectul fox
        fox.eat();

        // Aflu tipul clasei
        AbstractFactory reptileFactory = FactoryProducer.getFactory("Reptile");

        // Am declarat un obiect de tip Crocodile
        Reptile crocodile = reptileFactory.getReptile("Crocodile");

        // Apelez metoda eat folosind obiectul crocodile
        crocodile.eat();

        //Am declarat un obiect de tip Turtle
        Reptile turtle = reptileFactory.getReptile("Turtle");

        // Apelez metoda eat folosind obiectul turtle
        turtle.eat();

        //Am declarat un obiect de tip Snake
        Reptile snake = reptileFactory.getReptile("Snake");

        // Apelez metoda eat folosind obiectul snake
        snake.eat();


    }
}
