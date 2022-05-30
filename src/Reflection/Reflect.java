package Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflect {

    public static void reflect(String cl){
        try {
            Class cls = Class.forName(cl);
            Method[] methods = cls.getDeclaredMethods();

            // use of streams over for loops
            Arrays.stream(methods).forEach(
                    m -> System.out.println("Method: " + m + " Return Type: " + m.getReturnType())
            );

            for (Method m : methods) {
                System.out.println("Method: " + m);
                System.out.println("Method return type: " + m.getReturnType());
            }
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }

}
