package com.nit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/signouturl")
public class SignoutServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("SignoutServlet.doGet()");
		//get access to session object
		HttpSession ses = req.getSession(false);
		ses.removeAttribute("userDetails");  //remove session attribute
		ses.invalidate();  //end the session
		
		//forward the request to login.jsp
		RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
		rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("SignoutServlet.doPost()");
		doGet(req,res);
	}
}
