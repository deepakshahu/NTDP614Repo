package com.nit.recruitment;

public class HireJavaFresher extends HireFresher{

	@Override
	public boolean conductTechnicalWrittenTest() {
		System.out.println("HireJavaFresher.conductTechnicalWrittenTest()[Java]");
		return true;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireJavaFresher.conductTechnicalInterviewTest()[Java]");
		return true;
	}

}