package tut07;

import java.util.Scanner;

public class IfRandomEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 선택 >> ");
		
		int me = sc.nextInt();
		
		int com = (int)(Math.random() * 3) + 1;
		
		if (me != com) {
			System.out.println("컴퓨터는 " + com + ", 나는 " + me + "입니다." );
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("컴퓨터는 " + com + ", 나는 " + me + "입니다.");
			System.out.println("당신이 이겼습니다.");
			System.out.println("프로그램을 종료합니다.");
		}

	}

}
