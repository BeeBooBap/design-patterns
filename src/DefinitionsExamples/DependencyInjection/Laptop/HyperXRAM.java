package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.stereotype.Component;

@Component
public class HyperXRAM implements RAM {

    public void setUp() {
        System.out.println("HyperX RAM set up and ready to go.");
    }
}
