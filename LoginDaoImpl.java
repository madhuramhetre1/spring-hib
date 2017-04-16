package comm.sunbeam.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.sunbeam.pojos.*;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{
	  @Autowired
	    private SessionFactory sf;
	  
		@Override
		public Login validUser(Login user) {
			// check for login
			System.out.println("inside valid user");
			Login log=(Login) sf.getCurrentSession().createQuery("select u from Login u where u.username= :uname and u.password= :pass")
					.setParameter("uname", user.getUsername()).setParameter("pass", user.getPassword()).uniqueResult();
			System.out.println("dao"+log.getUsername());
			return log;
		
			}

}
