package Animal;

import testAnimal.TestAnimal;

public class Domestic {
	public String name1, name2;

//	public Domestic(String name1, String name2) {
//		this.name1 = name1;
//		this.name2 = name2;
//	}

	public static void main(String[] args) {
		TestAnimal ta = new TestAnimal("Domestic", "Dog", "Cat");
//		Domestic dm = new Domestic();
		ta.printAnimalType();
	}
}
