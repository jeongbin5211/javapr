package tut03;

public class CastEx {

	public static void main(String[] args) {
		// ������ ����ȯ = �� ĳ����(�ڵ�����ȯ) : ���� => ū
		
		int i = 100;
		float f = i;
		System.out.println(f); // 100.0
		
		// ����� ����ȯ = �ٿ� ĳ���� : ū => ����
		float f2 = 1.23F;
//		int i2 = f2; // �����߻�
		int i2 = (int)f2;
		System.out.println(i2); // 1

		System.out.println("------------------------");
		
		double d1 = 1.23;
		double d2 = 3.45;
		System.out.println(d1 / d2);
		
		int cnt = 3;
		int sum = 100;
		double result = 0.0;
		
		result = (double) sum / cnt;
		System.out.println(result); // 33.33333...
		
		result = (double) sum / (double) cnt;
		System.out.println(result); // 33.33333...
		
		
	}

}
