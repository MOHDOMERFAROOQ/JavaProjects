package bb;

import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Object>
{
	private int roll;
	private String name;
	

public Task(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}


public static void main(String[] args)
{
ArrayList<Task> roll_number1 = new ArrayList<Task>();
roll_number1.add(new Task(1189,"Mohd"));
roll_number1.add(new Task(1188,"Farooq"));
roll_number1.add(new Task(1189,"Omer"));
roll_number1.add(new Task(1187,"Maaz"));

System.out.println( roll_number1);

ArrayList<Task> roll_number2 = new ArrayList<Task>();
roll_number2.add(new Task(1192,"John"));
roll_number2.add(new Task(1190,"Tom"));
roll_number2.add(new Task(1193,"Sunny"));
roll_number2.add(new Task(1191,"Sid"));

System.out.println(roll_number2);

ArrayList<Task> roll_number = new ArrayList<Task>();

roll_number.addAll(roll_number1);
roll_number.addAll(roll_number2);
System.out.println(roll_number);



Collections.sort(roll_number);
System.out.println("Roll Number");
for(Task roll_numbers: roll_number) {
System.out.println(roll_numbers);
}
}


@Override
public String toString() {
	return " roll:" + roll + "  name:" + name ;
}


@Override
public int compareTo(Object o) {
	Task t= (Task)o;
	return this.roll-t.roll;
}}
	
