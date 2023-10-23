package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	// singleton으로 connection 만들기
	
	// 1. 객체 1번만 생성
	
	private static DBConnect db = new DBConnect();
	
	// 2. 생성자 생성도 1번만 생성
	
	private DBConnect() {};
	
	// 1, 2에서 만든 객체에 접근하려면 public 메소드
	
	public static DBConnect getInstance() {
		
		return db;
	}
	
	// 4. 사용할 메소드 작성하기
	
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
