package tut0922;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// List -> ArrayList, Vector
		// 입력, 수정, 삭제 -> 데이터 변동이 잦은것 처리
		// 정수를 출력하는 ArrayList
		
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
		
//		for (타입 별명 : 배열명) {
//			출력코드(별명)
//		}
		
		for (Integer num : list) {
			System.out.println(num);
		}
		
		
	}

}
