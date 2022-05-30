package DefinitionsExamples.DependencyInjection.DIWithFactory;

public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
