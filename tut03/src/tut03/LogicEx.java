package tut03;

public class LogicEx {

	public static void main(String[] args) {
		boolean val1 = true;
		boolean val2 = false;
		
		// && : ���� ��� = AND = �̸鼭, �̰�
		// ���� 1�� �����ϸ鼭 ����2�� �����ϴ� ����� ����ϼ���.
		System.out.println(val1 && val2); // false
		
		// || : ���� �� �ϳ��� = OR = �Ǵ�, �̰ų�
		// ����1�� �����ϰų� ����2�� �����ϴ� ����� ����ϼ���.
		System.out.println(val1 || val2); // true
		
		// �ֹι�ȣ�� 1 �Ǵ� 3�̸� ����
		// �ֹι�ȣ�� 2 �Ǵ� 4�̸� ���ڷ� ǥ���ϼ���.
		
		int jumin = 4;
		
		if(jumin % 4 == 1 || jumin % 4 == 3)
			System.out.println("����");
		else
			System.out.println("����");
		
		
		String result = (jumin % 4 == 1 || jumin % 4 == 3) ? "����" : "����";
		System.out.println(result);
		
	}

}
