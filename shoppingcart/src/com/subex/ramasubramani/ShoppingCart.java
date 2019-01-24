package com.subex.ramasubramani;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShoppingCart
 */
public class ShoppingCart extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private File file = null;
	private String directory = "D:\\Studies\\Books\\Servlet\\Read";
	ArrayList<String> commodities = new ArrayList<String>();

	public ShoppingCart()
	{

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		Cookie cookie = getCookies( request );
		response.addCookie( cookie );
		PrintWriter out = response.getWriter();
		//out.println( "Session Id:" + cookie.getValue() );
		//out.println( request.getParameter( "radio" ) );
		commodities = getData( request, cookie.getValue() );
		if ( commodities.size() > 0 )
		{
			out.println( "You have already purchased " + commodities.size() + " things. The commodities are " );
		}
		for ( int i = 0; i < commodities.size(); i++ )
		{
			out.println( ++i + ") " + commodities.get( i - 1 ) + "   " );
		}
		writeData( cookie.getValue(), request );
	}

	private ArrayList<String> getData( HttpServletRequest request, String key ) throws IOException
	{
		ArrayList<String> items = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		boolean fileExists = false;
		File fil = new File( directory );
		String content = "";
		String s = "";

		for ( File f : fil.listFiles() )
		{
			if ( f.getName().equals( key + ".txt" ) )
			{
				fileExists = true;
				file = f;
				break;
			}
		}
		if ( fileExists )
		{
			fr = new FileReader( file );
			br = new BufferedReader( fr );
			while ( ( s = br.readLine() ) != null )
			{
				content = content + s;
			}
			StringTokenizer stk = new StringTokenizer( content, ";" );
			while ( stk.hasMoreElements() )
			{
				items.add( stk.nextToken() );
			}
			fr.close();
			br.close();
		}
		return items;
	}

	private void writeData( String key, HttpServletRequest request ) throws IOException
	{
		FileWriter fw = null;
		boolean fileExists = false;
		File fil = new File( directory );
		for ( File f : fil.listFiles() )
		{
			System.out.println( f.getName() );
			if ( f.getName().equals( key + ".txt" ) )
			{
				fileExists = true;
				file = f;
				break;
			}
		}
		if ( fileExists )
		{
			fw = new FileWriter( file );
			fw.append( request.getParameter( "radio" ) + ";" );
		}
		else
		{
			file = new File( directory + "\\" + key + ".txt" );
			fw = new FileWriter( file );
			fw.append( request.getParameter( "radio" ) + ";" );
		}
		fw.close();
	}

	private Cookie getCookies( HttpServletRequest request )
	{
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		if ( cookies == null )
		{
			cookies = new Cookie[5];
			cookie = new Cookie( "Cookie", "1" );
		}
		else
		{
			for ( Cookie ck : request.getCookies() )
			{
				if ( ck.getName().equalsIgnoreCase( "Cookie" ) )
				{
					cookie = ck;
				}
			}
		}
		return cookie;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{

	}

}
