package tut0920;

import java.util.Arrays;

public class ArrEx02 {

	public static void main(String[] args) {
		// 타입[] 이름 = new 타입[]{1, 2, 3, 4, 5};
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		boolean[] arr2 = new boolean[] {true, false};
		
		String[] arr3 = new String[] {"red", "green", "blue"};
		
		double[] arr4 = new double[] {0.1, 0.2};
		
		// 배열길이
		// 고정배열은 .length , 동적배열은 .size() 사용
		System.out.println(arr4.length); // 2
		
		// toString => 문자열로 표현하는 기능, Arrays를 import 해야함
		System.out.println(Arrays.toString(arr4)); // 배열일 때 [] 출력됨
		
		System.out.println(Arrays.toString(arr2)); // [true, false]
		
		// 정수는 ~ 입니다. 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수는 " + arr[i] + "입니다.");
		}
		
		System.out.println("\n향상된 for문 출력\n");
		
//		for (출력타입 별명 : 배열명) {
//			출력코드(별명)
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
