package DataStructures.Stack;

import java.util.ArrayList;
import java.util.Optional;

public class StackFactory<T> {

    public Stack<T> factoryMethod(String stackType) {

        /**
         * Alternative optional
         * Optional<String> optionalValue = wordList.stream().filter(s -> s.contains("fred")).findFirst();
         * System.out.print(optionalValue.orElse("No word") + " contains fred");
         */

        String str = Optional.ofNullable(stackType).orElseGet(() -> "Stack"); // default implementation of Stack if null value

        if (str.equals("Stack")) {
            return new StackImplementation<T>(new ArrayList<T>());
        }
        else if (str.equals("Other")) {
            return new OtherStackImplementation<T>(new ArrayList<>());
        }
        return null; // will never reach this
    }

}
