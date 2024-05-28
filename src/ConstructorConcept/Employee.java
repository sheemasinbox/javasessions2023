package ConstructorConcept;

public class Employee {
	
	//class variables
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	//Constructor Employee - 
	//COnstructors have no return type, not even void
	//Const.. name will be same as CLass name
	//Const.. cannot be static
	//Const... can be overloaded
	//Const.. will be called only when an object of class is created
	//Const... are not data members of the class
	
	//Purpose of contstructor:
	//COnst.. is used for initializing the class variables with the const.. local variables using this keyword
	//Const.. is used to restrict the unnecessary object creation - depends on the usecase
	//Const... is used for initialization purpose only.
	//Const.. do not contain business logic as it does not return anything. 
	//But Functions have logic and it may or may not return.
	
	
//	public Employee() { //0 param or default const...
//		System.out.println("Emp... Default COnst...");
//	}
//	
//	public Employee(int i) { //1 param
//		System.out.println(i);
//	}
	
	//'this' keyword always points to the current class object variables
	public Employee(String name, int age) {//2 param --these are called local variables
	
		this("testing", 40, 10);   //constructor call should always be the 1st statement in the const..
		//this.global variables or object variable = local variable
		this.name = name;   //local variables or method parameters are assigned to class variables
		this.age = age;
		
		
	}
	
	public Employee(String name, int age, double salary) {
		System.out.println("Hi");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age, double salary, boolean isActive, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
	}

	public Employee(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		getInfo();  //Since its non-static method, can call directly without object creation as both are in heap memory
	    Employee.setInfo();  //since its a static method, can call directly or using classname
	}
	
	//NS
	public void getInfo() {
		System.out.println("Getting Info");
		printInfo();    //NS -> NS
	}
	
	//NS
	public void printInfo() {
		System.out.println("Print Info");
	}
	
	public static void setInfo() {
		System.out.println("Setting Info");
	}


	public static void main(String[] args) {
		
//		Employee e1 = new Employee();
//		e1.name = "Tom";
//		
//		Employee e2 = new Employee();
//		e2.name = "Naveen";
//		e2.salary = 12.33;
		
		//-- Unnecessary objects are getting created
		//GC will not destroy these as they have a reference
//		Employee e5 = new Employee();  
//		Employee e6 = new Employee();
//		Employee e7 = new Employee();
		
		Employee e1= new Employee("Tom", 30); //compiler will decide which const.. to call
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		Employee e2 = new Employee("Geet", 25, 'f');
		System.out.println(e2.name+" "+e2.age+" "+e2.gender+" "+e2.salary+" "+e2.isActive);
	

	}

}
