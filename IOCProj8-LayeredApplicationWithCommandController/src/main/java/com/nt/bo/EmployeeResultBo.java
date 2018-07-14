package com.nt.bo;

public class EmployeeResultBo extends EmployeeBo {
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
	public String toString()
	{
		return "mgr:"+mgr+"comm"+comm;
	}
}
