package ConstructorConcept;

public class Testing {

	int age;
	int salary;
	int amount;
	
	public Testing(int age, int salary, int amount) {
		if(salary > 0) {
		this.age = age;
		this.salary = salary;
		this.amount = amount;
		}
		else
			System.out.println("Incorrect Entry");
	}


	//cannot have individual constructors if variables have same data types
	//As it cannot be overloaded, it will throw error as duplicate constructor
//	public Testing(int salary) {
//		this.salary = salary;
//	}

//	public Testing(int age) {
//		this.age = age;
//	}


	public static void main(String[] args) {
		
		Testing t1 = new Testing(25, 100, 0);
		System.out.println(t1.age+" "+t1.salary+" "+t1.amount);
		
		Testing t2 = new Testing(10,0,0);
		

	}

	

}
