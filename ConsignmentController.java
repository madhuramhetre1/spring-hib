package comm.sunbeam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.LastModified;

import comm.sunbeam.pojos.Consignment;
import comm.sunbeam.pojos.Employee;
import comm.sunbeam.pojos.Login;
import comm.sunbeam.service.ConsignmentService;
import comm.sunbeam.service.EmployeeService;

@Controller
@RequestMapping("/consignee")
public class ConsignmentController {
	
	@Autowired
	//@Qualifier("consignee_service")
	private ConsignmentService service;
	
	public ConsignmentController(){
		System.out.println("in constr of " + getClass().getName());

	}
	
	@RequestMapping("/list1")
	public String showConsignees(Model map) {
		System.out.println("in list consignees...");
		map.addAttribute("consignment_list", service.listConsignees());
		return "ConsignmentList";
	}
	
	
	 @RequestMapping("/registc")
		public String showRegiForm(Model map)
		{
			System.out.println("in show register form");
			//create empty POJO & add it as a model attribute
			map.addAttribute("consignee123", new Consignment());
			return "ConsignmentRegister";
		}
 @RequestMapping(value="/registc",method=RequestMethod.POST)
     public String processRegForm(@Valid @ModelAttribute("consignee123") Consignment c,
    		 BindingResult res,Model map,HttpSession hs)
		{
	        
			
	        Login user=(Login) hs.getAttribute("user12");
	        c.setLastModified(user.getUsername());
	        System.out.println("in process reg form "+c);
			//invoke service layer method to add a new member
			service.addConsignee(c);
			return "redirect:/consignee/registc";
		}
 
 
/* @RequestMapping("/editC")
	public String showEditForm(Model map)
	{
		System.out.println("in show edit form");
		//create empty POJO & add it as a model attribute
		map.addAttribute("consigneeEdit123", new Consignment());
		return "ConsignmentDelivery";
	}
@RequestMapping(value="/editC",method=RequestMethod.POST)
public String processEditForm(@ModelAttribute("consigneeEdit123") Consignment c)
	{
		System.out.println("in process edit form "+c);
		//invoke service layer method to add a new member
		service.addConsignee(c);
		return "redirect:/consignee/editC";
	}*/

 
/* @RequestMapping(value = "/updateC")
 public String showUpdateForm(Model map) {
 	System.out.println("in show edit form ");
 	Consignment c = service.getDetails(id1);
 	System.out.println(c);
 	map.addAttribute("consigneeEdit123", c);
 	return "ConsignmentEdit";
 }
 

@RequestMapping(value = "/updateC}", method = RequestMethod.POST)
public String processUpdateForm(@ModelAttribute("consigneeEdit123") Consignment c) {
	System.out.println("in process update form " + c);
	c.setConsignmentId(consignmentId);
	// invoke service layer method to add a new member
	System.out.println("Updated consignee " + service.updateConsignee(c));
	return "redirect:/consignee/updateC";*/
 
 
 
 
 
 
/*@RequestMapping(value = "/updateC")
public String showUpdateForm(@PathVariable int id1, Model map) {
	System.out.println("in show update form " + id1 + " " + map);
	Consignment c = service.getDetails(id1);
	System.out.println(c);
	map.addAttribute("consigneeEdit123", c);
	return "ConsignmentDelivery";
}

@RequestMapping(value = "/updateC", method = RequestMethod.POST)
public String processUpdateForm(@PathVariable int consignmentId,
		@ModelAttribute("consigneeEdit123") Consignment c) {
	System.out.println("in process update form " + c);
	c.setConsignmentId(consignmentId);
	// invoke service layer method to add a new member
	System.out.println("Updated consignee " + service.updateConsignee(c));
	return "redirect:/consignee/updateC";
}*/

/* @RequestMapping("/update")
	public String showLoginForm5(Model map)
	{
		System.out.println("inside Consignmentcontroller .....update method");
		return "Update";
	}*/
 
/* 
 @RequestMapping("/updateC")
 public String showUpdateForm(int id1,Model map) {
 	System.out.println("in show update form " + id1 + " " + map);
 	Consignment c = service.getDetails(id1);
 	System.out.println(c);
 	map.addAttribute("consigneeEdit123", c);
 	return "ConsignmentDelivery";
 }


@RequestMapping(value = "/updateC", method = RequestMethod.POST)
public String processUpdateForm(int consignmentId,
		@ModelAttribute("consigneeEdit123") Consignment c) {
	System.out.println("in process update form " + c);
	c.setConsignmentId(consignmentId);
	// invoke service layer method to add a new member
	System.out.println("Updated consignee " + service.updateConsignee(c));
	return "redirect:/consignee/updateC";
}*/
 
 

@RequestMapping(value = "/updateC/{id1}")
public String showUpdateForm(@PathVariable int id1, Model map) {
	System.out.println("in show update form " + id1 + " " + map);
	Consignment c = service.getDetails(id1);
	System.out.println(c);
	map.addAttribute("consigneeEdit123", c);
	return "ConsignmentDelivery";
}

@RequestMapping(value = "/updateC/{consignmentId}", method = RequestMethod.POST)
public String processUpdateForm(@Valid @PathVariable int consignmentId,
		@ModelAttribute("consigneeEdit123") Consignment c,
		BindingResult res,Model map,HttpSession hs) {
	
	Login user=(Login) hs.getAttribute("user12");
    c.setLastModified(user.getUsername());
	System.out.println("in process update form " + c);
	c.setConsignmentId(consignmentId);
	// invoke service layer method to add a new member
	System.out.println("Updated consignee " + service.updateConsignee(c));
	return "redirect:/consignee/list1";
}

@RequestMapping(value = "/deleteC/{id1}")
public String deleteConsignee(@PathVariable int id1) {
	System.out.println("in delete consignee " + id1);
	service.deleteConsignee(id1);
	return "redirect:/consignee/list1";
}

}





