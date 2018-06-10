package Animal;

/**
 * This class models fish. It don't walk and sing. But it swims. It should inherits from
 * Animal but implements Swimmable interface.
 */
public class Fish extends Animal implements Swimmable {

    /**
     * The constructor of the Fish. Set name to "Fish"
     */
    public Fish() {
        setName("Fish");
    }

    /**
     * implement swim method
     */
    public void swim() {
        System.out.println("I am swimming");
    }
}
