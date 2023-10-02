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
	
	// 상품 추가 메소드
	
	public void addItems(String itemName, int itemPrice, int itemStock) {
		Item item = new Item();
		
		item.setItemName(itemName);
		item.setItemPrice(itemPrice);
		item.setItemStock(itemStock);
		
		list.add(item);
		
	}
	
	// 판매자 정보 출력 메소드
	public void showMemberInfo() {
//		for (타입 별명 : 배열명) {
//			출력코드(별명)
//		}
		
		for (Item info : list) {
			System.out.println("판매자 이이디 : " + memberID + " 판매자 이름 : " + memberName + " 상품명 : " + info.getItemName() + " 가격 : " + info.getItemPrice() + " 재고 : " + info.getItemStock());
			System.out.println("----------------------------");
		}
		System.out.println(list.size() + "개의 상품이 등록되었습니다.");
	}
}
