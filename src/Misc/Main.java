package Misc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {

        // optional
        List<String> wordList = List.of("fred", "george");
        Optional<String> optionalValue = wordList.stream().filter(s -> s.contains("fred")).findFirst();
        System.out.print(optionalValue.orElse("No word") + " contains fred");

        // try with resources - automatic resource management, no need for finally block to close resources
        InputStream inputStream = getInputStream();

        try (inputStream) {
            String s = new String(inputStream.readAllBytes());
            System.out.println(s);
        }

        System.out.println("after try-with-resource block");

        // Default Example
        DefaultExample defaultExample = new DefaultImpl();
        double payment = defaultExample.takePayment();

        System.out.println("Payment inherited from interface default: " + payment);
    }

    public static InputStream getInputStream() {
        return new ByteArrayInputStream("test string".getBytes()) {
            @Override
            public void close() throws IOException {
                System.out.println("closing");
                super.close();
            }
        };
    }
}
