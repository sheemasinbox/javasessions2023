package javasessions2023;

public class User {
	
	//Class -- Category -- BluePrint -- Prototype, Template
	//instance -- object
	//Class - Human ; Properties - Eyes(static), nose(static), name, address, height, weight
	//Class - Laptop ; Properties - name, size, color, price
	
	//Class Variables -- Data Members
	String name;
	int age;
	String city;
	String telephone;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		
		//create the object of the class: using new keyword
				User u1 = new User();
				
				//User: class
				//u1 --> object reference name
				//new User(); --> Object
				
				u1.name = "Gunel";
				u1.age = 30;
				u1.city = "Bangalore";
				u1.telephone = "9876543212";
				u1.salary = 12.33;
				u1.isActive = true;
				
				System.out.println(u1.name);
				System.out.println(u1.isActive);
				
				
				User u2 = new User();
				System.out.println(u2.name);
				System.out.println(u2.age);
				System.out.println(u2.city);
				System.out.println(u2.salary);
				System.out.println(u2.isActive);
				
				User u3 = new User();
				u3.name = "Devika";
				u3.salary = 64.55;
				u3.isActive = true;
				
				System.out.println(u3.name);
				System.out.println(u3.age);
				System.out.println(u3.city);
				System.out.println(u3.salary);
				System.out.println(u3.isActive);
				System.out.println(u3.telephone);
				
				System.out.println(u3);  //Junk value
				
				//No Reference Object
				new User().name = "Tom";
				new User().age = 29;
				
				//null reference object
				User u4 = new User();
				u4 = null;
	//			u4.name = "Sheema";   //NullPointerException - Cannot assign field "name" because "u4" is null
				
	//			User u4 = new User();   //Since U4 object reference already exists, its a duplicate variable
				u4 = new User();    //new object is created and assigned to U4 (Old one is not referenced)
				u4.name = "farheen";
				System.out.println(u4.name);
				
				System.gc(); //Calls the Garbage Collector in the JVM - But there is no guarantee
				//GC depends on JVM to take call on destroying the objects in Heap Memory. 
				//GC will automatically destroy only those objects which have no references or null references
				//JVM keeps monitoring Heap Memory.
				//GC never enters Stack Memory.
		

	}

}
