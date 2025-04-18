class Product1 {
	int id;
	String name;
	float price;
	int discount;
	String expairyDate;
	String manufatureDate;
	
	Product1() {
		id = 0;
		name = null;
		price = 0.0f;
		discount = 0;
		expairyDate = null;
		manufatureDate = null;
	}
	
	Product1(int id, String name, float price, int discount, String expairyDate, String manufatureDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.expairyDate = expairyDate;
		this.manufatureDate = manufatureDate;
	}
	
	public void display() {
		System.out.println("id = "+this.id);
		System.out.println("name = "+this.name);
		System.out.println("price = "+this.price);
		System.out.println("discount = "+this.discount);
		System.out.println("expairy date = "+this.expairyDate);
		System.out.println("manufacture date = "+this.manufatureDate);
	}
}

public class Test3 {
	public static void main(String[] args) {
		Product1 p = new Product1(101,"Soap",10,2,"10/4/25","10/5/2020");
		p.display();
	}
}