package com.psg.ramasubramani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet( "/CookieServlet" )
public class CookieServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private static int count = 0;
	private static final String HIT_COUNT = "Hits";

	/**
	 * Default constructor. 
	 */
	public CookieServlet()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		int count = 1;
		boolean foundCookie = false;
		PrintWriter writer = response.getWriter();
		writer.println( "Hi machi" );
		if ( request.getCookies() != null )
		{
			for ( Cookie cookie : request.getCookies() )
			{
				if ( cookie.getName().equals( HIT_COUNT ) )
				{
					foundCookie = true;
					count = Integer.parseInt( cookie.getValue() );
					System.out.println(count);
					count += 1;
					cookie.setValue( String.valueOf( count ) );
					response.addCookie( cookie );
				}
			}
		}
		if ( !foundCookie )
		{
			Cookie cke = new Cookie( HIT_COUNT, "1" );
			response.addCookie( cke );
		}
		writer.println( "Number of Hits : " + count );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

}
