package com.wipro.springanno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.wipro.springanno.beans.Address;
import com.wipro.springanno.beans.Employee;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = "com.wipro.springanno.*")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		System.out.println(context);

		Employee emp = context.getBean(Employee.class);
		Employee emp2 = (Employee) context.getBean("e1");

		Address addr = context.getBean(Address.class);
				
		addr.setCity("Hyderabad");

		System.out.println(addr);
		
		System.out.println(addr.getT());
		System.out.println(context.getBean(Thread.class));
		System.out.println(context.getBean("t1"));
		

		System.out.println(emp);
			System.out.println(emp.getList());
		
		System.out.println(emp2);

		emp.setEid(101);
		emp.setEname("king");
		emp.setSalary(55000);
	//	emp.setAddress(addr);

		System.out.println(emp.getEid() + " " + emp.getEname() + "  " + emp.getAddress().getCity());

	}
	
	
	
	@Bean("t1")
	@Scope("prototype")
	public Thread  getThreadObj() {
		
		
		return new Thread();
		
	}
	
	
	@Bean
	public List  getListObj() {
		
		List list = new ArrayList<String>();
		
		list.add("king");
		list.add("ford");
		list.add("smith");
		
		return list;
		
	}
	
	
	
	
	
	
	
	

}
