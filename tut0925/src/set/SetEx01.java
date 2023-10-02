package set;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// Set -> HashSet
		
		// 아래 둘 중 하나 사용
		// Set<> set = new HashSet<>();
		
		// HashSet<> set = new HashSet<>();
		
		// HashSet 정수 저장
		// HashSet 문자열 저장
		// 삭제, 출력
		
		Set<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		
		// 값을 배열 형태로 출력할 때
		// .toString은 생략가능합니다.
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println("--------------------");
		
		HashSet<String> set2 = new HashSet<String>();
		
		set2.add("서울");
		set2.add("부산");
		set2.add("서울");
		
		System.out.println(set2);
		System.out.println(set2.toString());
		System.out.println(set2.size());
		
		// hash.remove();
		
		set2.remove("서울");
		
		// 향상된 for 출력
		for (String str : set2) {
			System.out.println(str);
		}
		
		// 검색 배열명.contains(검색어) -> 결과는 boolean
		
		Set<String> set3 = new HashSet<String>();
		
		set3.add("red");
		set3.add("green");
		set3.add("blue");
		
		boolean result = set3.contains("red");
		
		System.out.println(result);
		
		System.out.println(set3.contains("black"));
		System.out.println(set3.contains("blue"));
		
		// remove, removeAll
		
		set3.remove("red");
		System.out.println(set3.size());
		
		set3.removeAll(set3);
		System.out.println(set3.size());

	}

}
