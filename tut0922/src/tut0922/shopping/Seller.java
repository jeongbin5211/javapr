package tut0922.shopping;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	private int memberID;
	private String memberName;
	
	List<Item> list = null;
	
	public Seller(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		
		list = new ArrayList<Item>();
	}
	
	// ��ǰ �߰� �޼ҵ�
	
	public void addItems(String itemName, int itemPrice, int itemStock) {
		Item item = new Item();
		
		item.setItemName(itemName);
		item.setItemPrice(itemPrice);
		item.setItemStock(itemStock);
		
		list.add(item);
		
	}
	
	// �Ǹ��� ���� ��� �޼ҵ�
	public void showMemberInfo() {
//		for (Ÿ�� ���� : �迭��) {
//			����ڵ�(����)
//		}
		
		for (Item info : list) {
			System.out.println("�Ǹ��� ���̵� : " + memberID + " �Ǹ��� �̸� : " + memberName + " ��ǰ�� : " + info.getItemName() + " ���� : " + info.getItemPrice() + " ��� : " + info.getItemStock());
			System.out.println("----------------------------");
		}
		System.out.println(list.size() + "���� ��ǰ�� ��ϵǾ����ϴ�.");
	}
}
