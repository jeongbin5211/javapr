package tut0919;

import java.time.LocalDateTime;

class Board {
	// 1. �ʵ�
	private int num;
	private String subject;
	private String writer;
	private LocalDateTime regist = LocalDateTime.now();
	
	// 2. ������
	public Board() {}
	
	
	// 3. �޼ҵ�
	
	@Override
	public String toString() {
		return "Board [��ȣ : " + num + ", ���� : " + subject + ", �ۼ��� : " + writer + ", �ۼ��� : " + regist + "]";
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
		// ��ȣ int, ���� String, �ۼ��� String, �ۼ��� LocalDateTime
		
		Board b = new Board();
		System.out.println(b.toString());
		
		System.out.println("---�Է�---");
		b.setNum(1);
		b.setSubject("�Խ���1");
		b.setWriter("������");
		
		System.out.println("---���---");
		// get���� ���
//		System.out.println(b.getNum());
//		System.out.println(b.getSubject());
//		System.out.println(b.getWriter());
//		System.out.println(b.getRegist());
		
		// �޼ҵ�� ���
		b.toString();
		System.out.println(b.toString());

	}

}
