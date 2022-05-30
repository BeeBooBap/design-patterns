package DefinitionsExamples.DependencyInjection.DIWithFactory;

public interface MessageRenderer {

    public void render();

    public void setMessageProvider(MessageProvider provider);
}
