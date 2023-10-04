import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcEx02 {

	public static void main(String[] args) {
		jdbcEx02 jdbc = new jdbcEx02();
		
		jdbc.run();
	}
	
	public void run() {
		try {
			// 1. 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 2. 연결정보
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, pwd);
			
			// conn : 데이터베이스에 연결되었으니까
			String sql = "insert into register values(102, '김나박', '1234')";
			
			// 위 변수에 저장된 쿼리를 실행하는 createStatement() 객체 사용
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입이 완료되었습니다.");
			
			// 4. execute();
			
			
			// 3. 확인
			System.out.println("데이터베이스 연결");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
