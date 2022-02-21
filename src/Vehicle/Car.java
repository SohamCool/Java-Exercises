package Vehicle;

public class Car {
	String color, model, engineType;
	public Car(String color, String model, String engineType) {
		this.color=color;
		this.model=model;
		this.engineType=engineType;
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.printDetails("Black", "W11", "4WD");
	}
	
}
