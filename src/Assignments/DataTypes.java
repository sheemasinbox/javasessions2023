package Assignments;

public class DataTypes {

	public static void main(String[] args) {
		
		//1.Add 2 Strings
		String a = "Hello";
		String b = "Sheema";
		String c = a+" "+b;
		System.out.println(c);
		System.out.println(a+" "+b);
		
		//2.Print Sum of 2 Numbers
		int s = 74, t = 36;
		int u = s+t;
		System.out.println("Sum of 2 Numbers is: "+u);
		
		//3.Division of 2 Numbers
		int k = 50/3;
		float kf = 50/3f;
		System.out.println(k);
		System.out.println(kf);
		
		//4.Compute Specified expression
		float d = (float) (25.5 * 3.5 - 3.5 * 3.5);
		float df = (float) (40.5 - 4.5);
		float df1 = d/df;
		System.out.println(df1);
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		//5.Concat "Hello Selenium" with a character t
		String s1 = "Hello Selenium";
		char ch = 't';
		System.out.println(s1 + ch);
		
		//6.Add 3 int values and concatenate with an output String
		int i1 = 100, i2 = 200, i3 = 3400;
		System.out.println("Your Total amount is: "+(i1+i2+i3));
		
		//7.Print ASCII value of character 'h' - 104
		int a1 = (char)'h';
		System.out.println(a1);
		System.out.println((int)'h');
		System.out.println((byte)'h');
		
		//8.add 3 to the ASCII value of the character 'd' and print the equivalent character
		int b1 = (char)'d';
		int b2 = b1+3;
		System.out.println(b2);  //103
		System.out.println((char)b2);  //g
		
		//9.Find square of the number 3.9
		float x = 3.9f;
		System.out.println("Square of Number "+x+" is: "+(x*x));
		
		

	}

}
