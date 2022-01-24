package com.nit.test;

import com.nit.recruitment.HireDotNetFresher;

public class Recruiter2{

	public static void main(String[] args) {

		HireDotNetFresher dotNetFresher = new HireDotNetFresher();
		boolean flag = true;
		if(!dotNetFresher.conductAptitudeTest())
			flag = false;
		if(!dotNetFresher.conductGDTest())
			flag = false;
		if(!dotNetFresher.conductDotNetWrittenTest())
			flag = false;
		if(!dotNetFresher.conductDotNetTechnicalTest())
			flag = false;
		if(!dotNetFresher.conductHRTest())
			flag = false;
		if(flag)
			System.out.println("DotNet fresher is recruited");
		else
			System.out.println("DotNet fresher is not recruited");
	}
}