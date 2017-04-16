package comm.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.sunbeam.dao.LoginDao;
import comm.sunbeam.pojos.*;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao dao; 
	
	@Override
	public Login validateUser(Login user) {
		// TODO login functionality
				System.out.println("inside service validuser");
		        Login log=dao.validUser(user);
		        System.out.println("service"+log.getUsername());
		        return log;
		
	}

}
