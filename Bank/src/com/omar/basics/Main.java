package com.omar.basics;

public class Main {
	static void myMethod() {
		System.out.println("this is");
	}
//	static int myMethod(int x,int y) {
//		return x+y;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//int z=(myMethod(6,5));
//System.out.println(z);
//	}
//
////}
//	public static void main(String[]args ) {
//		myMethod();
//		myMethod();
//		myMethod();
//	}
//}
	public static void main(String[]args ) {
//		myMethod();
		int[][]myNumbers = {{1,2,3,4},{5,6,7}};
		
	//System.out.println(myNumbers.length);
	for(int i=0; i< myNumbers.length;++i) {
		for(int j=0;j<myNumbers[i].length;++j) {
			//System.out.println("outer: "+myNumbers.length);

			System.err.println("inner : "+i+"j "+j);

			System.err.println(myNumbers[i][j]);
		
		
		
				}
			}
	}}