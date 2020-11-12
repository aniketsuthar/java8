package com.java.example;

class Employee implements Cloneable {
	int empId;
	String name;
	Department dept;
	int age;
	String gender;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGeneder() {
		return gender;
	}

	public void setGeneder(String geneder) {
		this.gender = geneder;
	}

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
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", age=" + age + ", geneder=" + gender
				+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Employee(int empId, String name, Department dept, int age, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
	}

}