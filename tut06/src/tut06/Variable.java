package tut06;

public class Variable {

	public static void main(String[] args) {
		// ���� : ���� �޸𸮿� �����ϴ� ����
		// ������ ���� Ÿ�� ������ = �ʱⰪ;
		// ������ ���� Ÿ�� ������;
		// ������ = �ʱⰪ;
		// �⺻�� Ÿ�� : �ҹ��ڷ� ����
		// int(���� - 4byte), double(�Ǽ� - 8byte)
		// boolean(���� - 1byte) : true, false�� ����
		
		// ���� 100�� �����ϴ� ������ �����ϼ���.
		int i; // �޸𸮿� 4byte ������ ������ �� �ִ� ����
		i = 100; // (�ʱ�ȭ)
		
		int i2 = 100;
		
		int j, k, a;
		j = 100;
		k = 200;
		a = 500;
		
		// �Ǽ� : float(�Ǽ� - 4byte), douber(�Ǽ� - 8byte)
		// 0.1, 0.2�� �����ϴ� ���� ����
		float f = 0.1F;
		double d = 0.2;
		
		// 10000000000�� ������ �����ϼ���.
		// long(���� - 8byte) ū �� ������ �� ����մϴ�.
		// ���̻� L �ٿ��ֱ�
		long l = 10000000000L;
		
		// ���� true, false(0)
		
		boolean b = false;
		
		// ����(char) => ''���
		// �빮�� A ���� �����ϼ���.
		char c = 'A';
		String str = "A";
		
		// ������ Ÿ�� : �빮�ڷ� ����(��, �����迭�� �ҹ��ڷ� ����)
		// Integer(������ ��ü), Double(�Ǽ��� ��ü), ��ü, �迭...
		// 100 -> ��ü�� ����
		
		// ������ ��üŸ�� ������ = new ������ ��üŸ��();
		// 100 -> ��ü�� ������ �����ϼ���.
		Integer num = new Integer(100);
		System.out.println(num);
		
		// ���ڿ� ���� �ڸ��� -> ��ü
		String str2 = new String("�ڸ���");
		
		// 0.1�� ��ü�� �����ϼ���.
		Double d2 = new Double(0.1);
		
		// �л� ����(����) 10���� �����ϼ���. => �迭
		int[] scores = new int[10];
		
	}

}
