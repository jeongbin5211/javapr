package ex3;

import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("������ ���� ������ �Է����ּ���. >> ");
			int max = sc.nextInt();
			System.out.println("");
			System.out.println(max + "���� �������ڰ� ����Ǿ����ϴ�.\n");
			
			int []random = new int[max];
			for (int i = 0; i < max; i++) {
				
				random[i] = (int)(Math.random() * max) + 1;
				System.out.print(random[i] + " ");
				
			}
			System.out.println("");
			System.out.println("�� �� ¦���� ����մϴ�.\n");
			
			for (int i = 0; i < max; i++) {
				if (random[i] % 2 == 0) {
					System.out.println(random[i]);
				}
			}
			System.out.println("");
			
		}
		
	}

}
