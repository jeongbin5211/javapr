package inheritance;

class Cals {
	// ���ϱ�, ����
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	int minus(int num1, int num2) {
		return num1 - num2;
	}
}

class AdvCals extends Cals {
	// ���ϱ�, ����, ���ϱ�, ������
	
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int num1, int num2) {
		return num1 / num2;
	}
}

public class InherEx02 {

	public static void main(String[] args) {
		Cals cal = new Cals();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.minus(100, 1000));
		
		System.out.println("---------------------");
		
		AdvCals cal2 = new AdvCals();
		System.out.println(cal2.mul(100, 200));
		System.out.println(cal2.div(10, 5));
		System.out.println(cal2.add(30, 500));
		System.out.println(cal2.minus(300, 200));
	
	}

}
