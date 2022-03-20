package com.nit.vo;

import lombok.Data;

//VO class contains all its properties as the String properties

@Data
public class EmployeeVO {
	private String empName;
	private String empAddrs;
	private String empDesg;
	private String salary;
}
