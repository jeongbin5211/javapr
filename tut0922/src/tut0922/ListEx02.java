package tut0922;

import java.util.ArrayList;

public class ListEx02 {

	public static void main(String[] args) {
		// ���� Ÿ�� �Է� �� -> ���� -> ���(for1)
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		list.remove(0);
		
//		System.out.println(list); // [200, 300]
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------------------------");
		
		// ���ڿ� �Է�, ����, ���
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("ff 00 00"); // �����ڵ� red
		list2.add("#f00");
		
		list2.add("#00 00 ff"); // �����ڵ� blue
		list2.add("#00f");
		
		list2.add("0 255 0"); // �����ڵ� green #0f0 ���� f�� 255
		
		list2.remove(2);
		list2.remove("#00f");
		
		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2);
			System.out.println(list2.get(i));
		}
	
	}

}
