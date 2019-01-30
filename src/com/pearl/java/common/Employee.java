package com.pearl.java.common;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	public int EmpId;
	public String EmpName;
	public String EmpDept;
	
	
	public Employee(int EmpId,String EmpName, String EmpDept) {
		// TODO Auto-generated constructor stub
		
		this.EmpId = EmpId;
		this.EmpName =EmpName;
		this.EmpDept = EmpDept;
		
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return EmpId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return EmpName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return EmpDept;
	}
	
	
	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.EmpId-o2.EmpId;
	}
	
}