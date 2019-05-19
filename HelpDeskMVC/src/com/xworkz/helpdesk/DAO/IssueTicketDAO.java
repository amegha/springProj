package com.xworkz.helpdesk.DAO;
//from git hub
import com.xworkz.helpdesk.DTO.IssueTicketDTO;
import com.xworkz.helpdesk.entity.IssueTicketEntity;

public interface IssueTicketDAO {
	public void save(IssueTicketEntity entity/*IssueTicketDTO issueTicketDTO*/);

}
