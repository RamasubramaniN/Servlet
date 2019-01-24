import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ch1
 */
@WebServlet( "/Ch1" )
public class Ch1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	int s;

	public Ch1()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		int x = 4;
		x++;
		PrintWriter out = response.getWriter();
		out.write( "<html><title>Chapter1</title><body><h1><B>Chapter 1 </B></h1></body></html>" );
		response.addHeader( "Refresh", "5" );
		HttpSession session = request.getSession();
		System.out.println( session.getAttribute( "a" ) );
		session.setAttribute( "a", x++ );
		System.out.println( "Context Path:" + request.getContextPath() );
		System.out.println( "Request URL" + request.getRequestURI() );
		Cookie s = new Cookie( "Name", "Ramasubramani" );
		response.addCookie( s );
		s.setMaxAge( -1 );
		// request.getQueryString();//Request parameters
		// request.getContextPath();//web app name
		// request.getCookies();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

}
