package tut0922;

import java.util.ArrayList;
import java.util.List;

// 접근 제한자 : public > protected > default > private
// 클래스에서는 public 과 default만 사용가능 -> default 는 같은 클래스 내에서만 사용가능

class Item {
	private int itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	// 생성자
	
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
		System.out.println("상품번호 : " + itemNum + " 상품명 : " + itemName + " 가격 : " + itemPrice + " 재고 : " + itemStock);
	}
}

class ItemDao {
	
	public List<Item> getItems() {
		
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(1000, "사과", 1000, 10)); 
		aList.add(new Item(1001, "복숭아", 1500, 20));
		aList.add(new Item(1002, "바나나", 2000, 30));
		
		return aList;
	}
	
}

public class ListEx03 {

	public static void main(String[] args) {
		// 객체(Item) : 상품번호, 상품명, 가격, 재고
		
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(1000, "사과", 1000, 10)); // 고정배열 초기화 arr[i] = new Item(); 과 같은 의미
		aList.add(new Item(1001, "복숭아", 1500, 20));
		aList.add(new Item(1002, "바나나", 2000, 30));
		
//		System.out.println(aList);
		System.out.println("등록된 상품은 " + aList.size() + "개 입니다.");
		System.out.println("for1 상품 출력\n");
	
		for (int i = 0; i < aList.size(); i++) {
//			System.out.println(aList.get(i)); // 또는
			
			// 메소드를 이용하여 출력하기
			aList.get(i).Disp();
		}
		
		System.out.println("");
		System.out.println("for2 상품출력\n");

//		for (타입 별명 : 배열명) {
//			출력코드(별명)
//		}
		
		for (Item list : aList) {
			System.out.println(list);
		}
		
		// ItemDao 로 이동
		
		ItemDao dao = new ItemDao();
		
		for (Item item : dao.getItems()) {
//			System.out.println(item); // 또는
			item.Disp();
		}
		
	}

}
