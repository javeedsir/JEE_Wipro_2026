package com.wipro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				PrintWriter out = response.getWriter();
				
				response.setContentType("text/html");
				
					out.print("<h1>WELCOME TO CUSTOMER PAGE</h1>");
		

			int cid =		Integer.parseInt(request.getParameter("cid"));
		  String cname  = request.getParameter("cname");
		  		double amount =  Double.parseDouble(request.getParameter("amount"));
		
		  		//	request.setAttribute("amount", amount);
		  		
		  	//	ServletContext  application =	request.getServletContext(); // context object
		  		
		  				//application.setAttribute("amount", amount);
		  		
		  HttpSession session =		request.getSession();
		  
		  			session.setAttribute("amount", amount);
		  			session.setAttribute("cname", cname);
		  		
		
		RequestDispatcher  rd =  		request.getRequestDispatcher("PaymentServlet");
		  		
		  		//	rd.forward(request, response);
		
					rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
