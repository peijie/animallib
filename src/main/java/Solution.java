import Animal.*;


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



    }


}
