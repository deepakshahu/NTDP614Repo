package com.nit.factory;

import com.nit.dao.DAO;

public interface DAOFactory {
	public DAO createDAO(String type);
}
