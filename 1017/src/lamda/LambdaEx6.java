package lamda;

// �������̽� ����� : �� ���� ���ڿ� �Ű�����
interface ConcatStr {
	void makeConcat(String s1, String s2);
}

// ���� : ���� �������̵� �� �� ���θ޼ҵ忡�� ����

class ConcatStrImpl implements ConcatStr {

	@Override
	public void makeConcat(String s1, String s2) {
		
		System.out.println(s1 + s2);
		
	}

	
	
}

public class LambdaEx6 {

	public static void main(String[] args) {
		
		ConcatStrImpl constr = new ConcatStrImpl();
		
		constr.makeConcat("�ȳ�", "�ϼ���");
		
		System.out.println("------------------------------");
		
		// ���ٽ�����
		
		ConcatStr cs = (str1, str2) -> {
			System.out.println(str1 + str2);
		};
		
		cs.makeConcat("�ȳ���", "����.");
	}

}
