package springMvcIntercepter.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyIntercepter extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("intercepter has activated.");
		String input = request.getParameter("input");
		if(input.startsWith("d")) 
		{
			response.setContentType("text/html");
			response.getWriter().println("Invalid name. Name should not starts with d.");
			return false;
		}
		System.out.println("prehandler is running.");
		return true;
	}

}
