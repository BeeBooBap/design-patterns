package DefinitionsExamples.DependencyInjection.DIWithAnnotation;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
