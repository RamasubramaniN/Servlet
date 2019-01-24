package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert
{
	public List<String> getBrands( String color )
	{
		List<String> lst = new ArrayList<String>();
		if ( color.equals( "Green" ) )
		{
			lst.add( "A1" );
			lst.add( "A2" );
		}
		else
		{
			lst.add( "B1" );
			lst.add( "B2" );
		}

		return lst;
	}
}
