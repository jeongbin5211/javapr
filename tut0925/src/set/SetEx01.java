package set;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// Set -> HashSet
		
		// �Ʒ� �� �� �ϳ� ���
		// Set<> set = new HashSet<>();
		
		// HashSet<> set = new HashSet<>();
		
		// HashSet ���� ����
		// HashSet ���ڿ� ����
		// ����, ���
		
		Set<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		
		// ���� �迭 ���·� ����� ��
		// .toString�� ���������մϴ�.
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println("--------------------");
		
		HashSet<String> set2 = new HashSet<String>();
		
		set2.add("����");
		set2.add("�λ�");
		set2.add("����");
		
		System.out.println(set2);
		System.out.println(set2.toString());
		System.out.println(set2.size());
		
		// hash.remove();
		
		set2.remove("����");
		
		// ���� for ���
		for (String str : set2) {
			System.out.println(str);
		}
		
		// �˻� �迭��.contains(�˻���) -> ����� boolean
		
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
