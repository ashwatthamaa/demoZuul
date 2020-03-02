package com.pankaj.demoZuul.filters;

import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@WebFilter
public class DemoZuulPreFilter extends ZuulFilter{

	private static Logger log = LoggerFactory.getLogger(DemoZuulPreFilter.class);
	
	@Override
	public Object run() throws ZuulException {
		log.info("Zuul Pre Filter");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
