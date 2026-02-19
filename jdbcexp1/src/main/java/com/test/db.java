package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class db {
	
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root", "root");
			System.out.println("Connection successful");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(1,'Raksha',99)");
			System.out.println("Data inserted");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}