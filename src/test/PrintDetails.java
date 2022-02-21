package test;

public class PrintDetails {
	private int noOfDesk,noOfBench,cls;
	public PrintDetails(int noOfDesk, int noOfBench, int cls) {
		this.noOfDesk = noOfDesk;
		this.noOfBench = noOfBench;
		this.cls = cls;
	}
	public void printFun() {
		System.out.println("Number of Desk in Class "+cls+" is "+noOfDesk+"\nNumber of Bench in Class "+cls+" is "+noOfBench);
	}
}
