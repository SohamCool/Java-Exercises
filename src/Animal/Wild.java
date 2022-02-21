package Animal;

import testAnimal.TestAnimal;

public class Wild {
	public String name1, name2, type;

//	public Wild(String name1, String name2) {
//		this.name1 = name1;
//		this.name2 = name2;
//	}

	public static void main(String[] args) {
		TestAnimal ta = new TestAnimal("Wild", "Lion", "Tiger");
//		Wild wd = new Wild();
		ta.printAnimalType();
	}
}
