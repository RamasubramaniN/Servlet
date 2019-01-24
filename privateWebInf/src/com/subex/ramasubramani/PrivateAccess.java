package com.subex.ramasubramani;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrivateAccess
 */
@WebServlet( "/PrivateAccess" )
public class PrivateAccess extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public PrivateAccess()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		//Put the resources inside WEB-INF if it is a confidential resource
		//Resources under WEB-INF cannot be accessed using URL
		//These resources can be accessed by the servlets in a normal way described below
		File file = new File("WEB-INF/Ramasubramani.txt");
		System.out.println(file.getAbsolutePath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

}
