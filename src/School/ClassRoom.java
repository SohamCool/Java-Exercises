package School;
import test.PrintDetails;

public class ClassRoom {
	int noOfBench, noOfDesk;
	public static void main(String[] args) {
		PrintDetails cl5 = new PrintDetails(30,32,5);
		cl5.printFun();
		PrintDetails cl6 = new PrintDetails(24,23,6);
		cl6.printFun();
		PrintDetails cl7 = new PrintDetails(50,30,7);
		cl7.printFun();
		PrintDetails cl8 = new PrintDetails(20,19,8);
		cl8.printFun();
	}
}
