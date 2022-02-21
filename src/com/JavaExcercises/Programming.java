package com.JavaExcercises;

public class Programming {
	String s = "I love ";
	public Programming() {
		this.s = "I love programming languages";
	}
	public Programming(String s) {
		this.s += s;
	}

	public static void main(String []args) {
		Programming obj1 = new Programming();
		System.out.println(obj1.s);
		Programming obj2 = new Programming("Java");
		System.out.println(obj2.s);
	}
}