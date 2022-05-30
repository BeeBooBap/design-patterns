package DefinitionsExamples.DependencyInjection.DIWithSpring;

public interface MessageRenderer {

    public void render();

    public void setMessageProvider(MessageProvider provider);
}
