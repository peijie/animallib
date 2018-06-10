package Animal;

public class WalkableAnimal extends Animal implements Walkable{

    public void walk() {
        System.out.println("I am walking");
    }

}
