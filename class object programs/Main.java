class Bank {
	public int id;
	public String fname;
	public String lname;
	public String address;
	public int age;
	public int adharNo;
	public String panNo;
	public String dob;
	
	public void displayDetails() {
		System.out.println("User id : "+id);
		System.out.println("User first name : "+fname);
		System.out.println("User last name : "+lname);
		System.out.println("User Address is : "+address);
		System.out.println("User age is : "+age);
		System.out.println("User adhar no is : "+adharNo);
		System.out.println("User pan card no is : "+panNo);
		System.out.println("User Date of Birth is : "+dob);
	}
}

public class Main {
	public static void main(String[] args) {
		Bank u1 = new Bank();
		u1.id = 101;
		u1.fname = "Rahul";
		u1.lname = "Sharma";
		u1.address = "474 Vijay Nagar";
		u1.age = 20;
		u1.adharNo = 1234567891;
		u1.panNo = "PAK123456";
		u1.dob = "10/02/2005";
		
		u1.displayDetails();
	}
}