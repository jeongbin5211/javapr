package tut0922;

import java.util.ArrayList;
import java.util.List;

// ���� ������ : public > protected > default > private
// Ŭ���������� public �� default�� ��밡�� -> default �� ���� Ŭ���� �������� ��밡��

class Item {
	private int itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	// ������
	
	public Item() {
		
	}
	
	public Item(int itemNum, String itemName, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}

	@Override
	public String toString() {
		return "Item [itemNum=" + itemNum + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemStock="
				+ itemStock + "]";
	}
	
	public void Disp() {
		System.out.println("��ǰ��ȣ : " + itemNum + " ��ǰ�� : " + itemName + " ���� : " + itemPrice + " ��� : " + itemStock);
	}
}

class ItemDao {
	
	public List<Item> getItems() {
		
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(1000, "���", 1000, 10)); 
		aList.add(new Item(1001, "������", 1500, 20));
		aList.add(new Item(1002, "�ٳ���", 2000, 30));
		
		return aList;
	}
	
}

public class ListEx03 {

	public static void main(String[] args) {
		// ��ü(Item) : ��ǰ��ȣ, ��ǰ��, ����, ���
		
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(1000, "���", 1000, 10)); // �����迭 �ʱ�ȭ arr[i] = new Item(); �� ���� �ǹ�
		aList.add(new Item(1001, "������", 1500, 20));
		aList.add(new Item(1002, "�ٳ���", 2000, 30));
		
//		System.out.println(aList);
		System.out.println("��ϵ� ��ǰ�� " + aList.size() + "�� �Դϴ�.");
		System.out.println("for1 ��ǰ ���\n");
	
		for (int i = 0; i < aList.size(); i++) {
//			System.out.println(aList.get(i)); // �Ǵ�
			
			// �޼ҵ带 �̿��Ͽ� ����ϱ�
			aList.get(i).Disp();
		}
		
		System.out.println("");
		System.out.println("for2 ��ǰ���\n");

//		for (Ÿ�� ���� : �迭��) {
//			����ڵ�(����)
//		}
		
		for (Item list : aList) {
			System.out.println(list);
		}
		
		// ItemDao �� �̵�
		
		ItemDao dao = new ItemDao();
		
		for (Item item : dao.getItems()) {
//			System.out.println(item); // �Ǵ�
			item.Disp();
		}
		
	}

}
