package com.subex.ramasubramani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		FileHelper fileHelper = new FileHelper( "abcde", request.getParameter( "Directory" ) );
		request.getSession();
		System.out.println("Query String : "+request.getQueryString());
		fileHelper.getFileNames();
		out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Welcome</title>");
	    out.println("</head>");
	    out.println("<body>");
	    for(String fileName : fileHelper.fileNames)
	    {
	    	out.println("<br>");
	    	out.println(fileName);
	    	out.println("</br>");
	    	out.println("</body>");
		    out.println("</html>");

	    }

		//pwriter.println("Ramasubramani");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
