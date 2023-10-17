package jdbc1005;

import java.sql.*;

class insertDao {
	
	void insertDB() {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String id = "root";
		String pw = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 확인");
			
			String sql = "insert into items values(null, ?, ?, ?, now());";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, "tzu_tzu");
			ps.setInt(2, 3000);
			ps.setInt(3, 20);
			
			int row = ps.executeUpdate();
			
			if (row > 0) {
				System.out.println(row);
				System.out.println("상품등록이 완료되었습니다.");
			}else {
				System.out.println("관리자에게 문의하세요.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void selectDB() {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from items order by item_id desc";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("상품번호 : " + rs.getInt(1) + " ");
				System.out.println("상품명 : " + rs.getString(2) + " ");
				System.out.println("가격 : " + rs.getInt(3) + " ");
				System.out.println("재고 : " + rs.getInt(4) + " ");
				System.out.println("등록일 : " + rs.getDate(5) + " ");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}

public class JdbcEx04 {

	public static void main(String[] args) {
		
		insertDao dao = new insertDao();
		
//		dao.insertDB();
		dao.selectDB();

	}

}
