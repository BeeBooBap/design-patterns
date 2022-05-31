package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.stereotype.Component;

@Component
public class HitachiHD implements HardDrive {

    public void setUp() {
        System.out.println("Hitachi hard drive set up and ready to go.");
    }
}
