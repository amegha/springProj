package com.xworkz.helpdesk.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.helpdesk.DAO.IssueTicketDAO;
import com.xworkz.helpdesk.DTO.IssueTicketDTO;
import com.xworkz.helpdesk.entity.IssueTicketEntity;

@Component
public class IssueTicketServiceImpl implements IssueTicketService {
	@Autowired// refering to an object or dependancy injection
	IssueTicketDAO issueTicketDAO;

	public IssueTicketServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(IssueTicketDTO issueTicketDTO) {
		System.out.println("save invoked!!!");
		if (issueTicketDTO != null) {
			if ((issueTicketDTO.getName().length() > 3) && issueTicketDTO.getName().length() < 10) {
//				issueTicketDAO.save(issueTicketDTO);
				//copy the dto to entity.
				IssueTicketEntity entity=new IssueTicketEntity();
//				entity.setDescription(issueTicketDTO.getDescription());
//				entity.setIssueType(issueTicketDTO.getIssueType()); and goes on instead of  writting like this just write like below
				BeanUtils.copyProperties(issueTicketDTO, entity);// to copy complex objects like mismatch in properties is done by dojo mapper
				System.out.println("values are coppied to an entity!!!!");
				issueTicketDAO.save(entity);
						
			}
			else {
				System.out.println("the data entered is not valid");
			}
		}

	}

}
