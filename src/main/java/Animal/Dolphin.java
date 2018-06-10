package Animal;

/**
 * This class model Dolphin. Based on requirements, it should not inherit from Fish.
 * To avoid duplicated code, the swim behaviour can be delegated to other objects such as fish
 */
public class Dolphin extends Animal implements Swimmable {

    //the object to delegate swim
    private Swimmable swimmer = null;

    /**
     * The constructor.
     * @param swimmer The object to delegate swim
     */
    public Dolphin(Swimmable swimmer) {
        if(swimmer == null)
            throw new IllegalArgumentException("swimmer cannot be null");
        setName("Dolphin");
        setColor("Grey");

    }

    /**
     * The getter of the swimmer
     * @return The object to delegate swim
     */
    public Swimmable getSwimmer() {
        return swimmer;
    }

    /**
     * The setter of the swimmer
     * @param swimmer The object to delegate swim
     */
    public void setSwimmer(Swimmable swimmer) {
        if(swimmer == null)
            throw new IllegalArgumentException("Fish cannot be null");

        this.swimmer = swimmer;
    }

    /**
     * This method implements Swimmable interface using the swim function of swimmer.
     */
    public void swim() {
        if(swimmer == null)
            throw new NullPointerException("swimmer cannot be null");
        swimmer.swim();
    }
}

