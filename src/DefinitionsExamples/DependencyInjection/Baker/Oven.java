package DefinitionsExamples.DependencyInjection.Baker;

public class Oven {
    //...

    public void setOven(){
        System.out.println("Oven has been set.");
    }

    public void switchOn(){
        System.out.println("Oven has been switched on.");
    }

    public void switchOff(){
        System.out.println("Oven has been switched off.");
    }

    public void putInItems(){
        System.out.println("Baking...");
    }

    public void takeOutItems(){
        System.out.println("Your baked goods are ready.");
    }
}
