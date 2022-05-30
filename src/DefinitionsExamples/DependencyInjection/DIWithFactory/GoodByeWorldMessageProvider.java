package DefinitionsExamples.DependencyInjection.DIWithFactory;

public class GoodByeWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Goodbye World!";
    }
}
