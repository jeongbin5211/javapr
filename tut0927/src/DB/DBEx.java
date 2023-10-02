package DB;

interface QueryEx {
	
	// �Է�
	void insert();
	
	// ����
	void update();
	
	// ����
	void delete();
	
	// ���
	void select();
	
}

class Mysql implements QueryEx {

	@Override
	public void insert() {
		System.out.println("Mysql �����ͺ��̽��� �̿��� ȸ�������մϴ�.");
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void delete() {
		
		
	}

	@Override
	public void select() {
		
		
	}
	
}

class Oracle implements QueryEx {

	@Override
	public void insert() {
		
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void delete() {
		
		
	}

	@Override
	public void select() {
		System.out.println("Oracle db�� �˻��մϴ�.");
	}
	
}

public class DBEx {

	public static void main(String[] args) {
	
		Mysql m = new Mysql();
		m.insert();
		
		System.out.println("---------------------");
		
		Oracle o = new Oracle();
		o.select();

	}

}