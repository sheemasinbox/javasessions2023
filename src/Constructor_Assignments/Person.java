package Constructor_Assignments;

public class Person {

	//Instance Variables
	String name;
	int age;
	char gender;
	double height;
	
	//Constructor
	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public Person(String name, char gender, double height) {
		this.name = name;
		this.gender = gender;
		this.height = height;
	}

	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Constructor
	public Person(String name) {
		this(name, 35);
		this.name = name;	
	}
	
	//Method
	public void personName(String name) {
		this.name = name;
		System.out.println("The name is: "+name);
	}
//
//	//Getter
//	public String getName() {
//		return name;
//	}
//
//	//Setter
//	public void setName(String name) {
//		this.name = name;
//	}
	
	



}
