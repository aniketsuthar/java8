package com.java.example;

public class Department implements Cloneable {
	private String deptName;
	private String empNo;
	private int id;

	public String getDeptName() {
		return deptName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public int getId() {
		return id;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", empNo=" + empNo + ", id=" + id + "]";
	}

	public Department(String deptName, String empNo, int id) {
		super();
		this.deptName = deptName;
		this.empNo = empNo;
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
