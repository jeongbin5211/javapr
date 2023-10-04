package jdbc1004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcEx04 {

	public static void main(String[] args) {
		
		jdbcEx04 jdbc = new jdbcEx04();
		jdbc.run();

	}

	void run() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String psw = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, psw);
			System.out.println("연결 확인");
			
			Statement stmt = conn.createStatement();
			
			String sql = "insert into register values(500, '이지윤', '0605')";
			
			stmt.execute(sql);
			System.out.println("회원가입이 완료되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
