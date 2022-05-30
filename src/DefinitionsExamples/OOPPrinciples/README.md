# Three OOP Principles -
1. Encapsulation
2. Inheritance
3. Polymorphism

### Encapsulation

It is a way to bind code and data together and keep them protected from interference that may occur at higher levels.
In effect, it acts as a wrapper that restricts access, hiding detailed implementation and limiting any side effects
that may come with changing said implementation.

The best example to give is with driving a car. You would use a steering wheel to operate the car, ensuring it can
move left and right etc. With encapsulation, movement of the steering wheel would have no effect on the gears in use,
the accelerator, or any other aspect of the car. The wheel is restricted to a single function that bears no imapct
on the other elements of the car. Similarly, you should be able to swap out steering wheels with no impact on the car's
operation. You do not need to worry about how the car will recognise the wheel, provided it is a wheel you use.

Code example -
````
public class Encapsulation {
private String name;
private int age;

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int x){
        this.age = x;
    }

    public void setName(String s){
        this.name = s;
    }
}
````
Using classes and access modifiers allows for encapsulation. Here, the only way to access the private field values of
name and age is by using the public methods, rather than accessing the fields directly through a class instance.

### Inheritance

The way in which one objects acquires the properties of another.

Inheritance supports the idea of a hierarchical structure as common properties can effectively be passed down and made
specific to a class. For example, a class Dog may always have four legs, a tail and a set of ears, and that it barks,
but you may wish to add in features specific to a specific type of dog.

You can have an overall Dog() class holding such attributes, and have another class Poodle() that inherits properties
from the class Dog(). Within Poodle(), we know that, as a dog, it will have four legs, a tail, and a set of ears, and it
will bark, but we can also add in other fields such as the type of fur, the type of bark, and its size, specific to the
breed.
````
class Dog {
int noOfLegs = 4;
Boolean tail = True;
int noOfEars = 2;
String bark = 'BARK!';
void bark(){
System.out.println(this.bark);
}
}

class Poodle extends Dog {
String bark = 'Bark! Bark!';
String fur = 'fluffy';
int size = 3;

    public static void main(String args[]) {
        Poodle poodle = new Poodle();
        System.out.println(poodle.tail);
        System.out.println(poodle.noOfLegs);
        poodle.bark();
    }
}
````
### Inheritance vs Composition

Composition differs from inheritance in that whilst inheritance extends a class, composition uses a class instance
as a field of another class. Using the Dog() class above, use of composition would look like -
````
class Vet {
private Dog dog;
public vet(){
this.dog = new Dog();
}
}
````
Whilst inheritance is an "is-a" relationship, composition takes a "has-a" relationship. Similarly, whilst in inheritance
a class may only extend a single interface, there is no such limit with composition as you are simple creating class
instances within classes. This can be done many times.

### Polymorphism
Allows for a single interface to be used as a general template for subsequent class implementations.

Polymorphism keeps programming simple by having generic interfaces that can be used for a group of related actions,
limiting repeated code. For example -
````
interface Animal {
public void eat();
public void sleep();
}

class Dog implements Animal {
public void eat(){
System.out.println("Dog is eating");
}

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void bark(){
        System.out.println("Bark!");
    }
}
````
In the above, we have a generic interface Animal that has two unimplemented methods common to all animals. Dog implements
the Animal interface and also provides another method bark() specific to the animal Dog. Using this interface means we
can implement various animals from the same interface.

### Coupling and cohesion
Within the realm of OOP, it is expected that a software programme have high cohesion within
specific classes, but a loose coupling between classes. This ensures that within a class, it is appropriately defined
to perform a specific task, and is not too broad or vague. Similarly, loose coupling between classes ensures they can
reference each other and not be impacted if one class undergoes a change.

An example of high cohesion -
````
class NewStudent {
    String studentID;
    String firstName;
    String secondName;
    String courseName;
    String courseEmailAddress;
}
````
With the appropriate getters and setters, this class would set up a new student and possess only the information
relevant to setting up the student. It would not contain, for example, a method that prints documents, or verifies an
email. The methods are specific to the core function of the class.

An example of loose coupling -

Making use of the Animal interface above, we may make a class Cat().
````
class Cat implements Animal {
public void eat(){
System.out.println("Cat is eating");
}

    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    public void meow(){
        System.out.println("meow");
    }
}
````
Here, Dog and Cat are loosely coupled because they make use of the Animal interface.

Loose coupling therefore ensures less interdependency of classes, less data movement and greater separation of elements.

# Misc
1.Typed vs untyped languages
2. Abstraction
3. Static vs dynamic dispatch 
4. Tail recursion vs traditional recursion
5. Immutable vs mutable
6. Functional programming
7. Pure Functions
8. Lazy Evaluation
9. Currying and closure 

### Typed language

A typed language is one in which the type of data type of a variable is defined and known by the machine at compile time
(statically typed language) or at run time (dynamically typed language).

A statically typed language is one where data types are checked at compile time and therefore before execution,
such that the program may not run in the first place. A dynamically typed language will check types at run time during
execution, meaning a program may run however it could be stopped by a subsequent error.

Java is an example of a statically typed language - each variable must have a data type assigned to it, for example int
num, or String name. This must be defined prior to compilation.

Python is an example of a dynamically typed language - whilst you do not need to explicitly state the data type of a
variable for compilation, the data types of those variables remains important and are simply determined later, at run
time.

