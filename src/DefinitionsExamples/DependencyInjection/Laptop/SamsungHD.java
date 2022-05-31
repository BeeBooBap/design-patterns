package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.stereotype.Component;

@Component
public class SamsungHD implements HardDrive {

    public void setUp() {
        System.out.println("Samsung hard drive set up and ready to go.");
    }
}
