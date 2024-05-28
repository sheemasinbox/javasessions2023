package javasessions2023;

public class CallByReference {
	
	String name;
	int age;
	
	public static void getInfo(CallByReference t1) {  //Now obj and t1 are pointing to the same object
		System.out.println(t1.name + t1.age);   //sheema 37
		
		t1.name = "Farheen";
		t1.age = 29;
		
		System.out.println(t1.name + t1.age);  //Farheen 29
		
	}

	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
//		obj.getInfo(10);  //call by value
		
		obj.name = "Sheema";
		obj.age = 37;
		
		System.out.println(obj.name + obj.age);  //Sheema 37
		
		//Call by object reference
		getInfo(obj);               // Sheema 37  //obj initialized from line23
		
		CallByReference app = new CallByReference();
		getInfo(app);               //null 0     //app not initialized

	}

}
