package ex3;

import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("저장할 수의 개수를 입력해주세요. >> ");
			int max = sc.nextInt();
			System.out.println("");
			System.out.println(max + "개의 랜덤숫자가 저장되었습니다.\n");
			
			int []random = new int[max];
			for (int i = 0; i < max; i++) {
				
				random[i] = (int)(Math.random() * max) + 1;
				System.out.print(random[i] + " ");
				
			}
			System.out.println("");
			System.out.println("이 중 짝수만 출력합니다.\n");
			
			for (int i = 0; i < max; i++) {
				if (random[i] % 2 == 0) {
					System.out.println(random[i]);
				}
			}
			System.out.println("");
			
		}
		
	}

}
