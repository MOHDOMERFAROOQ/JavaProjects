package com.omar.basics;

public class HelloWorld {
	static void myMethod() {
		System.out.println("jdjjd");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		myMethod();
		myMethod();
		myMethod();
	}{
		System.err.println("Hello world");
		String name=("omer");
		System.out.println(name);
		boolean h=true;
		boolean f=false;
		System.out.println(h);
		System.out.println(f);
		int i=9;
		double ine=i;
		System.out.println(i);
		System.out.println(ine);
		int u=8;
		double uud=u;
		System.out.println(u);
		System.out.println(uud);
		double myDouble =7.89d;
		int myInt =(int)myDouble;
		System.out.println(myDouble);
		System.out.println(myInt);
		int myInter=8;
		double myHH= myInter;
		System.out.println(myInter);
		System.out.println(myHH);
		double myDD=4.90d;
		int mySma=(int)myDD;
		System.out.println(myDD);
		System.out.println(mySma);
		
		int x=100+50;
		System.out.println(x);
		int sum1 =180+90;
		int sum2=sum1+40;
		int sum3=sum1+sum2;
		System.out.println(sum2);
		System.out.println(sum3);
		String txt ="abcdefghij";
		System.out.println("words ca " +txt.toUpperCase());
		System.out.println("words sam " +txt.toLowerCase());
		
		String txtda = "Please occurs!";
		System.out.println(txtda.indexOf("occurs")); // Outputs 7
		
		String first="john";
		String second=" go";
		//String third=first+second;
		System.out.println(first.concat(second) );
		
		System.out.println(Math.max(5,10));
		System.out.println(Math.min(5,10));
		boolean y=true;
		boolean z= false;
		System.out.println(z);
		System.out.println(y);
		String txjtil = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txjtil.indexOf("Z"));
		
		System.out.println(Math.sqrt(64));
		
		int ii=25;
		int my=18;
		//System.out.println(ii==15);
		System.out.println(ii >= my);
		int day =(2);
		switch (day) {
		case 1:
			System.out.println("mon");
			break;
		case 2: 
			System.out.println("sun");

		}
	}

}
