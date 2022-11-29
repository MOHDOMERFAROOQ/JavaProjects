package com.omernewprograms;
//Polymorphism with method overriding
public class Polygon {
//method to render a shape
	public void render() {
		System.out.println();

	}

	public static void main(String[] args)
	{
		//create an object of square
		Square s1 =new Square();
		s1.render();

		//object of circle
		Circl c1= new Circl();
		c1.render();
		
	
	}
}
class Square extends Polygon{
	//render square
	public void render() {
		System.out.println("rendering square");
	}
}
class Circl extends Polygon{
	//render circle
	public void render() {
System.out.println("rendering circle");
	}

}