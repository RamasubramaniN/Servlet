package com.subex.ramasubramani;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/ServletBean" )
public class ServletBean extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public ServletBean()
	{
		// TODO Auto-generated constructor stub
	}

	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		Employee employee = new Employee();
		employee.setAge( 23 );
		employee.setName( "Ramasubramani" );

		request.setAttribute( "Employee", employee );
		//request.setAttribute( "Qualification", null );

		RequestDispatcher view = request.getRequestDispatcher( "/Result.jsp" );
		view.forward( request, response );
	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
	}

}
