package tut0920;

public class ArrEx03 {

	public static void main(String[] args) {
		// 메소드를 이용해서 배열 출력하기
		// 정수에 5개 점수를 저장한 후
		// 합계 출력
		// 평균 출력
		
//		int[] scores = new int[] {1, 2, 3, 4, 5};
		int[] scores = null;
		scores = new int[] {1, 2, 3, 4, 5};
		
		Cal c = new Cal();
		
		System.out.println("길이 출력 메소드 사용");
		System.out.println(c.leng(scores));
		
		c.add(scores);
		
		System.out.println(c.add(scores)); // 15
		
		// 평균
		
		System.out.println("평균값 출력");
		System.out.println(c.avg(scores));
		System.out.printf("평균값은 %.2f 입니다.", c.avg(scores));

		System.out.println("---------------");
		
		Disp d = new Disp();
		d.title();
		
		// d.title 내용을 다르게 출력하기 -> 오버라이딩 활용
		
		d.title("컴퓨터 프로그램");
		
		System.out.println("---------------");
		
		d.close();
		
		// d.close()의 내용을 다르게 출력하기
		
		d.close("시스템 종료");
		
		
	}

}
