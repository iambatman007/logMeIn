package org.login;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/ControlServlet")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
				
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String name = request.getParameter("userName");
		String password = request.getParameter("userPass");
		
		LoginBean bean= new LoginBean();
		bean.setUsername(name);
		bean.setPassword(password);
		
		request.setAttribute("bean",bean);// significance
		 boolean status= bean.validate();
		 
		 if(status){
			 RequestDispatcher rd= request.getRequestDispatcher("login-success.jsp");
			 rd.forward(request, response);
		 }
		 else{
			 RequestDispatcher rd= request.getRequestDispatcher("login-error.jsp");
			 rd.forward(request, response);
			 
		 }
		
	}

}
