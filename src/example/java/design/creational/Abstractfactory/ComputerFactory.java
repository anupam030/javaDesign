package example.java.design.creational.Abstractfactory;
public class ComputerFactory {
/*	In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory
	class that will return the sub-class based on the input factory class*/
			
   /* Because of this we don't need to mdify the existing code.it helps you programme for interface.*/

/*	The classes that participate to the Abstract Factory pattern are:
		AbstractFactory(ComputerAbstractFactory) - declares a interface for operations that create abstract products.
		ConcreteFactory(PCFactory,ServerFactory) - implements operations to create concrete products.
		AbstractProduct(Computer) - declares an interface for a type of product objects.
		Product(PC,Server) - defines a product to be created by the corresponding ConcreteFactory; it implements the AbstractProduct interface.
		Client(Computer Factory) - uses the interfaces declared by the AbstractFactory and AbstractProduct classes.*/
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}


/*Abstract Factory design pattern provides approach to code for interface rather than implementation.
Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can 
add another sub-class Laptop and a factory LaptopFactory.
Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.*/

/*Abstract Factory Design Pattern Examples in JDK
javax.xml.parsers.DocumentBuilderFactory#newInstance()
javax.xml.transform.TransformerFactory#newInstance()
javax.xml.xpath.XPathFactory#newInstance()*/