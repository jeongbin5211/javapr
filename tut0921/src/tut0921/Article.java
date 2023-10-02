package tut0921;

import java.time.LocalDate;

public class Article {
	
	// 필드
	
	int num;
	String subject;
	int visit;
	LocalDate regist = LocalDate.now();
	
	// 생성자
	
	public Article() {
		
	}
	
	public Article(int num, String subject, int visit, LocalDate regist) {
		this.num = num;
		this.subject = subject;
		this.visit = visit;
		this.regist = regist;
				
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public LocalDate getRegist() {
		return regist;
	}

	@Override
	public String toString() {
		return "Article [num=" + num + ", subject=" + subject + ", visit=" + visit + ", regist=" + regist + "]";
	}

}
