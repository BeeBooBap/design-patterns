Dependency injection is the process by which a container or some middleman class/method supplies objects of a class
to another class that requires said objects in order to execute. For example, if we had class A, B, C and D, and class
A required objects of class C and D, it could use class B to acquire said objects by having class B create
instantiations of class C and D and pass them through to class A for use.

This encourages loose coupling because it prevents the case where you would have class A directly create instances of
classes, such as using the "new" keyword, meaning class A would have hard dependencies.

In the Baker example, it uses an Assistant class to generate instances of Oven and Ingredients, which are then used
by the Baker class. The Baker class itself however never creates the object instances, it simply uses them. Thus, by
using the Assistant class, it removes tight coupling.

The baker example demonstrates DI using constructor injection. A new assistant is first created and then
passed through Baker's constructor. 

Consider HelloWorld example by dependency injection.

It is a kind of Inversion of Control.

The issue with hard dependencies is that they are much more difficult to test and creates incredibly tight coupling.
This has further problems where you wish to changes parts of code that directly impact on those hard dependencies, such
as removing a class altogether.

Why use DI?
- Flexible
- Maintainable
- Testable

Different kinds of DI methods:
- Dependencies provided through the constructors of a component (Constructor Injection) - DIWithConstructor
- Dependencies are provided through Java style setter methods of a component (Method Injection) - DIWithSetter
- Supplied via an interface that exposes a setter method accepting the dependency (Property Injection) - DIWithFactory

With DIWithFactory and Spring, all you need to do to change the output message to create a class implementation of
MessageProvider with the message you want, and change the location of the provider class in the beans.properties
file.

Cons of DI?
- Complex to implement
- Compile time errors are pushed to run-time
- Frameworks such as Spring rely on reflection or dynamic programming (although Factory method also does this)

