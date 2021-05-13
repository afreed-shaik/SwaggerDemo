package com.ojas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "Details about the Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "StudentId", name="sId", required=true, value="sId")
	private int  sId;
	
	@ApiModelProperty(notes = "Name of the Student", name="sName", required=true, value="sName")
	private String sName;
	
	@ApiModelProperty(notes = "Student Address", name="sAddr", required=true, value="sAddr")
	private String sAddr;

	public Student() {
		super();
	}

	public Student(int sId, String sName, String sAddr) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddr = sAddr;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddr() {
		return sAddr;
	}

	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddr=" + sAddr + "]";
	}
	
	
	
}
