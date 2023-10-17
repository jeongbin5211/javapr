package jdbc1005;

import java.sql.*;

class SelectDao {
	
	void selectDB() {
		// 연결, 쿼리실행, 실행결과
		
		// 1. Connection
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // while
		
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String id = "root";
			String pw = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결확인");
			
			stmt = conn.createStatement();
			
			String sql = "select * from member order by com_id desc;";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString("com_name"));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDate(4));
			}
					
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class JdbcEx02 {

	public static void main(String[] args) {
		
		SelectDao dao = new SelectDao();
		dao.selectDB();

	}

}
