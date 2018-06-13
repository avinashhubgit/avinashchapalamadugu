package com.h.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbRelated {
public Connection useConnection()throws Exception
{
	Connection con=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
	return con;
}
}
