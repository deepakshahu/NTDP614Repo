package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.delegate.IStockMgmtBusinessDelegate;
import com.nit.delegate.StockMgmtBusinessDelegateImpl;
import com.nit.vo.StockAllDetailsVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet{

	private IStockMgmtBusinessDelegate delegate;

	@Override
	public void init() throws ServletException {
		delegate = new StockMgmtBusinessDelegateImpl();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MainControllerServlet.doGet()");
		//Read form data
		String stockName = req.getParameter("stockName");
		//Invoke method on BusinessDelegate
		try {
			StockAllDetailsVO vo = delegate.findStockAllDetailsByStockName(stockName);
			//keep the results in request scope
			req.setAttribute("stockDetails", vo);
			//forward the request to show_stock_details.jsp
			RequestDispatcher rd = req.getRequestDispatcher("/show_stock_details.jsp");
			rd.forward(req, res);
		}
		catch(Exception e) {
			//forward the request to error.jsp
			RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

	@Override
	public void destroy() {
		delegate=null;
	}

}
