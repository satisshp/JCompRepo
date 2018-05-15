package com.ca.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {


public Connection dbConnection() {
	Connection connection=null;
	String DRIVER ="com.mysql.jdbc.Driver";
	String URL = "jdbc:mysql://enteprisevms.cnxhkbauy6wb.us-east-2.rds.amazonaws.com:3306/vms";
	String USER= "vms";
	String PASS= "Vendor123";
	try {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL,USER,PASS);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("DB connection Err::"+e.getMessage());
	}
//	System.out.println("connected");
	return connection;
	
}


}
