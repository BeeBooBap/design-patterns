package DefinitionsExamples.DependencyInjection.Baker;

public class Assistant {
    //...

    public Ingredients fetchIngredients(){
        return new Ingredients();
    }

    public Oven setUpOven(){
        return new Oven();
    }
}
