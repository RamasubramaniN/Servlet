package com.subex.ramasubramani;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/FormServlet" )
public class JSPServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public JSPServlet()
	{

	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		String userName = ( String ) request.getParameter( "Username" );
		String password = ( String ) request.getParameter( "Password" );
		System.out.println( userName );
		System.out.println( password );

		request.setAttribute( "Username", userName );
		request.setAttribute( "Password", password );
		
		RequestDispatcher view = request.getRequestDispatcher( "ResultJSP.jsp" );
		view.forward( request, response );
	}

}
