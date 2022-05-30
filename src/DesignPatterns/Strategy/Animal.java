package DesignPatterns.Strategy;

public class Animal {

    private String sound;
    private String name;
    private Flys flyingType; //interface instant

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return this.sound;
    }

    public String getName() {
        return this.name;
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    /**
     *
     * @param newFlyingType
     * Interface instance is passed as a parameter, but when passed it will only ever be an implementation (ItFlys or
     * CantFly).
     */
    public void setFlyingType(Flys newFlyingType) {
        flyingType = newFlyingType;
    }

}
