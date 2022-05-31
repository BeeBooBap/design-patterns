package DefinitionsExamples.DependencyInjection.Laptop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

        Laptop laptop = factory.getBean(Laptop.class); // creating Laptop object
        laptop.confirmLaptop();

        /**
        Laptop laptop1 = factory.getBean(Laptop.class); // demonstrating only a single laptop object is created (Singleton by default)
         **/

        /**
         * Using the @Autowired annotation, there is no need to expressly call getBean for either hardDrive or ram
         * This is done automatically when the laptop object is created.
         * Spring uses the bean IDs hardDrive and ram to inject the dependencies into the relevant Laptop fields at
         * runtime.
         */

        laptop.confirmHardDrive();
        laptop.confirmRAM();

    }
}
