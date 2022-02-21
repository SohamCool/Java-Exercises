package testAnimal;
import Animal.*;

public class TestAnimal {
public String name1,name2,type;

//     Domestic dm;
//	 Wild wd;
	
	public TestAnimal(String type, String name1, String name2) {
		this.type = type;
		this.name1 = name1;
		this.name2 = name2;
	}
	
	public void printAnimalType() {
		System.out.println(type+" Animals: "+name1+", "+name2);
	}
	
}
