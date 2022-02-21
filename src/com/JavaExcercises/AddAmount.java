package com.JavaExcercises;

public class AddAmount {
	int Amount = 50;
	public AddAmount() {
		
	}
	public AddAmount(int Amount) {
		this.Amount+=Amount;
	}
	public static void main(String[] args) {
		AddAmount ob1 = new AddAmount();
		System.out.println("Total Amount in Piggie Bank is $"+ob1.Amount);
		AddAmount ob2 = new AddAmount(50);
		System.out.println("Total Amount in Piggie Bank is $"+ob2.Amount);
	}

}
