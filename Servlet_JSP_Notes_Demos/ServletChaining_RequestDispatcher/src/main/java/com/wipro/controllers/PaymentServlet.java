package com.wipro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PaymentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
			out.print("<h1>Payment Page<h1>");
			
		//Double  amount =  (Double)	request.getAttribute("amount");
		
		//ServletContext  application =		request.getServletContext();
			//	Double amount = (Double)	application.getAttribute("amount");
						
				HttpSession  session =		request.getSession();
			
			
				Double amount = (Double)		session.getAttribute("amount");
				String cname   =  (String) session.getAttribute("cname");
		
				out.print("<h1>Bill Amount : "+amount+ " paid successfully  by "+ cname   +" </h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
