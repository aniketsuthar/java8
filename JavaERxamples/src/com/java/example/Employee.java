package com.java.example;

public class Employee implements Cloneable {
	int empId;
	String name;
	Department dept;

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public Department getDept() {
		return dept;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int empId, String name, Department dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
