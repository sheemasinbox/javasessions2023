package StringManipulation;

import java.util.Arrays;

public class StringConcept {
	
	//Strings are immutable (cannot be changed/updated). 
	//If String is updated, a new String is created.
	//integers and other primitive data types are mutable.

	public static void main(String[] args) {
		
		String str = "This is my java code and I am so happy i am an expert";
		System.out.println(str.length());
		
		//li = 0
		//hi = 37
		//len = hi+1
		//hi = len-1
		
		System.out.println(str.charAt(0));  //T 
		System.out.println(str.charAt(37)); //y
//		System.out.println(str.charAt(38));  //StringIndexOutOfBoundsException (SIOB) - RuntimeException
//		System.out.println(str.charAt(-1));  //SIOB
		
		System.out.println(str.indexOf("T")); //0
		System.out.println(str.indexOf("i")); //2 - 1st occurance of i
		System.out.println(str.indexOf("i", str.indexOf("i")+1));  //5 - 2nd occurance of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)); //3rd occurance of i
		
		int value = str.indexOf("i", (str.indexOf("i")+1)+1);
		System.out.println(str.indexOf("i", value+1));   //4th occurance
		
		String msg = "this is my java code";
		System.out.println(msg.indexOf("java"));        //11
		System.out.println(msg.indexOf("Java"));        //-1 - case sensitive
		System.out.println(msg.indexOf("python"));      //-1
		
		String m = "Welcome admin";
		if (m.indexOf("admin") == 8) {
			System.out.println("Correct msg");
		}
		else {
			System.out.println("Incorrect msg");
		}
		
		if(m.indexOf("admin") == -1) {
			System.out.println("incorrect msg - Fail");
		}
		else {
			System.out.println("Pass");
		}
		
		//
		String test = "    hello world    ";
		System.out.println(test.trim());
		
		String dob = "01-01-1990";  //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String top = "    hello   world    ";   //helloworld
		System.out.println(top.replace(" ", ""));
		System.out.println(top.replaceAll(" ", ""));   //better performance as it will collect all occurrences and replace at once
		
		String mg = "Java Python Ruby";
		System.out.println(mg.replace(" ", ","));   //Java,Python,Ruby
		
		System.out.println(mg.replace("Java", "JS"));   //JS Python Ruby
		
		//split:
		String pop = "javascript;java;python;ruby";
		String p[] = pop.split(";");  //split return String array
		System.out.println(Arrays.toString(p));
		System.out.println(p[0]);       //javascript
		System.out.println(p.length);   //4
		
		
		//INTERVIEW QUESTION
		String rest = "xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";
		
		String []rs = rest.split("xX");
		System.out.println(rs[0]);   //blank
		System.out.println(rs[0].length());   //0
		System.out.println(rs[1]);   //HelloSeleniumx
		
		String empData = "pallavi;sharma;30;pune;India;908767687587";
		String empData1 = empData.replace(";", "||");
		System.out.println(empData1);
		
		//Use Escape character \\ incase it does not give the desired result, as few characters like | have other significance
		String[] ed = empData1.split("\\|\\|");  
		System.out.println(ed[0]);   //pallavi
		
		//Regular Expressions
		String str1 = "This is my Happy Place#2306, I like it here@1406.";
		System.out.println(str1.replaceAll(" ", ""));
		System.out.println(str1.replaceAll("\\s+", ""));   //captures all the whitespace characters
		System.out.println(str1.replaceAll("\\S+", "1"));   //captures all the non-whitespace characters
		System.out.println(str1.replaceAll("\\d+", ""));   //captures all the digits
		System.out.println(str1.replaceAll("\\D+", ""));   //captures all the non-digits
		System.out.println(str1.replaceAll("\\w+", ""));   //captures all the Word character, [a-zA-Z_0-9]
		System.out.println(str1.replaceAll("\\W+", ""));   //captures all the Non-word character,[spaces & special chars]
		System.out.println(str1.replaceAll("\\b+", " "));   //captures all the word boundary (space before and after each word)
		System.out.println(str1.replaceAll("\\B+", " "));   //captures all the non-word boundary(space before and after each char)
		
		
		
		
		
		
		
		
		//
		String tr = "Hello!! this is my value .$1233333*";
		String finalValue = tr.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(finalValue);
	
	
	}

}
