package com.omernewprograms;

public class Encapsulate {
	
public static void main(String[] args) {
		
		{
			Encapsulate obj = new Encapsulate();
			
			//setting values of the variables
			obj.setName("john");
			obj.setAge(19);
			obj.setRoll(1011);
			
			//displaying values of the variables
			
			System.out.println("Geek's name: " +obj.getName());
			System.out.println("Geek's name: " +obj.getAge());
			System.out.println("Geek's name: " +obj.getRoll());
			
		}
	}

	
private String Name;
private int Roll;
private int Age;

	public 	String getName()
	{
	return Name;
}
	public int getRoll()
	{
		return Roll;
	}
	public int getAge() {
		return Age;
	}
	public void setName(String newName) {
		Name = newName;
	}
	public void setRoll(int newRoll) {
		Roll = newRoll;
	}
	public void setAge(int newAge) {
		Age = newAge;
	}
	}
	