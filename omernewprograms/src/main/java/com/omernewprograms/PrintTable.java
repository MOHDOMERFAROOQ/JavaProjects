package com.omernewprograms;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number:");
	
	
		//reading a number whose table is to be print 
		
		int num= sc.nextInt();
		
		System.out.print("Enter range:");
	
		//reading a number whose table is to be print 
		
		int range = sc.nextInt();
		int i =1;
		
		//while loop starts from 1 and execute up to the range 
		
		while(i<=range)
		{
			//prints table of the entered number up to the range  
			System.out.println(num+"*"+i+"="+num*i);
			//increments the value of i by 1  
			i++;
			
			 sc.close();
		
		}
}
}