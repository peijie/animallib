package Animal;

/**
 * This class models rooster. It is a special chicken and is proper to inherit from Chicken class.
 * Other ways of modeling usually including composition and delegation. But for this case inheritance
 * is still proper way
 */
public class Rooster extends Chicken {

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
