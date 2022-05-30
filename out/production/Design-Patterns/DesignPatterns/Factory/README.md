DesignPatterns.Factory Method - separating object instantiation from the class - using a separate class for this purpose
- create objects without specifying the exact class of object that will be created

The factory design patterns allows for different classes that share a common
super class to be chosen at runtime. You would use it if you do not know
ahead of time what class object you need (provided they are all
derived from the same super class).