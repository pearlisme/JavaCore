package com.pearl.java;

public class Department {

	
	public int DeptId;
	public String DeptName;
	public String DeptDisc;
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return DeptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return DeptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	/**
	 * @return the deptDisc
	 */
	public String getDeptDisc() {
		return DeptDisc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + ", DeptName=" + DeptName + ", DeptDisc=" + DeptDisc + "]";
	}
	/**
	 * @param deptDisc the deptDisc to set
	 */
	public void setDeptDisc(String deptDisc) {
		DeptDisc = deptDisc;
	}
}
