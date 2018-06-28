package com.h.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.h.bo.EmployeBO;

public class EmployeDao {
	private final String query="INSERT INTO Employee VALUES(?,?,?,?,?)";
	private DataSource ds;
	public void setDs(DataSource ds)
	{
		
		this.ds=ds;
	}
public int insert()throws Exception
{
	
	Connection con;
	PreparedStatement ps;
	EmployeBO bo;
	int count=0;
	//create connection
	con=ds.getConnection();
	//prepare statement
	ps=con.prepareStatement(query);
	bo=new EmployeBO();
	ps.setInt(1,bo.getEno());
	ps.setString(2,bo.getEname());
	ps.setInt(3,bo.getGrosssal());
	ps.setInt(4,bo.getNetsal());
	ps.setInt(5,bo.getSal());
	count=ps.executeUpdate();
	return count;
}
}
