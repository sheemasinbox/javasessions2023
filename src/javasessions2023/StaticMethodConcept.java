package javasessions2023;

public class StaticMethodConcept {
	
	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("get Info");
	}
	
	public void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		
		//1. Call Static variables and methods using classname
		StaticMethodConcept.name = "Jim";
		System.out.println(name);
		StaticMethodConcept.getInfo();
		
		//2. Call non-Static variables and methods using object of class
		StaticMethodConcept obj = new StaticMethodConcept();
		obj.age = 10;
		System.out.println(obj.age);
		obj.sendMail();
		
		//3. Call Static variables and methods directly
		name = "Harry";
		System.out.println(name);
		getInfo();
		

	}

}
