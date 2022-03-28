package com.nit.dao;

import com.nit.model.PersonProfile;

public class PersonDAOImpl implements IPersonDAO {

	@Override
	public PersonProfile getPersonProfileByNo(int pid) {
		System.out.println("PersonDAOImpl.getPersonProfileByNo()");
		PersonProfile per = null;
		if(pid==101) {
			per = new PersonProfile();
			per.setPid(101);
			per.setPname("raja");
			per.setPaddrs("hyd");
			per.setMobileNo(9999999999L);
			per.setAadharNo(869228375887L);
			per.setPassportNo(254896514L);
		}
		else if(pid==102) {
			per = new PersonProfile(102, "rakesh", "vizag", 888888888L, 214523667659L, 741258963L);
		}
		else
			throw new IllegalArgumentException("Invalid Person id");
		return per;
	}

}
