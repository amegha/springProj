package com.xworkz.helpdesk.controller;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.xworkz.helpdesk.DTO.IssueTicketDTO;
import com.xworkz.helpdesk.services.IssueTicketService;

@Controller 
@RequestMapping("/")
public class IssueTicketController {
	@Autowired
	IssueTicketService issueTicketService;
	@Value("${controller.message}")
	String message;
	
	public IssueTicketController() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/issueTicket")
	public String onSubmit(IssueTicketDTO issueTicketDTO,Model model) {//@ModelAttribute is used to map form data without actually using the getPArameter
		System.out.println("on submit innvoked");
		System.out.println(message +" check "+issueTicketDTO);
		issueTicketService.save(issueTicketDTO);
		model.addAttribute("IssueTicketDTO",issueTicketDTO);
		return("Success"); //the page which is displayed after successful submission. this shd be "/*.jsp" format. so this one is configured in 
		
	}
	
	

}
