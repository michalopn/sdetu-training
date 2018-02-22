package labs;

public class Lab2 {

	public static void main(String[] args) {
		Student st1 = new Student("John Doe", "1234567890");
		st1.enroll("Mathematics I");
		st1.pay("Mathematics I", 100);
		System.out.println(st1.toString());
		
		Student st2 = new Student("Tim Short", "4589632578");
		st2.enroll("Physics I");
		st2.pay("Physics I", 150);
		System.out.println(st2.toString());
	}

}

class Student {
	
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String email;
	private static int ID = 0;
	private String userID;
	private double balance = 1000;
	private String[] courses;
	
	//Constructor
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		email = (name.toLowerCase()).replaceAll("\\s+", "") + "@sdetuniversity.com";
		ID++;
		System.out.println("New Student created: " + name + " with SSN: " + SSN + " and email: " + email);
		
		generateUserID();
	}

	//Getters and Setters for phone, city, state
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//Generate userID
	private void generateUserID() {
		int r = (int)(Math.random() * (9000 - 1000) + 1000);
		userID = ID + "" + r + SSN.substring(SSN.length()-4, SSN.length());
		System.out.println("User ID: " + userID);
	}
	
	//Methods
	public void enroll(String className) {
		System.out.println("The student " + name + " enrolled to " + className);
		
		//I want to add each course  to the array courses
		
	}
	
	public void pay(String className, double amount) {
		System.out.println("The student " + name + " paid for the class: " + className + " $ " + amount);
		balance = balance - amount;
		ckeckBalance();
	}
	
	public void ckeckBalance() {
		System.out.println("New Balance: " + balance);
	}
	
	public void showCourses() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[User ID: " + userID + "]\n" + "[Balance: " + balance + "]";
	}
	
}
