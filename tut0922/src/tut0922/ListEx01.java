package tut0922;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// List -> ArrayList, Vector
		// �Է�, ����, ���� -> ������ ������ ������ ó��
		// ������ ����ϴ� ArrayList
		
		List<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		
		int size = list.size();
		System.out.println(size); // 2
		
		System.out.println("for 1");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------------------------");
		
		System.out.println("for 2");
		
//		for (Ÿ�� ���� : �迭��) {
//			����ڵ�(����)
//		}
		
		for (Integer num : list) {
			System.out.println(num);
		}
		
		
	}

}
