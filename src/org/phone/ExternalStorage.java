package org.phone;

public class ExternalStorage {

	private int empId;
	private String empName;
	private char gender;

	public int getEmpId( int empId) {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
		System.out.println(empId);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void empId() {

	}

	public void empName() {

	}
}
