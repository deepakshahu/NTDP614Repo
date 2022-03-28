package com.nit.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class PersonProfile implements Serializable {
	private Integer pid;
	private String pname;
	private String paddrs;
	private Long mobileNo;
	private Long aadharNo;
	private Long passportNo;
	
	public PersonProfile() {
		System.out.println("PersonProfile :: 0-param constructor");
	}
}
