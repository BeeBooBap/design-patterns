````
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Complex {
public static Complex fromCartesian(double real, double imaginary) {
return new Complex(real, imaginary);
}

    public static Complex fromPolar(double modulus, double angle) {
        return new Complex(modulus * cos(angle), modulus * sin(angle));
    }

    private Complex(double a, double b) {
        // ...
    }

    public static void main(String[] args) {
        Complex c = Complex.fromPolar(1, 45);
        // ...
        c = Complex.fromCartesian(5, 6);
    }
}
````

From the above it appears as though the State design pattern has been implemented.
This design pattern lets an object change its behaviour when its internal state changes
and it appears as though the object changed its class, though in reality it
still belongs to the same class.

Here, c belongs to the class Complex however it can invoke several static
methods belonging to it which creates new Complex objects, allowing c to
perform multiple tasks and essentially change states without having the need
to create a new Complex instance. 