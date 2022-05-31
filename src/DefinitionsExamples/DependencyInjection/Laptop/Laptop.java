package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

    @Autowired
    HardDrive hardDrive;
}
