class Product {
	private int id;
	private String name;
	private int price;
	private int discount;
	private String expDate;
	private String manuDate;
	
	public void setData(int id, String name, int price, int discount, String expDate, String manuDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.expDate = expDate;
		this.manuDate = manuDate;
	}
	
	public void display() {
		System.out.println("id = "+this.id);
		System.out.println("name = "+this.name);
		System.out.println("price = "+this.price);
		System.out.println("discount = "+this.discount);
		System.out.println("expairy date = "+this.expDate);
		System.out.println("manufacture date = "+this.manuDate);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setData(101,"Shampoo",180,10,"10/05/2025","11/05/2022");
		p1.display();
	}
}