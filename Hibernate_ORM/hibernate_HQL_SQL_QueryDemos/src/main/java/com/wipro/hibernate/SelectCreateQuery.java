package com.wipro.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wipro.hibernate.entity.Employee;

public class SelectCreateQuery {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		// HQL or JPQL
		String selectQuery = "SELECT  e    from  Employee e where  e.eid = ?1 ";

		Query<Employee> query = session.createQuery(selectQuery);

		query.setParameter(1, 111);

		Employee emp =  query.getSingleResult();

		System.out.println(emp);
		
		
		
		// select all records
		
		
		String selectAll = "select e  from Employee e   WHERE salary BETWEEN  :low  AND :high ";
		
		
		Query<Employee>  query2 =		session.createQuery(selectAll);
		
		
						query2.setParameter("low", 10000.0);
						query2.setParameter("high", 75000.0);
		
		
		List<Employee>  list =		query2.getResultList();
		
		
		
			for (Employee employee : list) {
				
				System.out.println(employee);
				
			}
		
		
		
		
		
	}

}
