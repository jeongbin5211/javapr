package map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// Map - HashMap
		// 101 -> ����
		// 102 -> �λ�
		// 103 -> �뱸
		// 104 -> ���� // ���� ���� �ߺ��� �����ϳ� key���� �ߺ��� �Ұ�����
		
//		Map<K, V> map = new HashMap<K, V>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "����");
		map.put(102, "�λ�");
		map.put(103, "�뱸");
		
		System.out.println(map.toString());
		
//		�迭��.forEach((k����, v����) -> {
//			
//		})
		
		map.forEach((k , v) -> {
			System.out.println("Ű�� " + k + ", ���� " + v);
		});
		
		System.out.println("-----------------------");
		
//		map
//		userid01 -> ȫ�浿
//		userid02 -> ��ö��
//		userid03 -> ������
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map2.put("userid01", "ȫ�浿");
		map2.put("userid02", "��ö��");
		map2.put("userid03", "������");
		map2.put("userid03", "������ ���� �ȳ���");// ���� key�� ������
		
		map2.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
		
		// ���ϴ� ���� �ִ��� Ȯ���ϱ� -> true or false
		System.out.println(map2.containsKey("userid03"));
		
		System.out.println(map2.containsValue("������"));
	}
}
