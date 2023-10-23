package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	// singleton���� connection �����
	
	// 1. ��ü 1���� ����
	
	private static DBConnect db = new DBConnect();
	
	// 2. ������ ������ 1���� ����
	
	private DBConnect() {};
	
	// 1, 2���� ���� ��ü�� �����Ϸ��� public �޼ҵ�
	
	public static DBConnect getInstance() {
		
		return db;
	}
	
	// 4. ����� �޼ҵ� �ۼ��ϱ�
	
	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			DriverManager.getConnection(url, id, pw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
