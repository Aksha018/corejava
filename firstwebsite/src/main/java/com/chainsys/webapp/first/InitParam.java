package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession ses = request.getSession(true);
		String str_name = (String)ses.getAttribute("name");
		out.println(str_name);
		String str_company = (String)ses.getAttribute("company");
		out.println(str_company);
		
		//Enumeration enu = getInitParameterNames();
		  //while(enu.hasMoreElements())
		    //{
		  		//String init = (String)enu.nextElement();
		  		//out.println(init+" : " +getInitParameter(init)+"<br>");
		  	//}
		out.println("inside");
	}
	}


