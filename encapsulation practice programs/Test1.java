class Person {
	private String name;
	private int age;
	private String country;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
}

class Test1 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("Rohit");
		p.setAge(20);
		p.setCountry("India");
		
		String name = p.getName();
		int age = p.getAge();
		String country = p.getCountry();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("country : "+country);
	} 
}