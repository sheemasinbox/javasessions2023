package Constructor_Assignments;

public class Employee {
	
	int id;
	String name;
	private double salary;
	
	//Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	//Setter
	public void setSalary(double salary) {
		double salary1 = salary*10/100;
		System.out.println("10% salary raise is: "+salary1);
		salary = salary + salary1;
		this.salary = salary;

	}
	
}
