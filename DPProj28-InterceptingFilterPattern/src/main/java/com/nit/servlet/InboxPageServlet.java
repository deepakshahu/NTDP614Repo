package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inboxurl")
public class InboxPageServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//Get PrintWriter
		PrintWriter pw = res.getWriter();
		//Set response content type
		res.setContentType("text/html");
		//Show inbox content
		pw.println("<h1 style='color:blue;text-align:center'>Inbox Page Content</h1>");
		pw.println("<br>...................................<br>");
		pw.println("<br><a href='signouturl'>Logout</a>");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
