package myFirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Whenever we open a new URL, the same servlet object has been called in a different thread, So,counter will get
//incremented every time.When tomcat or application is restarted again the count starts from 1.
@WebServlet( "/Ramasubramani" )
public class ServletApplication extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	int counter = 0;

	public ServletApplication()
	{
	}

	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		request.getSession( true );
		response.setContentType( "text/html" );
		counter++;
		out.print( "This is thread : " + counter );
		out.print( "<html>\n" + "<head><title> My HTML Page\n </title></head>" + "<body>This is my web page\n" + "<h1 bgcolor=\"#fdf5e6\"> 	 Super Machi </h1></body>\n" + "</html>" );

	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
	}

}
