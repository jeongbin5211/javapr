import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcEx03 {

	public static void main(String[] args) {
		jdbcEx03 jdbc = new jdbcEx03();
		jdbc.run();
	}
	
	public void run() {
		try {
			// 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 연결
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 확인");
			
			String sql = "insert into register values(103, '나박이', '1111')";
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
