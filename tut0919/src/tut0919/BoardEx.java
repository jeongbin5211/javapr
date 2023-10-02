package tut0919;

import java.time.LocalDateTime;

class Board {
	// 1. 필드
	private int num;
	private String subject;
	private String writer;
	private LocalDateTime regist = LocalDateTime.now();
	
	// 2. 생성자
	public Board() {}
	
	
	// 3. 메소드
	
	@Override
	public String toString() {
		return "Board [번호 : " + num + ", 제목 : " + subject + ", 작성자 : " + writer + ", 작성일 : " + regist + "]";
	}
	
	// getter setter
	
	// num
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	// subject
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	// writer
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
	// LocalDateTime
	public LocalDateTime getRegist() {
		return regist;
	}
}

public class BoardEx {

	public static void main(String[] args) {
		// 번호 int, 제목 String, 작성자 String, 작성일 LocalDateTime
		
		Board b = new Board();
		System.out.println(b.toString());
		
		System.out.println("---입력---");
		b.setNum(1);
		b.setSubject("게시판1");
		b.setWriter("허정빈");
		
		System.out.println("---출력---");
		// get으로 출력
//		System.out.println(b.getNum());
//		System.out.println(b.getSubject());
//		System.out.println(b.getWriter());
//		System.out.println(b.getRegist());
		
		// 메소드로 출력
		b.toString();
		System.out.println(b.toString());

	}

}
