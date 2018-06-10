package Animal;


public class Butterfly extends Caterpillar implements Flyable {


    public Butterfly() {
        setName("Butterfly");
    }


    public void fly() {
        System.out.println("Animal.Butterfly flying");
    }
}