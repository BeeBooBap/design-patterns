package DefinitionsExamples.DependencyInjection.DIWithFactory;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
