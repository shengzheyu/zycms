package cn.edu.sjzc.cms.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection getConn(){
		Connection conn = null;
		
			try {
				Class.forName("com.mysql.jdbc.Connection");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			 String url = "jdbc:mysql://localhost/cms";
			
			try {
				conn=DriverManager.getConnection(url,"root", "1234");
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				
		return conn;
	}
	public static void close(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
