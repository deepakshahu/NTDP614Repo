package com.nit.recruitment;

public class HireDotNetFresher extends HireFresher{

	@Override
	public boolean conductTechnicalWrittenTest() {
		System.out.println("HireDotNetFresher.conductTechnicalWrittenTest()[DotNet]");
		return true;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireDotNetFresher.conductTechnicalInterviewTest()[DotNet]");
		return true;
	}

}