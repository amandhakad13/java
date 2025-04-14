class CarInfo {
	public int model;
	public String name;
	public String company;
	public String color;
	public int price;
	public String noPlate;
	public int seater;
	public String manufactureDate;
	
	public void display() {
		System.out.println("Car model is : "+model);
		System.out.println("Car name is : "+name);
		System.out.println("Car company is : "+company);
		System.out.println("Car color is : "+color);
		System.out.println("Car price is : "+price);
		System.out.println("Car no plate is : "+noPlate);
		System.out.println("Car seater is : "+seater);
		System.out.println("Car maufacturing date is : "+manufactureDate);
	}
}

public class Car {
	public static void main(String[] args) {
		CarInfo c1 = new CarInfo();
		c1.model = 2014;
		c1.name = "Swift";
		c1.company = "Maruti Suzuki";
		c1.color = "White";
		c1.price = 1000000;
		c1.noPlate = "MP 09 TA 6023";
		c1.seater = 4;
		c1.manufactureDate = "15/03/2014";
		
		c1.display();
	}
}