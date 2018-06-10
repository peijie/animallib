package Animal;

public class Caterpillar extends WalkableAnimal {

    public Caterpillar() {
        setName("Caterpillar");
    }

     public Butterfly transform() {
        Butterfly butterfly = new Butterfly();
        butterfly.setName(this.getName());

        return butterfly;
    }

}
