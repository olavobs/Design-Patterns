package abstractFactory;

public class TesteAbstractFactory {
	public static void main(String[] args) {

		var animal = (Animal) FactoryProvider.getFactory("Animal").create("Dog");

		var color = (Color) FactoryProvider.getFactory("Color").create("Brown");

		System.out.println("A " + animal.getAnimal() + " with " + color.getColor() + " color " + animal.makeSound());

	}
}
