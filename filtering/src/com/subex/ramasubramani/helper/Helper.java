package com.subex.ramasubramani.helper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Helper
{
	private static Helper helper;
	private BufferedWriter bufferedWriter;

	private Helper()
	{
		try
		{
			FileWriter fileWriter = new FileWriter( "D://Log.txt" );
			bufferedWriter = new BufferedWriter( fileWriter );
			bufferedWriter.append( "Logged in Users" );
			addNewLine();
			bufferedWriter.append( "**************************************************************************" );
			addNewLine();
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

	private void flush()
	{
		try
		{
			bufferedWriter.flush();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	public void logNames( String user )
	{
		try
		{
			bufferedWriter.append( user );
			addNewLine();
			flush();

		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}

	private void addNewLine()
	{
		try
		{
			bufferedWriter.newLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
	}
}
