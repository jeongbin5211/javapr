package singletonEx;

import java.sql.*;

public class DBConnect {
	
	// singleton으로 만들기
	
	// 1. 객체 생성 1번만 작성 : private static
	private static DBConnect db = new DBConnect();
	
	// 2. 생성자 생성도 1번만 private
	private DBConnect() {}
	
	// 1, 2 에서 만들어 놓은 객체에 접근하려면 public을 이용해서 싱글톤 접근 메소드를 작성
	public static DBConnect getInstance() {
		return db;
	}
	
	// 4. 사용할 메소드 작업하기 : Connection
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
