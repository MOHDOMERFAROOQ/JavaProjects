package com.omernewprograms;
// Encapsulation
public class Person {
	
//private field
	private int age;
	//getter method
	public int getAge() {
		return age;
	}
	//setter method 
	public void setAge(int age) {
		this.age =age;
	}
public static void main(String[] args) {
	Person p2= new Person();
	p2.setAge(25);
			System.out.println("My age is "+ p2.getAge());
	}
}
