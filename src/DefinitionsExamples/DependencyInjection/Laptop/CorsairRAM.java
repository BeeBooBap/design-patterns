package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.stereotype.Component;

@Component
public class CorsairRAM implements RAM {

    public void setUp() {
        System.out.println("Corsair RAM set up and ready to go.");
    }
}
