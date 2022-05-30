package DefinitionsExamples.DependencyInjection.DIWithFactory;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {

    private static MessageSupportFactory instance = null;

    static {
        instance = new MessageSupportFactory();
    }

    private MessageProvider provider = null;
    private MessageRenderer renderer = null;

    private MessageSupportFactory() {

        Properties props = new Properties();

        try {
            try (var fis = new FileInputStream("src/DIWithFactory/beans.properties")) {
                props.load(fis);
            }

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
