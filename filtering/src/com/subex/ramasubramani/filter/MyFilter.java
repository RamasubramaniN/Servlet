package com.subex.ramasubramani.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subex.ramasubramani.helper.Helper;

public class MyFilter implements Filter
{
	FilterConfig filterConfig;

	//Filters let you intercept the request.Servlet remains clueless about the filters and it is unaware of filters.
	//Filters can act on request as well as response. It is pluggable component. You write code for filters later this 
	//filters can be disabled using deployment descriptor, so that it will not act on requests and responses.
	//If we want to use  user tracking for few servlets in our app, it is not a good idea to keep the code in servlets
	//because later we may required to remove this feature.So, design a filter, specify on which servlets this filter should
	//act in deployment descriptor. So, a single filter is enough for modifying multiple servlets requests and responses
	//The container knows when to invoke our filter based on declarations in deployment descriptor.
	//
	@Override
	public void destroy()
	{

	}

	@Override
	public void doFilter( ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain ) throws IOException, ServletException
	{
		filterConfig.getServletContext();
		HttpServletRequest request = ( HttpServletRequest ) servletRequest;
		String name = request.getParameter( "userName" );
		filterConfig.getServletContext().log( name );
		Helper.getInstance().logNames( name );
	}

	@Override
	public void init( FilterConfig filterConfig ) throws ServletException
	{
		this.filterConfig = filterConfig;
	}

}
