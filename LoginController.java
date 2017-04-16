package comm.sunbeam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comm.sunbeam.pojos.*;
import comm.sunbeam.service.LoginService;

@Controller
@RequestMapping("/logins")
public class LoginController {
	
	@Autowired
	//@Qualifier("employee_service")
	private LoginService service;
	
    public LoginController() {
		System.out.println("in constr of " + getClass().getName());
	}
	
	@RequestMapping("/loginuser")
	public String showLoginForm(Model map)
	{
		System.out.println("inside usercontroller .....loginuser get method");
		//create empty POJO & add it as a model attribute
		map.addAttribute("user12", new Login());
		map.addAttribute("status", " ");
		return "Login";
	}
	
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/loginuser",method=RequestMethod.POST)
	public String processLoginForm(@Valid @ModelAttribute("user12") Login user,
			BindingResult res,Model map,HttpSession hs)
	{
		hs.setAttribute("user12", user);
		System.out.println("inside usercontroller login process" + user);
	    if (res.hasErrors()) 
	    {
	    System.out.println("p.l errs " + res);
	    return "Invalid";
	    }
		System.out.println("no p.l errs ...cont to B.L");
		Login status=service.validateUser(user);
		System.out.println("my status"+status);
		hs.setAttribute("user123",status);
		System.out.println(" after servno p.l errs ...cont to B.L");
		
		if(status.getUsername().equals(user.getUsername()) && status.getRole().equals("Admin"))
		{
			/*if(status.getRole().equals("Admin"))
			{*/
			//hs.setAttribute("user", status);
			return "AdminMenu";
		
			/*else if(status.getRole().equals("Employee"))
			{
				return "redirect:/consignee/registc";
			}*/
		}
		else if(status.getUsername().equals(user.getUsername()) && status.getRole().equals("Employee"))
			{
			return "EmployeeMenu";
			}
		
		else
		{
			//hs.setAttribute("user",status);			
			
			return "Invalid";
		}
		
		
	}
	
		
		
	
		
	
		
		
	
/*	
 * System.out.println("inside usercontroller login process"+user.getUsername());
		System.out.println("inside usercontroller login process"+user.getPassword());
		//invoke service layer method to add a new member
		Login currentUser=service.validateUser(user);
	System.out.println("cotrl"+currentUser.getUsername());
	if (currentUser == null)
		return "invalid";

    else if(currentUser.getUsername().equals("Madhura") && currentUser.getPassword().equals("madhura1"))
    {
	System.out.println("in admin page");
	return "redirect:/employees/regist";
    }
    else
    {
	map.addAttribute("user", currentUser);
    //	map.addAttribute("status", "Logged in Successfully");
	
	
	hs.setAttribute("user", currentUser);
	return "redirect:/consignee/registc";
	
    }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	/*	if(currentUser!=null)
		{
			return "redirect:/employees/regist";
		}
		map.addAttribute("user", new Login());
		map.addAttribute("status","registration fail try again");
		return "Login";*/
		


	}
