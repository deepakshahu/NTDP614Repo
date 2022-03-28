package com.nit.service;

import com.nit.dao.IPersonDAO;
import com.nit.dao.PersonDAOImpl;
import com.nit.model.PersonProfile;

public class ProfileMgmtServiceImpl implements IProfileMgmtService{
	
	private IPersonDAO dao;
	
	public ProfileMgmtServiceImpl() {
		dao = new PersonDAOImpl();
	}

	@Override
	public PersonProfile fetchPersonProfileById(int pid) {
		System.out.println("ProfileMgmtServiceImpl.fetchPersonProfileById()");
		//Use DAO
		PersonProfile profile = dao.getPersonProfileByNo(pid);
		return profile;
	}

}
