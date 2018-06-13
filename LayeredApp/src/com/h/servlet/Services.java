package com.h.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Services {
public Connection getCon() throws Exception
{
Connection con=null;
//PreparedStatement ps=null;
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
System.out.println(con);
return con;
}
}
