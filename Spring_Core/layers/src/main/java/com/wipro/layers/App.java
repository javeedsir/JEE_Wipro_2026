package com.wipro.layers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.layers.entity.Employee;
import com.wipro.layers.service.EmployeeServiceImp;
import com.wipro.layers.service.IEmployeeService;

@Configuration
@ComponentScan(basePackages = "com.wipro.layers.*")
public class App 
{
	

    public static void main( String[] args )
    {
        System.out.println( "Spring core with Layered architecture" );
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
       IEmployeeService  service = 	context.getBean(EmployeeServiceImp.class);
       
       System.out.println(service);
       System.out.println(service);
       
       		Employee emp =			context.getBean(Employee.class);
       
       		boolean  flag = service.addEmp(emp);
       		
       		
       		if(flag) {
       			
       			System.out.println("Employe added to DB");
       			
       		}
       		
       		else {
       			
       			System.err.println("Add Failed..");
       		}
        
    }
}
