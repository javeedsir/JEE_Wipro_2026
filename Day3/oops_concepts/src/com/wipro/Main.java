package com.wipro;

public class Main {

	public static void main(String[] args) {


	Employee e1 =	new Employee();
	
			e1.setEid(112);
			e1.setEname("king"); 
			e1.setSalary(30000);
			
			System.out.println(e1.getEid() +" "+ e1.getEname()+" "+e1.getSalary());
		
			e1.setSalary(45000);
	
	
	System.out.println(e1.getSalary());
	
	Employee e2 = new Employee(111,"javeed",50000);
	
	
		//System.out.println(e2.eid);
		//System.out.println(e2.ename);
		//System.out.println(e2.salary);
	

		System.out.println(e2.getEid());
		
		
		
		
		
		//Employee e3 = new Employee(0,"Yazeen",0.0);
		
		
		Employee e3 = new Employee();
		
			e3.setEname("Yazeen");
			
			
		
System.out.println(e3.getEid() +" "+ e3.getEname()+" "+e3.getSalary());
			
		
		
		
		
		
	}

}
