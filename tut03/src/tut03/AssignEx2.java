package tut03;

public class AssignEx2 {

	public static void main(String[] args) {
		// ����������
		// ���Կ����ڸ� �ٿ��� (���) ���
		
		int num = 5;
		++num;
		
		System.out.println(num); //6
		System.out.println(++num); // 7
		System.out.println(num++); // 7
		System.out.println(num);   // 8
		
		num = num + 1;
		System.out.println(num); // 9
		
		num += 1;
		System.out.println(num); // 10
		
		num += 5;
		System.out.println(num); // 15
		
		num *= 10;
		System.out.println(num); // 150
		
		num /= 150;
		System.out.println(num); // 1
		
		// 0 ~ 9 ���� ���ϴ� �ݺ��� �ۼ��ϱ�
		int sum = 0;
		for (int i = 0; i < 10; i ++) {
			sum += i;
		}
		System.out.println(sum); // 45

	}

}
