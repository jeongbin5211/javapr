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
			System.out.println("���� Ȯ��");
			
			Statement stmt = conn.createStatement();
			
			String sql = "insert into register values(500, '������', '0605')";
			
			stmt.execute(sql);
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
