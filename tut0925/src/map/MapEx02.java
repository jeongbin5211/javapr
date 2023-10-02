package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Board {
	private int id;
	private String subject;
	private String writer;
	private LocalDate regdate = LocalDate.now();
	
	public Board() {}

	public Board(int id, String subject, String writer) {
		this.id = id;
		this.subject = subject;
		this.writer = writer;
		
	}
	
	// getter setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDate getRegdate() {
		return regdate;
	}
	
	
	public void disp() {
		System.out.println("id : " + id + " 제목 : " + subject + " 작성자 : " + writer + " 작성일 : " + regdate);
	}
	
}

public class MapEx02 {

	public static void main(String[] args) {
		// p1 -> id, subject, writer, regdate
		// p2 -> id, subject, writer, regdate
		// p3 -> id, subject, writer, regdate
		
		Map<String, Board> map = new HashMap<String, Board>();
		map.put("p1", new Board(1, "제목1", "허정빈"));
		map.put("p2", new Board(2, "제목2", "이지윤"));
		map.put("p3", new Board(3, "제목3", "김이박"));
		
		map.forEach((k, v) -> {
			Board board = map.get(k);
//			board.disp(); // 전체출력
			
			// id만 출력
			System.out.println(board.getId());
		});
		
		// Object로 사용시 get에서 형 변환 시켜줘야함
		// Map<String, Object> map2 = new HashMap<>();
		// Board board = (Board) map2.get(key);

	}

}
