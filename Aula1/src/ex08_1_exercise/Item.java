package ex08_1_exercise;

public class Item {
	String descr;
	int quantity;
	double price;
	char colorCode = 'U';
	
	public void displayItem() {
		System.out.println("Item: " + descr + ", " + quantity + ", "
				+ price + ", " + colorCode);
	}
	
	public void setItemFields(String desc, int qty, double pr) {
		this.descr = desc;
		this.quantity = qty;
		this.price = pr;
	}
	
	public int setItemFields (String desc, int qty, double pr, char c) {
		if (c == ' ') {
			colorCode = c;
			this.setItemFields(desc, qty, pr);
			return 1;
		} else {
			this. = colorCode;
			return true;
		}
	}
}