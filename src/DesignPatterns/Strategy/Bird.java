package DesignPatterns.Strategy;

public class Bird extends Animal {

    public Bird(String name) {
        super();
        setName(name);
        setSound("Tweet");
        setFlyingType(new ItFlys()); // passing interface implementation
    }
}
