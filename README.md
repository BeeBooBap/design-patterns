# Design Patterns

Categories of design patterns:
- Creational - specific for object creation mechanisms
- Structural - explain how to assemble objects and classes into larger structures whilst keeping the structures flexible
- Behavioural - concerned with algorithms and the assignment of responsibilities between objects

Rationale for using design patterns: reusable solutions to commonly occurring problems. Design patterns are a form of
best practice for a particular problem.

Types of creational design patterns:

1. Factory Method - separating object instantiation from the class - using a separate class for this purpose
2. Abstract Factory - allows for producing families of related objects without specifying concrete classes. It is a
   factory of factories.
3. Prototype - allows for copying existing objects without creating dependencies on their classes
   We can use the Prototype design pattern to resolve this problem by creating the access control objects on all levels at
   once, and then provide a copy of the object to the user whenever required. In this case, data fetching from the external
   resources happens only once.
4. Builder - constructing complex objects step by step, builder interface, director that builds using interface
   Also, it can be useful where you only want to create a single object but have different specifications.
5. Singleton - there is only one instance of an object but it can be accessed globally (through use of static modifier)

Types of structural design patterns:

1. Adapter - allows objects with incompatible interfaces to collaborate
2. Bridge - split a large class or set of closely related classes into abstraction and implementation
3. Composite - composing objects into tree structures and working with them as individual objects (e.g. HTML builder
   as it lends itself well to tress structures)
4. Decorator - attaching new behaviours to objects by placing them in wrappers containing the behaviours
5. Facade - provides a simple interface to work with complex subsystems
6. Flyweight - when there are lots of objects all containing lots of data, it can overload RAM and take up space
   meaning your computer could crash. Flyweight means you can fit in more objects by sharing common parts of state
   between objects (so data is shared between objects where possible)
7. Proxy - provides substitutes or placeholders for another object, with a proxy controlling access to the original
   object

Types of behavioural design patterns:

1. Chain of responsibility - passing requests along a chain of handlers, with each handler deciding whether to handle
   the request or pass it along
2. Command - turns a request into a stand-alone object containing information about the request
3. Iterator - traverse elements of a collection without exposing underlying representation (such as if it is a list)
4. Mediator - reduce chaotic dependencies between objects by restricting direct communications between them. They must
   collaborate through a mediator
5. Memento - save and restore the previous state of an object without revealing details of its implementation
6. Observer - define a subscription mechanism to notify multiple objects about any events that happen to the object
   they are observing
   (use of "publishers" and "subscribers")
7. State - lets an object alter its behaviour when its internal state changes (appears as if object changed its class)
8. Strategy - lets you define a family of algorithms, put each of them in a separate class, and make their objects
   interchangeable
   (having an interface instant as a field of a class)
9. Template Method - defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps
   of the algorithm without changing its structure (e.g. using a common interface or abstract class with the same
   methods used)
10. Visitor - lets you separate algorithms from the objects on which they operate
