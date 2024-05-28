package StringManipulation;

public class StringLiteralsConstantPool {

	public static void main(String[] args) {
	
		//String COnstant Pool(SCP) is in Heap Memory
		//String Literals are stored in SCP
		//SCP allows only unique values
		//Garbage Collector is responsible for SCP in Heap Memory
		//When a String Literal is created it is stored in SCP
		//When an object is created, One copy is created in stack memory and one in SCP in Heap Memory/
		
		//Before jdk1.8, SCP was not a part of Heap Memory
		//As Strings are the most commonly used data types, it has been given special treatment of SCP to avoid duplicate values
		
		String s1 = "Hello";     //1 obj in SCP
		String s2 = "Hello";     //0 obj  --- (No Duplicate values in SCP)
		
		String s3 = new String("World");              //1 obj in heap memory and ref-s3 in Stack; 1 obj in SCP  => 2 objects
		String s4 = "World";                          //0 obj
		String s5 = "Hello";                          //0 obj
		
		String s6 = new String("Selenium");           //1 obj in heap memory and ref-s6 in STack; 1 obj in SCP  => 2 objects
		String s7 = "Selenium";						  //0 obj
		String s8 = new String("Selenium");           //1 obj in heap memory and ref-s8 in Stack; 0 obj in SCP
		
		System.out.println(s1 == s2);        //true -- in SCP, s1 and s2 refer to the same "Hello" object
		System.out.println(s3 == s4);		 //false -- == operator compares the address references of the objects and not values
		System.out.println(s6 == s8);        //false
		System.out.println(s6.equals(s8));   //true   -- Compares values
		System.out.println(s3.equals(s4));   //true
		
		String obj = new String("testing");            //1 obj in heap memory and ref-obj in Stack; 1 obj in SCP  => 2 objects
		String ob = new String("testing");             //1 obj in heap memory and ref-ob in Stack; 0 obj in SCP
		System.out.println(obj == ob);       //false
		System.out.println(obj.equals(ob));  //true
		
		String o = "testing";
		String p = "Testing";
		String q = "testing";
		System.out.println(o == p);          //false  -- Java is case-sensitive (testing == Testing)
		System.out.println(obj == o);        //false  -- compares the address references
		System.out.println(obj == ob);       //false  -- compares the address references
		System.out.println(o.equals(p));     //false  -- Java is case-sensitive (testing == Testing)
		System.out.println(o.equalsIgnoreCase(p));       //true
		System.out.println(o == p);                      //true -- o and p are pointing to the same "testing obj in SCP (testing == testing)
		
		
		
	}

}
