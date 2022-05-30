package DefinitionsExamples.DependencyInjection.Baker;

public class Baker {
    Assistant assistant;
    Ingredients ingredients;
    Oven oven;

    public Baker(Assistant a) {
        this.assistant = a;
    }

    private void setUpKitchen() {
        this.ingredients = assistant.fetchIngredients();
        this.oven = assistant.setUpOven();
    }

    private void mix(){
        System.out.println("Ingredients have been mixed and ready for baking.");
    }

    public void bake() {
        this.setUpKitchen();
        this.mix();
        oven.switchOn();
        oven.setOven();
        oven.putInItems();
    }

    public void takeOut(){
        oven.takeOutItems();
    }

    public void cleanUp(){
        oven.switchOff();
    }
}
