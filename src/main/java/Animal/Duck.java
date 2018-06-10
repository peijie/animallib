package Animal;

/**
 * this class models Duck which can sing and swim
 */
public class Duck extends Bird implements Swimmable{

    /**
     * This method override sing() in base class
     */
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    /**
     * This method implements Swimmable interface
     */
    public void swim() {
        System.out.println("I am swimming");
    }


}
