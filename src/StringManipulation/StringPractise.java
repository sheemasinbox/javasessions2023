package StringManipulation;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringPractise {
	
	//5. Function
	public static char[] revName(String name) {
		char[] name1 = new char[name.length()];

		int j = 0;
		do {
			for (int i = name.length() - 1; i >= 0; i--) {
				name1[j] = name.charAt(i);
				j++;
			}
		} while (j < name.length());
		System.out.println(name1);
//		System.out.println(Arrays.toString(name1));
		return name1;
	}
	
	
	//8. Search String
	public int searchString(String str1, String sub) {
		if (str1.contains(sub)) {
			return str1.indexOf(sub);
		}
		else {
			return -1;
		}
	}
	

	public static void main(String[] args) {
		
		//1.Check equality of 2 different strings
		String st1 = "This is Java Code.";
		String st2 = "This is Java Code.";
		String st3 = "This is Selenium Code.";
		
		System.out.println(st1.equalsIgnoreCase(st2));    //true
		System.out.println(st2.equalsIgnoreCase(st3));    //false
		System.out.println("--------------------------");
		
		
		
		//2.Remove all spaces in String="      Hello     Everyone    "
		String st4 ="      Hello     Everyone    ";
		System.out.println(st4.replaceAll(" ", ""));
		System.out.println("--------------------------");
		
		
		
		//3.print out the last character and first character of a word.
		String st5 = "World";
		System.out.println(st5.charAt(0));                    //w
		System.out.println(st5.charAt(st5.length()-1));       //d
		System.out.println("--------------------------");
		
		
		
		//4.verify a word or a character contained in the sentence.
		System.out.println(st1.contains("Java"));   //true
		System.out.println(st1.contains("Happy"));  //false
		System.out.println("--------------------------");
		
		
		
		//5.function/ method to reverse your own name.
		String name = "Sheema";
		char[] name1 = revName(name);
		System.out.println(name1);

//		There are four ways to convert char array to string in Java1:
//			Using String class Constructor
//			Using valueOf () Method
//			Using copyValueOf () Method
//			Using StringBuilder Class
//		
		String str = new String(name1);                 //using object of String class
		System.out.println(str);
//		
//		System.out.println(String.valueOf(name1));      //using valueOf() method of String class
//		
//		StringBuilder sb = new StringBuilder();         //using append() method of String Builder class
//		System.out.println(sb.append(name1));
//		System.out.println(sb.toString());              //using toString() method of String Builder class
		System.out.println("--------------------------");
		
		
		//6.program that gives you the last half of the string.
		String st6 = "This is my Home.";
		int l = st6.length()/2;
		System.out.println(st6.substring(l));
		System.out.println("--------------------------");
		
		
		//7.get the 3rd  “ e “ of the string .
		String myName = "Sheema Farheen";
		int a = (myName.indexOf('e')+1)+1;      
		System.out.println(myName.indexOf('e', a));    //11
		System.out.println("--------------------------");
		
		
		//8.Write a method which gives an index of (-1) if string is not available. . it should return integer. 
		//if String is present, then it should return the specific index.
		String str1 = "This is my Happy Place";
		String sub = "Hello";
		
		StringPractise stp = new StringPractise();
		int num = stp.searchString(str1, sub);
		System.out.println(num);
		System.out.println("--------------------------");
		
		
		//9.Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .
		String s1 = "The Universe is Magnificent";
		String []small = s1.split(" ");
		System.out.println(small.length);
		
		for(int i=0; i<=small.length-1; i++) {
			System.out.println(small[i]);
		}
		System.out.println("--------------------------");
		
		
		//10.Assume that a string consists of 3 words, print out the middle one.
		String s2 = "I Love You";
		String small1[] = s2.split(" ");
		System.out.println(small1[1]);     //small1[1] = middle word
		System.out.println("--------------------------");
		
		
		//11. get only numeric part from this String:
		String s = "your transaction id is: 12345 and reference id is 34567";
		String ss = s.replaceAll("\\D+", "");            //replace all non-numeric characters with ""
		System.out.println(ss);
		System.out.println("--------------------------");
		
		
		// Reverse String  --- Another Way
		String originalStr = "Hello";
		String reversedStr = "H";
		
		System.out.println(originalStr.charAt(1)+ reversedStr);

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
