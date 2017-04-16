package comm.sunbeam.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.sunbeam.dao.EmployeeDao;
import comm.sunbeam.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao dao;

	@Override
	public String addEmployee(Employee e) {
        Employee e1=dao.addEmployee(e);
        if(e1.getEmpId()!=null)
		return "Employee added successfully";
        return "Employee registration failed";
	}

}