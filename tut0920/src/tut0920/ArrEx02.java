package tut0920;

import java.util.Arrays;

public class ArrEx02 {

	public static void main(String[] args) {
		// Ÿ��[] �̸� = new Ÿ��[]{1, 2, 3, 4, 5};
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		boolean[] arr2 = new boolean[] {true, false};
		
		String[] arr3 = new String[] {"red", "green", "blue"};
		
		double[] arr4 = new double[] {0.1, 0.2};
		
		// �迭����
		// �����迭�� .length , �����迭�� .size() ���
		System.out.println(arr4.length); // 2
		
		// toString => ���ڿ��� ǥ���ϴ� ���, Arrays�� import �ؾ���
		System.out.println(Arrays.toString(arr4)); // �迭�� �� [] ��µ�
		
		System.out.println(Arrays.toString(arr2)); // [true, false]
		
		// ������ ~ �Դϴ�. ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("������ " + arr[i] + "�Դϴ�.");
		}
		
		System.out.println("\n���� for�� ���\n");
		
//		for (���Ÿ�� ���� : �迭��) {
//			����ڵ�(����)
//		}
		
		for (int v : arr) {
			System.out.println(v);
		}
		
		for (boolean b : arr2) {
			System.out.println(b);
		}
		
		for (String s : arr3) {
			System.out.println(s);
		}

	}

}
