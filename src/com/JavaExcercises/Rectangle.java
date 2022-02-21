package com.JavaExcercises;

public class Rectangle {
	int length, breadth;
	public Rectangle() {
		length = 0;
		breadth = 0;
	}
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int length) {
		this.length=length;
		breadth = length;
	}
	public void calArea() {
		System.out.println(length*breadth);
	}
	public static void main(String[] args) {
		Rectangle o1 = new Rectangle(4, 2);
		o1.calArea();
		Rectangle o2 = new Rectangle(2);
		o2.calArea();
		Rectangle o3 = new Rectangle();
		o3.calArea();
	}
}
