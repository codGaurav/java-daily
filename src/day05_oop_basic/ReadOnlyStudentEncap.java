package day05_oop_basic;

class StudentGaurav{
	private int rollNumber;
	private String name;
	
	StudentGaurav(int rollNumber, String name){
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

}
public class ReadOnlyStudentEncap {
	public static void main(String[] args) {
		StudentGaurav student = new StudentGaurav(1111, "Gaurav");
		
		System.out.println("Roll Number is "+student.getRollNumber()+"\n"+"Student name is "+student.getName());
	}
}
