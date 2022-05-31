package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

    @Autowired
    private HardDrive hardDrive; // generic Hard Drive

    @Autowired
    private RAM ram; // generic RAM

    public Laptop(){
        System.out.println("Object created...");
    }

    public void confirmHardDrive() {
        hardDrive.setUp();
    }

    public void confirmRAM(){
        ram.setUp();
    }

    public void confirmLaptop(){
        System.out.println("Laptop awaiting RAM and hard drive.");
    }
}
