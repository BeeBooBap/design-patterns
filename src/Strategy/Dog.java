package Strategy;

public class Dog extends Animal {

    public Dog(String name) {
        super();
        setName(name);
        setSound("Bark");
        setFlyingType(new CantFly()); // passing interface implementation
    }


}
