package tut0922.shopping;

public class shopEx {

	public static void main(String[] args) {
		// 판매자로 회원가입 -> 판매자 승인 -> 상품 등록(여러 개)
		
		// 허정빈만 쓸 수 있는 List 배열 공간 생성
		// Seller가 List<Itme> list = null;
		
		Seller seller = new Seller(1001, "허정빈");
		
		seller.addItems("사과", 1000, 10);
		seller.addItems("복숭아", 1500, 20);
		
		seller.showMemberInfo();

	}

}
