package com.nit.test;

import com.nit.factory.HireFresherFactory;
import com.nit.recruitment.HireFresher;

public class Recruiter {

	public static void main(String[] args) {
		
		HireFresher fresher = HireFresherFactory.getInstance("Dotnet");
		boolean result = fresher.fresherRecruitmentDrive();
		System.out.println("Fresher recruited : "+result);
	}
}