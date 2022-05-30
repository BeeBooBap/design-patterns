package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Animal doggy = new Dog("doggy");
        Animal birdie = new Bird("birdie");

        System.out.println("Dog: " + doggy.getName());
        System.out.println("Bird: " + birdie.getName());

        System.out.println("Dog: " + doggy.tryToFly());
        System.out.println("Bird: " + birdie.tryToFly());

    }
}
