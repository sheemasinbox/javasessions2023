package Inheritance_Assignments;

public class University extends WorldEducationServices{

	int marks = 100;
	
	public void universityCourses() {
		System.out.println("University COurses List");
	}
	
	@Override
	public void implementHierarchy() {
		System.out.println("University- implementing Hierarchy");
	}
	
	
}
