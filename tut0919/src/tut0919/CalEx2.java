package tut0919;

public class CalEx2 {

	public String disp2() {
		return "�ڸ��ƾ���Ƽ ����";
	}
	
	// 3. �� ���� ������ ���ϴ� �޼ҵ� �����
	
	// ù��° ���
//	public int add(int a, int b) {
//		return a + b;
//	}
	
	// �ι�° ���
	// ���ʿ��� �޸𸮸� �����ϱ� ������ ù��° ����� ����սô�.
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	// 5. a + b + c
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		// �ڸ��ƾ���Ƽ ����
		// ���� 1 + ���� 2 = ����� ����ϴ� ���α׷�
		// ���α׷� ����
		
		// ������ �� ������, ó���� �� Ÿ�� ����
		// �迭�� ������ ���� ������, ó���� ���� Ÿ��[]����
		
		CalEx2 cal = new CalEx2();
		cal.disp2();
		System.out.println(cal.disp2()); // �ڸ��ƾ���Ƽ ����
		
		// 2. ����1 + ����2 = ���
		
		cal.add(100, 200);
		System.out.println(cal.add(100, 200)); // 300
		
		// 4. ����1 + ����2 + ����3 = ���
		cal.add(100, 200, 300);
		System.out.println(cal.add(100, 200, 300)); // 600
		

	}

}
