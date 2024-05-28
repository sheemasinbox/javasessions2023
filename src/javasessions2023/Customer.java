package javasessions2023;

public class Customer {
	
	//ObjectReferenceInterchange Example
	//We change the object reference to point to other objects.
	//An Object can have multiple reference names.
	//Objects are created in Heap memory
	//Object references are created in Stack memory
	//Static variables are created in CMA - Common Memory Allocation
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		//Customer1
		Customer c1 = new Customer();
		c1.name = "Sam";
		c1.age = 38;
		c1.city = "Vizag";
		
		Customer c2 = new Customer();
		c2.name = "Priya";
		c2.age = 28;
		c2.city = "Hyderabad";
		
		Customer c3 = new Customer();
		c3.name = "Tim";
		c3.age = 25;
		c3.city = "Delhi";
		
		Customer c4 = new Customer();
		c4.name = "Harry";
		c4.age = 35;
		c4.city = "Mumbai";
		
		Customer c5 = new Customer();
		c5.name = "Dia";
		c5.age = 27;
		c5.city = "Banglore";
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city); //Sam
		System.out.println(c2.name+" "+c2.age+" "+c2.city); //Priya
		System.out.println(c3.name+" "+c3.age+" "+c3.city); //Tim
		System.out.println(c4.name+" "+c4.age+" "+c4.city); //Harry
		System.out.println(c5.name+" "+c5.age+" "+c5.city); //Dia
		System.out.println("-------------------------------");
		
		c1 = c2;
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city); //Priya
		System.out.println(c2.name+" "+c2.age+" "+c2.city); //Priya
		System.out.println(c3.name+" "+c3.age+" "+c3.city); //Tim
		System.out.println(c4.name+" "+c4.age+" "+c4.city); //Harry
		System.out.println(c5.name+" "+c5.age+" "+c5.city); //Dia
		System.out.println("-------------------------------");
		
		c2 = c3;
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city); //Priya
		System.out.println(c2.name+" "+c2.age+" "+c2.city); //Tim
		System.out.println(c3.name+" "+c3.age+" "+c3.city); //Tim
		System.out.println(c4.name+" "+c4.age+" "+c4.city); //Harry
		System.out.println(c5.name+" "+c5.age+" "+c5.city); //Dia
		System.out.println("-------------------------------");
		
		c3 = c4;
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city); //Priya
		System.out.println(c2.name+" "+c2.age+" "+c2.city); //Tim
		System.out.println(c3.name+" "+c3.age+" "+c3.city); //Harry
		System.out.println(c4.name+" "+c4.age+" "+c4.city); //Harry
		System.out.println(c5.name+" "+c5.age+" "+c5.city); //Dia
		System.out.println("-------------------------------");
		
		c4 = c5;
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city); //Priya
		System.out.println(c2.name+" "+c2.age+" "+c2.city); //Tim
		System.out.println(c3.name+" "+c3.age+" "+c3.city); //Harry
		System.out.println(c4.name+" "+c4.age+" "+c4.city); //Dia
		System.out.println(c5.name+" "+c5.age+" "+c5.city); //Dia
		System.out.println("-------------------------------");
		
		c5 = c1;    //c1 is already pointing to Priya and not Sam. so c5 will also point to Priya
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city); //Priya
		System.out.println(c2.name+" "+c2.age+" "+c2.city); //Tim
		System.out.println(c3.name+" "+c3.age+" "+c3.city); //Harry
		System.out.println(c4.name+" "+c4.age+" "+c4.city); //Dia
		System.out.println(c5.name+" "+c5.age+" "+c5.city); //Priya
		System.out.println("-------------------------------");
		
		
		
		
		
		
		

	}

}
