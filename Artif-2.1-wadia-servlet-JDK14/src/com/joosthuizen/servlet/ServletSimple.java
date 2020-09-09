package com.joosthuizen.servlet;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

public class ServletSimple extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
                       HttpServletResponse response)
                    		   throws ServletException, IOException { 
		PrintWriter writer = response.getWriter();
	  	writer.println("<html>");
	  	writer.println("<head><title>Hello World Example</title></head>"); 
	  	writer.println("<body>Servlets need the server lib in the build path of the project</body>"); 
	  	writer.println("</html>");
	  	writer.close();
}
  
	protected void doPost(HttpServletRequest request,
          				HttpServletResponse response)
          						throws ServletException, IOException {
		doGet(request, response);
  } 
}
