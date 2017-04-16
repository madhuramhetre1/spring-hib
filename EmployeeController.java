package comm.sunbeam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comm.sunbeam.pojos.Employee;
import comm.sunbeam.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	//@Qualifier("employee_service")
	private EmployeeService service;
	
	public EmployeeController(){
		System.out.println("in constr of " + getClass().getName());

	}
	
	 @RequestMapping("/regist")
		public String showRegForm(Model map)
		{
			System.out.println("in show register form");
			//create empty POJO & add it as a model attribute
			map.addAttribute("employee123", new Employee());
			return "EmployeeRegister";
		}
 @RequestMapping(value="/regist",method=RequestMethod.POST)
     public String processRegForm(@ModelAttribute("employee123") Employee e)
		{
			System.out.println("in process reg form "+e);
			//invoke service layer method to add a new member
			service.addEmployee(e);
			return "redirect:/employees/regist";
		}
}
