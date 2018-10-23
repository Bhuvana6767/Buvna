package com.cg.ems.ui;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmployeeClient {
	static Scanner sc=null;
	static EmployeeService empSer=null;

	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		empSer=new EmployeeServiceImpl();
		int choice=0;

		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("what do u want to do?");
			System.out.println("1:add Emp\t2:Fetch all emp\n");
			System.out.println("3:search emp by id\t 4: search emp by name\n");
			System.out.println("5: delete emp\t 6: update emp\n");
			System.out.println("7:EXIT\n");
			System.out.println("enter ur choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:addEmp();
			break;
			case 2: showEmpInfo();
			break;
			case 3: getEmpById();
			break;
			case 4: getEmpByName();
			break;
			case 5:deleteEmp();
			break;
			case 6:updateEmp();
			break;
			
			default: System.exit(0);
			}

		}

	}

	private static void addEmp()                                                   //add employee
	{

		System.out.println("enter emp id:");
		String eid=sc.next();
		try
		{
			if(empSer.validateDigit(eid))
			{
				System.out.println("enter emp name:");
				String nm=sc.next();

				if(empSer.validateName(nm))
				{
					System.out.println("enter salary:");
					float sal=sc.nextFloat();
					Employee ee=new Employee(Integer.parseInt(eid),nm,sal);
					int empId=empSer.addEmployee(ee);
					System.out.println(empId + "addded successfully");
				}
			}
		}
		catch (EmployeeException e)
		{
			e.printStackTrace();
		}
	}


	private static void showEmpInfo()                                                  //show employees
	{
		HashSet<Employee> empSet=empSer.fetchAllEmp();
		Iterator<Employee> it=empSet.iterator();
		System.out.println("-------------------------");
		System.out.println("EMPID\t\t EMPNAME\t\t EMPSALARY");
		while(it.hasNext())
		{
			Employee ee=it.next();
			System.out.println(ee.getEmpId()+"\t\t"+ee.getEmpName()+"\t\t"+ee.getEmpSal());
		}

	}


	private static void getEmpById() {                                              //search employee by ID
		// TODO Auto-generated method stub

		System.out.println("enter emp id");
		int reqId=sc.nextInt();
		Employee obj=empSer.getEmpById(reqId);
		if(obj!=null)
		{
			System.out.println(obj);
		}
		else
		{
			System.out.println("no a valid id");
		}

	}


	private static void getEmpByName()                                                 //search employee by Name
	{
		System.out.println("ENTER EMPNAME:");
		String reqName=sc.next();

		empSer.searchEmpByName(reqName);
	
	}


	private static void deleteEmp() {                                                  //delete employee
		// TODO Auto-generated method stub
		System.out.println("enter emp id");
		int reqId=sc.nextInt();
		empSer.deleteEmp(reqId);

	}



	private static void updateEmp() {                                                    //update employee salary
		// TODO Auto-generated method stub
		System.out.println("enter empid");
		int eid=sc.nextInt();
		System.out.println("enter empname");
		String name=sc.next();
		System.out.println("enter salary");
		float sal=sc.nextFloat();
		Employee emp=empSer.updateEmp(eid,name,sal);
		System.out.println(emp.getEmpId()+emp.getEmpName()+emp.getEmpSal());

	}


}
