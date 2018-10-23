package com.cg.ems.dao;

import java.util.HashSet;
import java.util.Iterator;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.util.CollectionUtil;

public class EmployeeDaoImpl implements EmployeeDao
{

	
	@Override                                                                
	public int addEmployee(Employee ee) throws EmployeeException                //adding employee
	{
		CollectionUtil.addEmp(ee);
		return ee.getEmpId();
	}
	
	
	
	@Override
	public HashSet<Employee> fetchAllEmp()                                     //get all employees
	{
		return CollectionUtil.getAllEmp();
	}
	
	
	
	@Override
	public Employee getEmpById(int empId)                                        //search employee by ID
	
	{
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator <Employee> it=empSet.iterator();
		while(it.hasNext()){
			Employee emp=it.next();
			if(emp.getEmpId()==empId)
			
				return emp;
			
		}
		return null;
	}
	
	
	
	@Override
	public HashSet<Employee> searchEmpByName(String name) {                            //search employee by name
		// TODO Auto-generated method stub
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator<Employee> it=empSet.iterator();
		 
		while(it.hasNext())
		{
			Employee ee=it.next();
			if(name.equals(ee.getEmpName()))
			{
				System.out.println(ee.getEmpId()+"\t\t"+ee.getEmpName()+"\t\t"+ee.getEmpSal());
			}
		}		
		return null;
	}
	
	
	
	@Override
	public int deleteEmp(int empId) {                                                   //delete employee
		// TODO Auto-generated method stub
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator <Employee> it=empSet.iterator();
		
		while(it.hasNext()){
			Employee ee=it.next();
			if(empId==ee.getEmpId())
			{
				it.remove();
			}
		}
		return 0;
	}
	@Override
	
	
	
	public Employee updateEmp(int empId, String newName, float newSal) {                                     //update employee salary
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator<Employee> it=empSet.iterator();
		Employee e1=null;
		while(it.hasNext())
		{
			Employee e=it.next();
			if(e.getEmpId()==empId)
			{
						
				it.remove();
				e1=new Employee(e.getEmpId(), newName,newSal);
				empSet.add(e1);
				System.out.println("Updated Successfully");
				return e1;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

}

