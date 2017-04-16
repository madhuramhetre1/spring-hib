package comm.sunbeam.dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.sunbeam.pojos.*;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao
{

	@Autowired
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Override
	public Employee addEmployee(Employee e) {
		sf.getCurrentSession().persist(e);
		return e;
	}

	
	
 
	

}


	
	

	
	
	

