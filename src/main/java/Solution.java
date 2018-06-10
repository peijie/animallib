import Animal.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();


        //Parrot near Dog
        Parrot parrotDog = new Parrot(new Dog());
        parrotDog.sing();

        //Parrot near Cat
        Parrot parrotCat = new Parrot(new Cat());
        parrotCat.sing();

        Animal[] animals = new Animal[] {
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(new Fish()),
                new Dog(),
                new Butterfly(),
                new Cat()
        };


        List<Animal> flyableAnimals = Arrays.asList(animals).stream().filter(a -> a instanceof Swimmable).collect(Collectors.toList());
        flyableAnimals.forEach(item -> System.out.println(item.getName()));

        long flyableCount = Arrays.stream(animals).filter( a -> a instanceof Flyable).count();
        long walkableCount = Arrays.stream(animals).filter( a -> a instanceof WalkableAnimal).count();
        long singableCount = Arrays.stream(animals).filter( a -> a instanceof Singable).count();
        long swimableCount = Arrays.stream(animals).filter( a -> a instanceof Swimmable).count();

        System.out.println("Number of animals can fly: " + flyableCount);
        System.out.println("Number of animals can walk: " + walkableCount);
        System.out.println("Number of animals can sing: " + singableCount);
        System.out.println("Number of animals can swim: " + swimableCount);




    }


}
