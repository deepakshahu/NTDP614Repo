package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.command.ICommand;
import com.nit.dispatcher.Dispatcher;
import com.nit.mappings.CommandHelper;

@WebServlet("/")
public class CaptainFrontControllerServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("CaptainFrontControllerServlet.doGet()");
		try {
			//get request path or servlet path
			String path = req.getServletPath();
			//submit Servlet path to CommandHelper and get command class object
			ICommand cmd = CommandHelper.mapRequestWithCommand(req, path);
			//Invoke the execute(-,-) as the handler method on command class object
			String lvn = cmd.execute(req, res);
			//get physical view name from dispatcher
			String pvn = Dispatcher.mapLVNToPVN(req, lvn);
			//forward to physical view name
			RequestDispatcher rd = req.getRequestDispatcher(pvn);
			rd.forward(req, res);
		}
		catch(Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
	}//doGet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("CaptainFrontControllerServlet.doPost()");
		doGet(req,res);
	}//doPost

}//class