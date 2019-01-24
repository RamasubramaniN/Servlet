package com.subex.ramasubramani;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public ControllerServlet()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		Person myDetail = new Person();
		myDetail.setAge( 1 );
		myDetail.setFullname( "Ramasubramani N" );
		request.setAttribute( "attribute1", myDetail );

		RequestDispatcher view = request.getRequestDispatcher( "/BeanExample.jsp" );
		view.forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

}
