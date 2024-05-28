package javasessions2023;

public class ForEachLoop {

	public static void main(String[] args) {
	
		int i[] = {10, 20, 30, 40, 10, 1};
		
		//index based loop:
		for (int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("---------------");
		
		//for each loop:
		for (int e : i) {
			System.out.println(e);
		}
		System.out.println("---------------");

		//double array:
		double d[] = {1.1, 2.2, 3.4, 9.8, 12.33};
		for (double e : d) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		//String Array:
		String product[] = {"laptop", "SmartPhone", "iPad"};
		for (String e : product) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		//Object Array:
		Object data[] = {"Sheema", 37, 25.67, 'f', true};
		for (Object e : data) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		//Print values with INDEX 0-10
		int num[] = {10,20,30,40,10,1};
		
		int count = 0;
		for (int e : num) {
			System.out.println(count+"-"+e);
			System.out.println(num[count]);
			count++;
		}
		System.out.println("---------------");
		
		//Print values in reverse order
		int num1[] = {10,20,30,40,10,1};
		
		int count1 = num1.length-1;
		for (int e : num1) {
		//	System.out.println(count1+"-"+e);
			System.out.println(num[count1]);
			count1--;
		}
		System.out.println("---------------");
		
		//using e=count2
		int num2[] = {10,20,30,40,10,1};
		
		int count2 = num2.length-1;
		for (int e : num2) {
			e=count2;
			System.out.println(count2+"-"+num[e]);
		//	System.out.println(num[e]);
			count2--;
		}
		System.out.println("---------------");
		
		//Short
		short sh[] = {100,200,322,344};
		for (short e : sh) {
			System.out.println(e);
		}
		System.out.println("---------------");
		
		//Char - a-z, A-Z, 0-9
		char ch[] = {'a', 'b', 'c', '1', '2', '$', '#', 100 };
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("---------------");
		
		
		//String
		String st[] = {"Sheema", "Farheen", "Umar", "Imran"};
		int count3 = 1;
		for (String e : st) {
			System.out.println(count3+"."+e);
			count3++;
		}
		
		
		
		
	}

}
