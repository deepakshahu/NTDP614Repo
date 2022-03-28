package com.nit.service;

import com.nit.model.PersonProfile;

public interface IProfileMgmtService {
	
	public PersonProfile fetchPersonProfileById(int pid);
}
