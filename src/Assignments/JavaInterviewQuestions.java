package Assignments;

public class JavaInterviewQuestions {

	public static void main(String[] args) {
		
		//1.Print from 1 to 100 without using any numbers in your code
		
		//Method1
		int one = 'A'/'A';    //1
//		String s1 = "..........";     //10 dots
//		
//		for (int i= one; i<= (s1.length())*(s1.length()); i++) {
//			System.out.println(i);
//		}
		
		//Method2
		
//		for(int i= one; i <='d'; i++) {
//			System.out.println(i);
//		}
		
		
		
		//2. Run length encoding - give count of the repeated chars in a string. (used in file compression -- zip file)
		String s = "aaabbbbeeegggggkkk";
		int count = 1;
		
		for (int i=0; i<=s.length()-1; i++) {
			if(i<s.length()-1 && (s.charAt(i) == s.charAt(i+1))) {   //1- 2
				count++;                         //3
			}
			else {
				System.out.println("Number of "+s.charAt(i)+" = "+count);
				count = 1;
			}
			
		}
		
		
		//3.

	}

}
