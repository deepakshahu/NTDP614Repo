package com.nit.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Customer implements Serializable {
	private int cid;
	private String cname;
	private String cadd;
	private float billAmt;
}
