package com.xworkz.helpdesk.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.helpdesk.entity.IssueTicketEntity;
//staging
@Repository
public class IssueTicketDAOImpl implements IssueTicketDAO {
	
	@Autowired
	private SessionFactory factory;
	public IssueTicketDAOImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}

	@Override
	public void save(IssueTicketEntity entity/*IssueTicketDTO issueTicketDTO*/) {
		try {
	System.out.println("invoked DAO impl's save");
	System.out.println("saved the entity object");
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(entity);
	transaction.commit();
	session.close();
		}catch (HibernateException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}


}
