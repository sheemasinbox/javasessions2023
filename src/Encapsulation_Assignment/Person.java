package Encapsulation_Assignment;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	//Getter
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Method
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
	
	

}
