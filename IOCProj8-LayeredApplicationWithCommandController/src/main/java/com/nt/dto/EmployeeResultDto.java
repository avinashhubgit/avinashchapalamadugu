package com.nt.dto;

public class EmployeeResultDto extends EmployeeDto {
	private int mgr;
	private int comm;
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
//public String toString()
//{
//	return "empno"++"ename"+ename+"job"+job+"sal"+sal+"deptno:"+deptno+"mgr:"+mgr+"comm"+comm;
//}
//}
}