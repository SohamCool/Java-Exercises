package com.JavaExcercises;

public class Student {
	String name;

	public Student() {
		name = "Unknown";
	}

	public Student(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.name);
	}
}
