package com.subex.ramasubramani.helper;

import java.io.FileWriter;
import java.io.IOException;

public class Helper
{
	private static Helper helper;
	private FileWriter fileWriter;

	private Helper()
	{
		try
		{
			fileWriter = new FileWriter( "C://Personal/Studies/Studies/Servlet/myfilter/WebContent/Log.txt" );
			fileWriter.append( "Logged in Users" );
			fileWriter.append( "\n" );
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}
	public static Helper getInstance()
	{
		synchronized ( Helper.class )
		{
			if ( helper == null )
				helper = new Helper();
		}
		return helper;
	}
	
	public void logNames(String user)
	{
		try
		{
			fileWriter.append( user );
			fileWriter.append( "\n" );
		}
		catch ( IOException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
