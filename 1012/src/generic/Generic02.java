package generic;

// ��ǰ : Ÿ��, ��
class Item<K, V> {

	private K k;
	private V v;
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
}

public class Generic02 {

	public static void main(String[] args) {
		
		// 1. ���ڿ�, ����
		
		Item<String, Integer> item = new Item<>();
		
		item.setK("�Ƿ�");
		item.setV(100000);
		
		System.out.println(item.getK() + "�� ������ " + item.getV());
		
		// 2. �� -> ���� �ڵ� -> 500(����), 400(���α׷�), 200(����)
		// 404, ��û�Ͻ� �ּҸ� ã�� �� �����ϴ�.
		
		Item<Integer, String> code = new Item<>();
		
		code.setK(404);
		code.setV("��û�Ͻ� �ּҸ� ã�� �� �����ϴ�.");
		
		System.out.println(code.getV() + "(" + code.getK() + ")");
		
	}

}
