package com.nit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nit.model.UserDetails;

@WebServlet("/loginurl")
public class LoginCheckServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("LoginCheckServlet.doGet()");
		//read username and password
		String username = req.getParameter("uname");
		String password = req.getParameter("pwd");
		//prepare UserDetails class object
		UserDetails details = new UserDetails();
		details.setUsername(username);
		details.setPassword(password);
		//perform session mgmt
		HttpSession ses = req.getSession(false);
		//perform authentication
		if(username.equalsIgnoreCase("deepak") && password.equalsIgnoreCase("shahu")) {
			ses.setAttribute("userDetails", details);
			//forward to InboxPageServlet
			RequestDispatcher rd = req.getRequestDispatcher("/inboxurl");
			rd.forward(req, res);
		}
		else {
			ses.setAttribute("errorMsg", "Invalid Credentials");
			//forward to login page
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.forward(req, res);
		}
	}//doGet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("LoginCheckServlet.doPost()");
		doGet(req,res);
	}//doPost
}//class