package DefinitionsExamples.DependencyInjection.Baker;

public class Main {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Baker baker = new Baker(assistant);

        baker.bake();
        baker.takeOut();
        baker.cleanUp();
    }
}
