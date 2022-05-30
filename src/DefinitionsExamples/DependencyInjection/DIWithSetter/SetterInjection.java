package DefinitionsExamples.DependencyInjection.DIWithSetter;

import DIWithConstructor.Dependency;

public class SetterInjection {
    private Dependency myDependency;

    public void setMyDependency(Dependency dep) {
        this.myDependency = dep;
    }
}
