package com.omernewprograms;

import java.util.Scanner;

public class TableForLoop {

	public static void main(String[] args) 
	{
		Scanner ca = new Scanner(System.in);
		System.out.print("Enter The Number:");
		
		int num= ca.nextInt();
		System.out.println("Enter the Range:");
		
	int range=ca.nextInt();
		
		for(int i=1;i<=range;i++) {
			System.out.println(num+"*"+i+"="+num*i);
			
			ca.close();
		}
	}

}
