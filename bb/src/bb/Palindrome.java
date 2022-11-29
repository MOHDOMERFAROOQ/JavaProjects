package bb;
import java.util.Scanner;

public class Palindrome {
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter Your Name:");
	        String name=scan.nextLine();
	        
	        String reverse="";
	        
	        for(int i=name.length()-1;i>=0;i--)
	        {
	            reverse=reverse+name.charAt(i);
	        }
	        if(name.equals(reverse))
	        {
	            System.out.println(name+" is Palindrome String.");
	        }
	        else
	        {
	            System.out.println(name+" is Not Palindrome String.");
	        }
	    }
	}