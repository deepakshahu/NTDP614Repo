package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.delegate.EmployeeMgmtBusinessDelegateImpl;
import com.nit.delegate.IEmployeeMgmtBusinessDelegate;
import com.nit.exception.EmployeeRegistrationProblemException;
import com.nit.vo.EmployeeVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {

	private IEmployeeMgmtBusinessDelegate delegate;

	@Override
	public void init() throws ServletException {
		delegate = new EmployeeMgmtBusinessDelegateImpl();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//Read form data and store into VO class object
		EmployeeVO empVO = new EmployeeVO();
		empVO.setEmpName(req.getParameter("ename"));
		empVO.setEmpAddrs(req.getParameter("eaddrs"));
		empVO.setEmpDesg(req.getParameter("edesg"));
		empVO.setSalary(req.getParameter("esalary"));

		try {
			//Invoke the business method
			String resultMsg = delegate.registerEmployee(empVO);
			//Keep the result in request scope
			req.setAttribute("result", resultMsg);
			//Forward the request to show_result.jsp
			RequestDispatcher rd = req.getRequestDispatcher("/show_result.jsp");
			rd.forward(req, res);
		}
		catch(EmployeeRegistrationProblemException erpe) {
			erpe.printStackTrace();
			req.setAttribute("errMsg", erpe.getMessage());
			RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
		catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
