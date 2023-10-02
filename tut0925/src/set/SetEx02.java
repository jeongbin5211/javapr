package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		// String -> ��� -> ���� -> ���
//								   hasNext() -> next()
		
		Set<String> set = new HashSet<>();
		
		set.add("USA");
		
		System.out.println(set);
		
		System.out.println("for2");
		
		for (String str : set) {
			System.out.println(str);
		}

		System.out.println("while");
		
//		set.clear();// ��� ����
		
		Iterator<String> ir = set.iterator(); // �迭���� ��ü�� ����
		while(ir.hasNext()) { // ����� ��ü�� ���
			System.out.println(ir.next());
		}
	}

}
