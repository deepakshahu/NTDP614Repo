package com.nit.dao;

import com.nit.model.PersonProfile;

public interface IPersonDAO {
	
	public PersonProfile getPersonProfileByNo(int pid);
}
