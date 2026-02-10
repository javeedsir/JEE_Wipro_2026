package com.wipro.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wipro.hibernate.entity.Employee;

public class DaoImp {
	
	SessionFactory factory = HibernateUtil.getSessionFactory();

	Session session = factory.openSession();
	
	
			

	
		public Employee   getEmpByEid() {
			
		Query<Employee> query =	session.createNamedQuery("getEmpByEid");

		
					query.setParameter(1, 112);
					
			Employee emp =		query.getSingleResult();
			
			return emp;
			
			
		}
		
		
		
		
		public List<Employee>  getAll(){
			
		Query<Employee>  query =	session.createNamedQuery("getAll");
			
		
			List<Employee> list =	query.getResultList();
			
			return list;
			
		}
		
		
		
		
		
		
		
	
	
}
