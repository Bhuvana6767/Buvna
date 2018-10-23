package com.cg.ems.util;
import java.util.*;

import com.cg.ems.dto.Employee;
public class CollectionUtil 
{
	private static HashSet<Employee> empSet=new HashSet<Employee>();
	

	static
	{
		empSet.add(new Employee(112081,"bhuvana",5000.0F));
		empSet.add(new Employee(112082,"sanjay",5005.0F));
		empSet.add(new Employee(112083,"harish",5001.0F));
		empSet.add(new Employee(112084,"venkatesh",5002.0F));
		empSet.add(new Employee(112085,"sai",5003.0F));
		//empSet.add(new Employee(112081,"bhuvana",5000.0F));
	}
	public static void addEmp(Employee emp)
	{
		empSet.add(emp);
	}
	public static HashSet<Employee> getAllEmp()
	{
		return empSet;
	}
	public static HashSet<Employee> getEmpById() {
		// TODO Auto-generated method stub
		return empSet;
	}
	public static HashSet<Employee> searchEmpByName() {
		// TODO Auto-generated method stub
		return empSet;
	}
	public static void deleteEmp(Employee emp)
	{
		empSet.remove(emp);
	}
	//public static void updateEmp()
	//{
		//return empSet;
	//}
	public static HashSet<Employee> fetchAllEmp()
	{
		return empSet;
	}
	
	

}
