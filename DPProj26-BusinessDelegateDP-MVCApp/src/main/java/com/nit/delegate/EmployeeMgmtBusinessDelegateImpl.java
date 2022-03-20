package com.nit.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import com.nit.bo.FinanceEmployeeBO;
import com.nit.bo.HREmployeeBO;
import com.nit.dao.FinanceEmployeeDAOImpl;
import com.nit.dao.HREmployeeDAOImpl;
import com.nit.dao.IFinanceEmployeeDAO;
import com.nit.dao.IHREmployeeDAO;
import com.nit.exception.EmployeeRegistrationProblemException;
import com.nit.factory.ConnectionFactory;
import com.nit.vo.EmployeeVO;

public class EmployeeMgmtBusinessDelegateImpl implements IEmployeeMgmtBusinessDelegate {

	private IFinanceEmployeeDAO financeDAO;
	private IHREmployeeDAO hrDAO;

	public EmployeeMgmtBusinessDelegateImpl() {
		financeDAO = new FinanceEmployeeDAOImpl();
		hrDAO = new HREmployeeDAOImpl();
	}

	@Override
	public String registerEmployee(EmployeeVO vo) throws SQLException, Exception {
		//Convert VO class objects to 2 BO class objects (case1)
		FinanceEmployeeBO financeBO = new FinanceEmployeeBO();
		financeBO.setEmpName(vo.getEmpName());
		financeBO.setEmpAddrs(vo.getEmpAddrs());
		financeBO.setEmpDesg(vo.getEmpDesg());
		financeBO.setSalary(Double.parseDouble(vo.getSalary()));

		HREmployeeBO hrBO = new HREmployeeBO();
		hrBO.setEmpName(vo.getEmpName());
		hrBO.setEmpAddrs(vo.getEmpAddrs());
		hrBO.setEmpDesg(vo.getEmpDesg());

		boolean flag1 = false, flag2 = false;
		Connection con = null;
		String resultMsg = null;
		try {
			//Get connection object from ConnectionFactory
			con = ConnectionFactory.getPooledJdbcConnection();
			//Begin tx (case3)
			con.setAutoCommit(false);
			//Use DAO class objects
			flag1 = hrDAO.insertEmployee(con, hrBO);
			flag2 = financeDAO.insertEmployee(con, financeBO);
			if(flag1==true && flag2==true) {
				con.commit();  //commit tx (case3)
				resultMsg = "Employee registration successfull";
			}
			else {
				con.rollback();  //rollback tx (case3)
				resultMsg = "Employee registration failed";
			}
		}
		catch(SQLException se){
			se.printStackTrace();
			try {
				con.rollback();  //rollback tx (case3)
				resultMsg = "Employee registration failed";
			}
			catch(SQLException se1) {
				se1.printStackTrace();
				//translating DAO generated technology specific exceptions to Project specific user-defined exception
				throw new EmployeeRegistrationProblemException(se1.getMessage());  //case2
			}
			throw new EmployeeRegistrationProblemException(se.getMessage());  //case2
		}
		catch(Exception e){
			e.printStackTrace();
			try {
				con.rollback();  //rollback tx (case3)
				resultMsg = "Employee registration failed";
			}
			catch(SQLException se1) {
				se1.printStackTrace();
				throw new EmployeeRegistrationProblemException(e.getMessage());  //case2
			}
			throw new EmployeeRegistrationProblemException(e.getMessage());  //case2
		}
		finally {
			try {
				if(con!=null)
					con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}//finally

		return resultMsg;
	}//method

}//class