package com.nt.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	private int sno;
	private int empno;
	private String ename;
	private String job;
	private int sal;
	private int deptno;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
public String toString()
{
	return "sno"+sno+"empno"+empno+"ename"+ename+"job"+job+"sal"+sal+"deptno:"+deptno;
}
}
