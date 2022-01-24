package com.nit.recruitment;

public class HireUITechnologiesFresher extends HireFresher{

	@Override
	public boolean conductTechnicalWrittenTest() {
		System.out.println("HireUITechnologiesFresher.conductTechnicalWrittenTest()[UI]");
		return true;
	}

	@Override
	public boolean conductTechnicalInterviewTest() {
		System.out.println("HireUITechnologiesFresher.conductTechnicalInterviewTest()[UI]");
		return true;
	}

}