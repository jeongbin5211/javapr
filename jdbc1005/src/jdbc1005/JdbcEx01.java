package jdbc1005;

import java.sql.*;

class DBDao {
	
	void insertDB1() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String id = "root";
			String pw = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("�����ͺ��̽� ����");
			
			Statement stmt = conn.createStatement();
			
			String sql = "insert into member values(null, '������', now(), now());";
			
			stmt.execute(sql);
			System.out.println("����� �߰��Ǿ����ϴ�.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void insertDB2() throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://127.0.0.1:3306/grp";
		String id = "root";
		String pw = "1234";
		
		DriverManager.getConnection(url, id, pw);
		System.out.println("�����ͺ��̽� ����");
		
	}
	
}

public class JdbcEx01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBDao dao = new DBDao();
//		dao.insertDB1();
		dao.insertDB2();
		

	}

}
