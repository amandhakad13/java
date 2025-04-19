class Student {
	int rollNo;
	String name;
	float phy;
	float che;
	float mat;
	
	Student() {
		
	}
	
	Student(int rollNo, String name, float phy, float che, float mat) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
		this.che = che;
		this.mat = mat;
	}
	
	public void display() {
		System.out.println("RollNo = "+this.rollNo);
		System.out.println("Name = "+this.name);
		System.out.println("Physics = "+this.phy);
		System.out.println("Chemistry = "+this.che);
		System.out.println("Mathematics = "+this.mat);
	}
	
	public float totalMarks() {
		return (phy+che+mat);
	} 
	
	public float totalPercentage() {
		return totalMarks()/3;
	}
	
	public char division() {
		float per = totalPercentage();
		if(per>=40&&per<=60) {
			return 'C';
		}
		else if(per>60&&per<=80){
			return 'B';
		}
		else if(per>80&&per<=100) {
			return 'A';
		}
		else {
			return 'F';
		}
	}
}

class Main2 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Akash", 76, 89, 64);
		
		s1.display();
		
		float total = s1.totalMarks();
		float percentage = s1.totalPercentage();
		char grade = s1.division();
		
		System.out.println("Total marks = "+total);
		System.out.println("Total Percentage = "+percentage);
		System.out.println("Grade = "+grade);
	}
}