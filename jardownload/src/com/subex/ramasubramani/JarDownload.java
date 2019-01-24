package com.subex.ramasubramani;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JarDownload
 */
@WebServlet( "/JarDownload" )
public class JarDownload extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public JarDownload()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init( ServletConfig config ) throws ServletException
	{
		// TODO Auto-generated method stub
		super.init( config );
		config.getServletContext();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		//response.sendRedirect( "/rama/ram.html" );
		response.setContentType( "application/jar" );
		ServletContext context = getServletContext();
		InputStream is = context.getResourceAsStream( "catalina-ant.jar" );
		OutputStream os = response.getOutputStream();
		int readBytes = 0;
		byte[] bytes = new byte[1024];
		while ( ( readBytes = is.read( bytes ) ) != -1 )
		{
			os.write( bytes );
		}
		os.flush();
		is.close();
		os.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

}
