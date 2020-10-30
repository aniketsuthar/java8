package com.java.example.cloning;

public final class Employee implements Cloneable {
	private final int empId;
	private final String name;
	private Department dept;

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public Department getDept() {
		return dept;
	}

	public Employee(int empId, String name, Department dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = new Department(dept.getDeptName(), dept.getEmpNo(), dept.getId());
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee e = (Employee) super.clone();
		e.dept = (Department) this.dept.clone();
		return e;

	}
}
