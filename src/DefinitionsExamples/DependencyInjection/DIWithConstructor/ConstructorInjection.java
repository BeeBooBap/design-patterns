package DefinitionsExamples.DependencyInjection.DIWithConstructor;

public class ConstructorInjection {
    private Dependency dep;

    public ConstructorInjection(Dependency dep) {
        this.dep = dep;
    }
}
