package com.nit.test;

import com.nit.recruitment.HireJavaFresher;

public class Recruiter1 {

	public static void main(String[] args) {

		HireJavaFresher javaFresher = new HireJavaFresher();
		boolean flag = true;
		if(!javaFresher.conductAptitudeTest())
			flag = false;
		if(!javaFresher.conductGDTest())
			flag = false;
		if(!javaFresher.conductJavaWrittenTest())
			flag = false;
		if(!javaFresher.conductJavaTechnicalTest())
			flag = false;
		if(!javaFresher.conductHRTest())
			flag = false;
		if(flag)
			System.out.println("Java fresher is recruited");
		else
			System.out.println("Java fresher is not recruited");
	}
}