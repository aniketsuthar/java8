package com.java.example.cloning;

public final class Department implements Cloneable {
	private final String deptName;
	private final String empNo;
	private final int id;

	public String getDeptName() {
		return deptName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public int getId() {
		return id;
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
