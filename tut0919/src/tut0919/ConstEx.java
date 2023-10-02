package tut0919;

class Const {
	// default ������ ���� ����, �� �� �����ڴ� ���� ����ؾ� �մϴ�.
//	public Const() {
//		
//	}
//	
//	public Const(String str) { // �����ε� ������ ������ �����
//		System.out.println(str);
//	}
//	
//	public Const(String str, String domain) {
//		System.out.println(str + ", " + domain);
//	}
	
	// 2������ ����� �޼ҵ�
	public Const(String str) {
		System.out.println(str);
	}
	
//	public void add(int a, int b) {
//		System.out.println(a + b);
//	}
	
	// or
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public String close(String str) {
		return str;
	}
	
	// 3������ ��� (tel �߰�)
	public Const(String str, String tel) {
		this(str);
		System.out.println(tel);
	}
	
	public Const(String str, String tel, String addr) {
		this(str,tel);
		System.out.println(addr);
	}
}

public class ConstEx {

	public static void main(String[] args) {
//		Const c = new Const();
//		
//		// �ʱⰪ : ���α׷� ���۽� �ڸ��ƾ���Ƽ ��� -> �۾�
//		Const c2 = new Const("�ڸ��ƾ���Ƽ");
//		
//		// �߰����� �۾��� �� ��
//		// �ڸ��ƾ���Ƽ, ������ ���
//		Const c3 = new Const("�ڸ��ƾ���Ƽ", "������");
		
		// 2.
		// �ڸ��ƾ���Ƽ ���� Ver1.0 ���
		// ���� + ���� = ���� �޼ҵ�
		// ���α׷� ���� = �޼ҵ�
		Const cal = new Const("�ڸ��ƾ���Ƽ ���� Ver1.0");
		cal.add(1, 2); 
		System.out.println(cal.add(1, 2)); // 3
		System.out.println(cal.close("���α׷��� �����մϴ�."));
		
		// 3. �ڸ��ƾ���Ƽ, ��ȭ��ȣ �߰�
		Const seoul = new Const("�ڸ��ƾ���Ƽ", "051-1234-5678");
		
		// 4. �ڸ��ƾ���Ƽ, ��ȭ��ȣ, �ּ� �߰�
		Const gwangju = new Const("�ڸ��ƾ���Ƽ", "00000", "����");
	}

}
