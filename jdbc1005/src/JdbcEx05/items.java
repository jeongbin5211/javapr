package JdbcEx05;

public class items {
	private int itemId;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String itemDate;
	
	// getter, setter
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
		
		if (itemPrice < 0) {
			this.itemPrice = 0;
		}
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
		
		if (itemStock < 0) {
			this.itemStock = 0;
		}
	}
	public String getItemDate() {
		return itemDate;
	}
	
	@Override
	public String toString() {
		return "items [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemStock="
				+ itemStock + ", itemDate=" + itemDate + "]";
	}
	
}
