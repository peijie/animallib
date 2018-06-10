package Animal;

public class Shark extends Fish {

    public Shark() {
        setColor("Grey");
        setName("Shark");
    }

    public void eat(Fish other) {
        System.out.println("Eating " + other.getName());
    }

}
