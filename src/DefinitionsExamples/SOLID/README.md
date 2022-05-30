Benefits of OO Design Principles:

- Extensibility
- New feature can be easily added without breaking other parts of the system
- Testability
- Testing verifies the system does what it is expected to do
- Code reusability
- Software component can be usable in many applications
- Runtime flexibility
- Behaviour of a software component can be changed during runtime without modifying the existing code

SOLID Design Principles:

S = Single Responsibility Principle
O = Open Closed Design Principle
L = Liskov Substitution Principle
I = Interface Segregation Principle
D = Dependency Inversion Principle

S: a class or method should perform only one specific function, and not mix functionalities.

In doing so, it reduces coupling and also allows for flexibility where you wish to change the way a class or method
operates without it impacting the entire program.

Example of bad SRP -

````
class ReadText() {
private String text = "Hello World";

    public void readText() {
        this.text.read();
    }

    public void printText() {
        System.out.println(this.text);
    }
}
````
The above class both reads and prints text where it should only read it.

Example of good SRP -
````
class ReadText() {
private String text = "Hello World";

        public void readText() {
            this.text.read();
        }
}

class PrintText(){
private String text = "Hello World";

    public void printText() {
        System.out.println(this.text);
    }
}
````
Here two classes have been created with the specific job of either reading or printing text.

O: this principle states that classes should be open for extension but closed for modification. In essence, you should
be able to add to class features and generate new functionality without modifying the underlying class code base.

This is both time saving and safer as you don't run the risk of breaking existing code by trying to modify it.
````
public interface GymWorkout {
void exercise();
}

public class Cycle implements GymWorkout {
private boolean leftPeddle = False;
private boolean rightPeddle = False;

    @Override
    public void exercise(){
        leftPeddle = True;
        rightPeddle = True;
    }
}

public class Swim implements GymWorkout {
private boolean frontCrawl = False;

    @Override
        public void exercise(){
            frontCrawl = True;
        }
}

public class Cardio {
public void workout(GymWorkout workout) {
if (workout == null) {
throw new Exception();
}
workout.exercise();
}
}
````
In the above, we can easily add functionality using the GymWorkout interface because of the exercise method available.
If, instead, the method was simply cycle, it would be harder to extend as we would be stuck with only a cycle method.

L: Sub class or derived class must be able to be used through their respective base classes without the user knowing the
difference. So a subtype must be substitutable for its supertype.

The best way to satisfy this principle is considering the use cases of subtypes to ensure that a supertype is inclusive
of such a type, not making assumptions. For example -
````
class Bird {
private String birdType;

    // getters and setters

    public void quack(){
        System.out.println("Quack quack");
    }

    public void fly() {
        System.out.println(this.birdType + " is flying.");
    }
}

class Penguin extends Bird {
private String birdType = "Penguin";

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly();
    }
}
````
As you can see from the above, the class Bird() has a number of methods that are typical of birds. A penguin is classed
as a bird and can therefore extend the Bird() class, however a penguin is a flightless bird. Therefore, it cannot use
the fly method in Bird(), and doing so would violate the LSP.

A good example of following the LSP is if we broke down the bird class into FlightlessBirds() and FlyingBirds().

I: Rather than operating under a single, complex interface, it is preferred that many smaller interfaces are used
serving a single area. In doing so, it reduces the instances of using interfaces that are not relevant or waste space.

For example
````
interface ChickenShop {

    public void prep();

    public void cook();

    public void serve();

    public getPayments();

    public issueChange();

    public issueRefund();
}

class makeChicken implements ChickenShop {

        @Override
        public void prep(){
            //...
        }

        @Override
        public void cook(){
            //...
        }

        @Override
        public void serve(){
            //...
        }

        @Override
        public getPayments(){
            throw new UnsupportedOperationException();
        }

        @Override
        public issueChange(){
            throw new UnsupportedOperationException();
        }

        @Override
        public issueRefund(){
            throw new UnsupportedOperationException();
        }
}
````
As you can see from the above, there are three methods from the interface that must be implemented by the makeChicken()
class, however as they are not relevant to the purpose of the class, exceptions must be added to deal with them. This
makes for clunky code and runs the risk of affecting the program as a whole. In order to come in line with the ISP,
two interfaces should be made -
````
interface ChickenShopFood{

    public void prep();

    public void cook();

    public void serve();
}

interface ChickenShopPayments(){

    public getPayments();

    public issueChange();

    public issueRefund();
}
````
In separating out the larger chicken shop interface into two smaller interfaces that deal with separate functions,
the makeChicken() class now only needs to implement three methods from ChickenShopFood and no longer needs to deal with
unused methods relating to payment.

D: High-level and low-level modules should depend on abstractions rather than each other. This ensures that where there
are changes to one module, this will not directly impact the other module as they will be operating via an abstraction
such as an interface. This ensures loose coupling.

Example -
````
interface CalculatorOperation {
public double calculate(double x, double y);
}

public class AddOperation implements CalculatorOperation {

    @Override
    public double calculate(double x, double y) {
        return x + y;
    }
}

public class SubtractOperation implements CalculatorOperation {

    @Override
    public double calculate(double x, double y) {
        return x - y;
    }
}

public class Calculator {

    public double calculate(double x, double y, CalculatorOperation operation) {
        return operation.calculate(x, y);
    }
}
````
In the above, the high-level module Calculator() class works via a reference to the CalculatorOperation interface.
Similarly, any low level module such as an add operation or subtract operation also works via the interface by
implementing its required methods. This is an example of the DIP.