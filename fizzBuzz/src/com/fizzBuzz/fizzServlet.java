package com.fizzBuzz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class fizzServlet
 */
@WebServlet("/fizzServlet")
public class fizzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fizzServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public static String getFizz () {
    	String y="";
    for (int x=1; x<=100; x++)
	{
		if (x%5==0 && x%3==0)
		
		{y=y+"\n FizzBuzz";} 
		else if (x%5==0 )
	{y=y+"\n Buzz";} else if (x%3==0 )
	{y=y+"\n Fizz";} else {y=y+"\n "+Integer.toString(x);}
	}
   return y;
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of
		the number and for the multiples of 
		five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
		
		*/
		String result= getFizz();
		
		//response.getWriter().append(result).append(request.getContextPath());
	
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		
		//response.getWriter().append(getFizz()).append(request.getContextPath());
		PrintWriter out= response.getWriter();
		out.println(getFizz());
				
}}
