package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.managed.DataSourceXAConnectionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBo;
import com.nt.bo.EmployeeResultBo;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final String EMPLOYEE_DETAILS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,nvl(MGR,0),nvl(COMM,0) FROM EMP WHERE EMPNO=? OR ENAME=? OR JOB=? OR SAL=? OR DEPTNO=?";
	
	private JdbcTemplate jt;

	public EmployeeDaoImpl(JdbcTemplate jt) {
		
		this.jt = jt;
	}

	@Override
	public List<EmployeeResultBo> fetchEmpDetails(EmployeeBo bo)  {
		
		List<EmployeeResultBo> listrbo=null;
		listrbo=jt.query(EMPLOYEE_DETAILS, new ResultSetExtractor<List<EmployeeResultBo>>()
				{

					@Override
					public List<EmployeeResultBo> extractData(ResultSet rs) throws SQLException,DataAccessException {
						List<EmployeeResultBo> listrbo=null;
						EmployeeResultBo bo=null;
						//create rbo object
						listrbo=new ArrayList<>();
						while(rs.next())
						{
							bo=new EmployeeResultBo();
							bo.setEmpno(rs.getInt(1));
							bo.setEname(rs.getString(2));
							bo.setJob(rs.getString(3));
							bo.setSal(rs.getInt(4));
							bo.setDeptno(rs.getInt(5));
							bo.setMgr(rs.getInt(6));
							bo.setComm(rs.getInt(7));
							System.out.println(bo.toString());
							listrbo.add(bo);
							
						}
						
						return listrbo;
					}//annonymus class method
			
				}//annonymus class
				
				, bo.getEmpno(),bo.getEname(),bo.getJob(),bo.getSal(),bo.getDeptno());
		
		
		return listrbo;
	}//method

}//class
