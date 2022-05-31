# Laptop example using Spring Autowire

This example has two interfaces - a HardDrive interface and a RAM interface. 

There are two implementations each of each these interfaces.

The Laptop class has both a generic HardDrive object and RAM object as fields in the class.

The beans.xml file contains beans for the laptop class, the specific HardDrive implementation
and the specific RAM implementation.

Main makes use of the class. It uses application context to ascertain the location of the xml
file and generate the bean factory to obtain the beans.

By using @Autowired, only the laptop bean need be retrieved. This is because, upon creating a
laptop object, the @Autowired annotation will be used to inject the remaining beans, in this case
the hardDrive bean and the ram bean. 

The @Component annotation also helps locate the implementation as each implementation will
have a corresponding @Component annotation.

Therefore, methods invoking both objects after the laptop
has been created will run normally, and invoke the specific implementation as provided by
the XML file.

By default, Spring implements the Singleton design pattern meaning only one laptop object is
ever created. It can be changed to prototype however and then more than one object can be
created. 

It becomes easier to change implementations as you only need change the location of the
implementation in the XML file.