package com.wipro.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table")
@NamedQueries(
		{
		@NamedQuery(name = "getEmpByEid", query = "select e  from Employee  e  where e.eid = ?1") ,
		
		@NamedQuery(name = "getAll", query = "select e from Employee e")
		}
		)
public class Employee {

	@Id	
	private int eid;
	@Column(name="empname")
	private String ename;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	
	
}
