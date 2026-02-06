package com.wipro.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springxml.beans.Address;
import com.wipro.springxml.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        ApplicationContext  context = new ClassPathXmlApplicationContext("application.xml"); // IOC
        
        
        	Employee emp = (Employee)	context.getBean("emp");
        	
        	System.out.println(emp);
        	
        	System.out.println(emp.getEname());
        	
        	System.out.println(emp.getAddress());
        	
        	
        Address   a1 = (Address)	context.getBean("a1");
        
        		System.out.println(a1);
        		System.out.println(a1.getCity());
        		
        	
        
        
    }
}
