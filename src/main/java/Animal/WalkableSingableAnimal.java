package Animal;

public class WalkableSingableAnimal extends Animal implements Singable {

    /**
     * this method implements Singable interface
     */
    public void sing() {
        System.out.println("I am Singing");
    }
}
