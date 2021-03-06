package com.cg.ems.service;
import java.util.HashSet;
import java.util.regex.Pattern;

import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dto.Employee;
import com.cg.ems.util.CollectionUtil;

public class EmployeeServiceImpl implements EmployeeService
{
	EmployeeDao empDao=null;
	public EmployeeServiceImpl()
	{
		empDao=new EmployeeDaoImpl();
	}
	@Override
	public int addEmployee(Employee ee)
			throws EmployeeException {
		// TODO Auto-generated method stub
		return empDao.addEmployee(ee);
	}
	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return empDao.fetchAllEmp();
	}
	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(empId);
	}
	@Override
	public HashSet<Employee> searchEmpByName(String name) {
		// TODO Auto-generated method stub
		return empDao.searchEmpByName(name);
	}
	@Override
	public  int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return empDao.deleteEmp(empId);
		
	}
	

	@Override
	public boolean validateDigit(String num) throws EmployeeException{
		// TODO Auto-generated method stub

		String digitPattern="[0-9]+";
		if(Pattern.matches(digitPattern, num))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Invalid input" + "only Digits are allowed ex. 4567");
		}
	}
	@Override
	public boolean validateName(String name) throws EmployeeException{
		// TODO Auto-generated method stub
		String namePatter="[A-Z][a-z]+";

		if(Pattern.matches(namePatter, name))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Invalid input" + "only char are allowed and should start with captital. ex.Bhuvana");
		}
	}
	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return empDao.updateEmp(empId,newName,newSal);
	}

}
