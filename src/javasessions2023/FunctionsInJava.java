package javasessions2023;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {
	
	//Cannot create a function/method inside another function
			//Functions are parallel to each other
			//A function can be called from another function
			//Non-Static functions are data members of a class
			
			//1. Function: No input(0 param) and No return (void)
			public void test(){
				System.out.println("Test Method with no params and no return");
			}
			
			//2. Function: some input(params) and no return (void)
			public void getBill(int days) {  //1 param
				System.out.println("Getting Bill Info");
				int finalAmount = days * 100;
				System.out.println(finalAmount);
			}
			
			//3. Function: some input(params) and return
			public int sum(int a, int b) {  //2 params
				System.out.println("Adding 2 numbers");
				int s = a + b;
				return s;
			}
			
			//4. Function: No input and some return
			//return type : String
			public String getInfo() {
				System.out.println("Getting Info");
				String s = "Hello World!";
				return s;
			}
			
			//return type : boolean
			public boolean isAppExist() {
				return true;
			}
			
			//return type : int
			public int calculateMarks(int marks, int extraMarks, int discMarks) {
				int finalMarks = marks + extraMarks + discMarks;
				return finalMarks;
			}
			
			//return multiple values using return type : Object[] and different data types of params
			//function cannot have multiple return statements
			//return should be the last statement in the function
			public Object[] calculateNumbers(int marks, float extraMarks, int discMarks) {
				float finalMarks = marks + extraMarks - discMarks;
				String school = "IIS";
				boolean flag = true;
				Object finalInfo[] = {finalMarks, school, flag};
				return finalInfo;
			}
			
			public void printName() {
				System.out.println("Sheema");
				return;                             //Blank return can be used for void return type
			}
			
			public void launchURL(String url) {
				System.out.println(url);
			}
			
			public String[] getDevices() {
				System.out.println("Getting Devices");
				String[] devices = {"MacBook", "iPhone", "iPad"};
				return devices;
			}
			
			public ArrayList<String> getUsersList() {
				System.out.println("Getting Users List");
				ArrayList<String> usersList = new ArrayList<String>();
				usersList.add("Sheema");
				usersList.add("Armaan");
				usersList.add("Dia");
				return usersList;	
			}
			
			public ArrayList<Object> student(int id, String name, float marks) {
				ArrayList<Object> stu = new ArrayList<Object>();
				stu.add(id);
				stu.add(name);
				stu.add(marks);
				return stu;
			}
			

	public static void main(String[] args) {
	
		//Call a function - Create an object for non-static functions
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
		obj.getBill(10);  //Calling function by passing value. Call by value is 10 - value/argument
		obj.getBill(20);
		
		int sum = obj.sum(10, 20);
		System.out.println(sum);
		
		int sum1 = obj.sum(-10, 4);
		System.out.println(sum1);
		
		String message = obj.getInfo();
		System.out.println(message);
		
		if(obj.isAppExist()) {
			System.out.println("Login to App");
		}
		
		int f1 = obj.calculateMarks(70, 10, 5);
			System.out.println(f1);
		
		obj.launchURL("https://www.google.com");

		String myDevices[] = obj.getDevices();
		System.out.println(Arrays.toString(myDevices));
		System.out.println(myDevices.length);

		ArrayList<String> myList = obj.getUsersList();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("Swapna");
		System.out.println(myList);
		System.out.println(myList.size());
		
		
		Object info[] =  obj.calculateNumbers(100, 12.33f, 10);
		System.out.println(Arrays.toString(info));
		
		ArrayList<Object> s = obj.student(1, "Hina", 87.50f);
		System.out.println(s);
		
		
		

	}

}
