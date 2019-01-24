package com.subex.ramasubramani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/FeedbackFormServlet" )
public class FeedbackFormServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public FeedbackFormServlet()
	{
		// TODO Auto-generated constructor stub
	}

	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		extractFormParameters( request );
		RequestDispatcher requestDispatcher = request.getRequestDispatcher( "/Response.jsp" );
		requestDispatcher.forward( request, response );
	}

	private void extractFormParameters( HttpServletRequest request )
	{
		String userName = request.getParameter( "ComponentIdUserName" );
		String password = request.getParameter( "ComponentIdPassword" );
		String comments = request.getParameter( "ComponentIdComments" );
		String siteRating = request.getParameter( "ComponentIdRating" );
		String country = request.getParameter( "ComponentIdCountry" );

		request.setAttribute( "userName", userName );
		request.setAttribute( "password", password );
		request.setAttribute( "comments", comments );
		request.setAttribute( "country", country );
		request.setAttribute( "siteRating", siteRating );
	}

}
