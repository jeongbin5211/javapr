package tut07;

public class HelloEx2 {
	
	// �޼ҵ�� ���θ޼ҵ� �ۿ� �����
	// ���������� ����Ÿ�� �޼ҵ��() {
	//
	// }

	public void title(String local) {
		// System.out.println("�ڸ��� ����Ƽ ��ī����");
		// System.out.println("Koreait ��ī����");
		
		// ������ �ٲٰ� ������
		// ()�ȿ� ���ϴ� Ÿ�� + �Ű������� ex) String str
		
		// �λ� �ڸ��ƾ���Ƽ ��ī����
		// ���� �ڸ��ƾ���Ƽ ��ī����
		// ���� �ڸ��ƾ���Ƽ ��ī����
		System.out.println(local + "�ڸ��ƾ���Ƽ ��ī����");
		
	}
	
	public void info(String tel, String address) {
		System.out.println("��ȭ��ȣ : ");
		System.out.println("�ּ� : ");
	}
	
	public static void main(String[] args) {
		// �ڸ��ƾ���Ƽ ��ī���� : sysout���� ����� ���� -> �޼ҵ��� ����Ÿ���� void�� �ؾ���
		
		// HelloEx2 ��ü�� �����ͼ� �ʱ�ȭ
		HelloEx2 he = new HelloEx2();
		he.title("�λ�");
		he.info(null, null);
//		System.out.println("��ȭ��ȣ : 051 - 1234-56789");
//		System.out.println("�ּ� : �λ걤����");
//		
//		he.title();
//		
//		System.out.println("---------------------------------");
		
		HelloEx2 busan = new HelloEx2();
		
		busan.title("�λ�");
		
		System.out.println("---------------------------------");
		
		
		HelloEx2 seoul = new HelloEx2();
		
		seoul.title("����");
		
		System.out.println("��ȭ��ȣ : 02-1234-5678");
		System.out.println("�ּ� : ����Ư����");
		
		seoul.title("����");
		
		System.out.println("---------------------------------");
		
		HelloEx2 gwangju = new HelloEx2();
		
		gwangju.title("����");
		
		System.out.println("��ȭ��ȣ : ");
		System.out.println("�ּ� : ���ֱ�����");
		
		gwangju.title("����");
		
		System.out.println("---------------------------------");
		
		busan.title("�λ�");
		
		busan.info("051-1234-5678", "�λ걤����");
		
		busan.title("�λ�");
		
		System.out.println("---------------------------------");
		
		seoul.title("����");
		
		seoul.info("02-123-123312", "���ﱤ����");
		
		seoul.title("����");
		
		

	}

	
	
}
