package com.subex.ramasubramani.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.subex.ramasubramani.helper.Helper;

public class MyFilter implements Filter
 {
	FilterConfig filterConfig;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		filterConfig.getServletContext();
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		String name = request.getParameter("userName");
		Helper.getInstance().logNames(name);
		filterChain.doFilter(request, servletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

}
