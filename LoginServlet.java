//package webapp;
package com.trng;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;

@WebServlet(urlPatterns ="/login.do")
public class LoginServlet  extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hitCount; 
    
	  public void init() 
	  { 
	     // Reset hit counter.
	     hitCount = 0;
	  } 

	
	
	protected void doGet(HttpServletRequest request,
			 HttpServletResponse response)
			 throws ServletException ,IOException {
		
		 response.setContentType("text/html");
	      hitCount++; 
	 
	      
		PrintWriter writer =response.getWriter();
		 /*writer.println("Dummy stuff");*/
		
		 writer.println("You are  " +  hitCount + "th user visited this page ");
		
	}
	 
	/* PrintWriter writer =response.getWriter();
	 writer.println("Dummy stuff");
	  */

}
