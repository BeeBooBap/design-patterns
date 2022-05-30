package DesignPatterns.Strategy;

/**
 * Rather than having a fly() method within Animal, we can have an interface with separate implementations of whether
 * an animal can fly or not (ItFlys and CantFly). We can then hav the interface Flys as an instance of animal, and
 * have an implementation of Flys within the subclasses of Animal. That way, it reduces unnecessary code such as if
 * an animal that does not fly has to implement a fly method in Animal, and it allows for interchangeability as you
 * can easily change the implementation choice (such as changing ItFlys to CantFly).
 */
public interface Flys {

    String fly();
}