This also raises issues of data conversion, where you can see differences between strongly typed languages and weakly
typed languages.

In a strongly typed language, any incorrect data type will throw a Type error.

For example: add(1, '2') will throw a type error because you are passing in an int type with an incompatible String
type. To avoid this, you would need to explicitly convert the incompatible data type prior to executing, such as
add(1, strToInt('2')).

By contrast, a weakly typed language will throw no such error in the same circumstances, and actually execute as expected.
This is because rather than having to explicitly convert data types, a weakly typed language will make use of the compiler
to implicitly convert data types at compile time. Therefore, the same add(1, '2') will run fine.

### Untyped languages

Untyped languages are those where no such variable definition of the variable data type is required prior to runtime.
JavaScript is an untyped language as a JS variable can hold any type of data type. Variables are declared using the
keyword 'var' to hold data.

### Abstraction

You can make use of hierarchical classifications so that complex systems are broken down into more manageable pieces.

### Static vs dynamic dispatch

Dynamic dispatch is a technique available to the compiler that means the compiler must check what implementation of a
method is being performed (such as a reference to a superclass or subclass implementation), however this check is only
performed at runtime, meaning additional overhead.

Static dispatch is where the compiler knows at compile time which method implementation is being called so overall
execution speed is faster (it can inline and optimise prior to execution).

### Tail recursion vs traditional recursion

In traditional recursion, also known as head recursion, a function or method is called within itself (a recursive call)
and each recursive call is completed first, prior to actually evaluating the output of the function or method.

For example,
````
class Sum{
    public int recursiveSum(int x) {
        if (x == 0) { return 0; }
        else {
        return x + recursiveSum(x - 1);
        }
    }
}
````
If we were to pass in the number 3, 3 recursive calls would first be added to the stack memory of the JVM before then
being evaluated to achieve the output.

In tail-recursion, a running total is used to continually update values such that there is no build up of the stack
with recursive calls.

Example -
````
class Sum{
public int tailRecursiveSum(int x, int total = 0) {
if (x == 0) { return total; }
else {
return tailRecursiveSum(x-1, total + x);
}
}
}
````
Here, evaluation occurs after each recursive call and allows for the total variable to be updated as the function
continues to execute.

### Immutable vs Mutable

Where an object is immutable, it means that after its creation, it cannot be changed. This also means that where an
existing immutable object is changed, it is actually creating an entirely new object with those "changed" properties.

Immutable data types: an immutable class is a class which, once created, cannot be changed (to either the body of the
class or its objects)
- Integer, Byte, Long, Float, Double, Character, Boolean, Short, String

By contrast, a mutable object is one which have its state changed or updated after creation. A good example of this is
the StringBuilder class whose purpose is to help update or change a string as strings are immutable objects.

Example of an immutable class -
````
class Student {
final String name;
final int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public getName(){
        return this.name;
    }

    public getID(){
        return this.ID;
    }
}
````
Here, there are only getter methods available as the fields cannot be changed. They are also declared final to ensure
they cannot be modified once assigned. A mutable class would have setter methods also to allow for modification and
would not have final fields.

### Functional Programming 

Functional programs tend to be declarative (as opposed to imperative), that’s a case of telling the compiler what you
want instead of how you want it.

Algebraic data type: exposes the data structure and regularity.

As Java is OO, it uses abstract data types (ADTs) and does not support algebraic data types directly.

In OO, data is the important thing, as code is built on the principles of inheritance (is-a) and composition (has-a).
In functional programming, the functions are the important thing. Code is built on "or" and "and" by using algebraic
data types. There are two main patterns used - Product type pattern, and Sum type pattern.

Product Type:

Let us say that A has a B and C (such as Cat has a colour and a favourite food). We could display this using a record
````
record A(B b, C c) {}
````
Sum Type:

Let us say A is a B or C (such as Visitor is Anonymous or Registered). We could display this using an interface
````
interface A {}
final class B implements A {}
final class C implements A {}
````
However, this does not prevent other classes implementing the interface. To restrict implementations, we could do this
````
sealed interface A permits B, C {}
final class B implements A {}
final class C implements A {}
````

### Pure Functions
A function is pure if it satisfies 2 principles -

1. The return value of the function depends only on the input parameters passed to the function
2. The execution of the function has no side effects

Example of property 1 -
````
class Maths {
public int sum(int one, int two) {
return one + two;
}
}
````
In the above, the return value will always be the same if we use the same one and two values. The return value is
entirely dependent on the input one and two.

Example of property 2 -
````
class Maths {
int count;

    public int sum(int one, int two) {
        count++;
        return one + two;
    }
}
````
In the above, the method sum cannot be considered pure because it has the side effect of changing the global field count.

### Lazy Evaluation

Delaying the evaluation of an expression until the value is needed, often performed by using streams and lambdas

### Currying and closure 

Currying: a technique of translating the evaluation of a function that takes multiple parameters into evaluating a
sequence of functions, each with a single parameter.
````
IntFunction<IntUnaryOperator> curriedFun = x -> y -> x + y; // a curried function
`````
A short example:
````
// the another result is equal to 153
int anotherResult = fff.apply(10).apply(15).apply(3);
````
Returning functions: where you treat a function as an object which can accept a method as an argument and return its
value.

A closure is a combination of a function bundled together (enclosed) with references to its surrounding state
A closure gives you access to an outer function’s scope from an inner function (think higher order functions)

Higher order functions: accept functions as parameters and/or returns a function