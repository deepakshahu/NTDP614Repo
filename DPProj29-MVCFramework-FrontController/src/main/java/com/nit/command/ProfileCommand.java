package com.nit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.model.PersonProfile;
import com.nit.service.IProfileMgmtService;
import com.nit.service.ProfileMgmtServiceImpl;

public class ProfileCommand implements ICommand {
	
	private IProfileMgmtService service;
	
	public ProfileCommand() {
		service = new ProfileMgmtServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("ProfileCommand.execute()");
		//Read additional req param values
		int pid = Integer.parseInt(req.getParameter("pid"));
		//Use service
		PersonProfile profile = service.fetchPersonProfileById(pid);
		//keep the results in scope
		req.setAttribute("profileData", profile);
		//return LVn
		return "show_details";
	}
 
}
