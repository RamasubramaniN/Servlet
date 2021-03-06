package com.subex.ramasubramani;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet( "/FormServlet" )
public class FormServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public FormServlet()
	{
	}

	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		String title = "Reading All Request Parameters";
		out.println( "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1 ALIGN=CENTER>" + title + "</H1>\n" + "<TABLE BORDER=1 ALIGN=CENTER>\n" + "<TR BGCOLOR=\"#FFAD00\">\n" + "<TH>Parameter Name<TH>Parameter Value(s)" );
		Enumeration<String> paramNames = request.getParameterNames();
		System.out.println( "Query String : " + request.getQueryString() );
		response.addDateHeader( "Refresh", 5 );
		while ( paramNames.hasMoreElements() )
		{
			String paramName = ( String ) paramNames.nextElement();
			out.println( "<TR><TD>" + paramName + "\n<TD>" );
			String[] paramValues = request.getParameterValues( paramName );
			if ( paramValues.length == 1 )
			{
				String paramValue = paramValues[0];
				if ( paramValue.length() == 0 )
					out.print( "<I>No Value</I>" );
				else
					out.print( paramValue );
			}
			else
			{
				out.println( "<UL>" );
				for ( int i = 0; i < paramValues.length; i++ )
				{
					out.println( "<LI>" + paramValues[i] );
				}
				out.println( "</UL>" );
			}
		}
		out.println( "</TABLE>\n</BODY></HTML>" );
	}
}
