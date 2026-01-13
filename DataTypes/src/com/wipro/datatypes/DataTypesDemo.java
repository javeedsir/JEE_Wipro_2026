package com.wipro.datatypes;

import java.util.Date;

public class DataTypesDemo  extends  Object{

	public static void main(String[] args) {


		byte  b =   100;
		
		
		int  x = 9999;
		
		long  l =  9988776655433L;
		
		
		short s1 =  b;  //   implicit type casting  (short) b;
		
		
		short s = (short) x; // explicit type casting
		
		Object obj = null;
		
		String  str  = new String();
		
		
		obj = str;
		
		str = (String) obj;
		
		
		DataTypesDemo  d = new  DataTypesDemo();
		
		//str = (String)d;  //invalid bcz no relationship
		
		
		Object  o1  = new DataTypesDemo();
		
		//String s2 = new DataTypesDemo();

	}

}
