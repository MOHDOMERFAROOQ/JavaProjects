package bb;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Object>
{
  String name;
 String department;
int roll_no;

public Employee(String name,String department,int roll_no)
{
	this.name=name;
	this.department=department;
	this.roll_no=roll_no;
}
public static void main(String[] args)
{
	ArrayList<Employee> list1 = new ArrayList<Employee>();
	
	list1.add(new Employee("Mohd","Dept Operations_1",102));
	list1.add(new Employee("Omer","Dept Operations_2",103));
	list1.add(new Employee("Farooq","Dept Operations_3",101));
	
	
	System.out.println(list1);
	
	ArrayList<Employee> list2 = new ArrayList<Employee>();
	
	list2.add(new Employee("Ahmed","Dept prod_1",104));
	list2.add(new Employee("Maaz","Dept prod_2",106));
	list2.add(new Employee("Mustafa","Dept prod_3",105));
	
	System.out.println(list2);
	
	ArrayList<Employee> concat_list = new ArrayList<>();
	
	concat_list.addAll(list1);
	concat_list.addAll(list2);
	
	System.out.println(concat_list);
	
	Collections.sort(concat_list);
	
	System.out.println("Roll No Name Department");
	
	for(Employee e:concat_list)
	{
		System.out.println(e.roll_no+"   "+e.name+"  "+e.department);
	}
	
}
@Override
public String toString() {
	return "Employee [name=" + name + ", department=" + department + ", roll_no=" + roll_no + "]";
}

@override
public int compareTo(Object o) {
	Employee e = (Employee)o;
	return this.name.compareTo(e.name);
}
}