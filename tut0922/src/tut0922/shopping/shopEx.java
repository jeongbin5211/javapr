package tut0922.shopping;

public class shopEx {

	public static void main(String[] args) {
		// �Ǹ��ڷ� ȸ������ -> �Ǹ��� ���� -> ��ǰ ���(���� ��)
		
		// ������ �� �� �ִ� List �迭 ���� ����
		// Seller�� List<Itme> list = null;
		
		Seller seller = new Seller(1001, "������");
		
		seller.addItems("���", 1000, 10);
		seller.addItems("������", 1500, 20);
		
		seller.showMemberInfo();

	}

}
