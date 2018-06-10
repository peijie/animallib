package Animal;

/**
 * This class models Chicken which and walk, sing but cannot fly. So should not inherit form Bird
 */
public class Chicken extends WalkableSingableAnimal {

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
