package singletonEx;

import java.sql.*;

public class DBConnect {
	
	// singleton���� �����
	
	// 1. ��ü ���� 1���� �ۼ� : private static
	private static DBConnect db = new DBConnect();
	
	// 2. ������ ������ 1���� private
	private DBConnect() {}
	
	// 1, 2 ���� ����� ���� ��ü�� �����Ϸ��� public�� �̿��ؼ� �̱��� ���� �޼ҵ带 �ۼ�
	public static DBConnect getInstance() {
		return db;
	}
	
	// 4. ����� �޼ҵ� �۾��ϱ� : Connection
	Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
