package com.subex.ramasubramani;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sessions
 */
public class Sessions extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public Sessions()
	{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init( ServletConfig config ) throws ServletException
	{
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
 {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println("<html><body><B>Session Id : " + session.getId() + "</B><br>");
		Integer count = (Integer) session.getAttribute("AccessedCount");
		if (count == null) {
			count = 1;
			session.setAttribute("AccessedCount", count);
		}
		else {
			count++;
			session.setAttribute("AccessedCount", count);
		}
		Date sessionCreationTime = new Date(session.getCreationTime());
		if (!session.isNew()) {
			out.println("Session is not new.Session is accessed " + count + " times<br>");
		}
		out.println("Session is created at " + sessionCreationTime.getDate() + "-" + sessionCreationTime.getMonth() + "-" + sessionCreationTime.getYear() + "<br></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

}
