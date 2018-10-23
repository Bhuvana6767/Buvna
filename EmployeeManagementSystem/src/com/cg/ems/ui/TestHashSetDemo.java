package com.cg.ems.ui;
import java.util.HashSet;
import com.cg.ems.dto.Employee;
import java.util.TreeSet;
public class TestHashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<Employee> emps=new HashSet<Employee>();

		emps.add(new Employee(333,"Bhuvana",1000.0F));
		emps.add(new Employee(123,"sanjay",5000.0F));
		emps.add(new Employee(102,"Hello",2220.0F));
		emps.add(new Employee(333,"Bhuvana",1000.0F));
		System.out.println(emps);

		System.out.println("*************");
		TreeSet<String> Cities=new TreeSet<String>();

		Cities.add("pune");
		Cities.add("Noida");
		Cities.add("Mumbai");
		Cities.add("Shahpur");
		Cities.add("pune");
		System.out.println(Cities);

		System.out.println("*************");

		TreeSet<Employee> emps2=new TreeSet<Employee>();

		emps2.add(new Employee(333,"Bhuvana",1000.0F));
		emps2.add(new Employee(123,"sanjay",5000.0F));
		emps2.add(new Employee(102,"Hello",2220.0F));
		emps2.add(new Employee(333,"Bhuvana",1000.0F));
		emps2.add(new Employee(444,"Karan",1002.0F));
		System.out.println(emps2);

	}
}
