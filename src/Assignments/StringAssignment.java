package Assignments;

public class StringAssignment {
	
	public static void main(String[] args) {
		
		//1.Replace the 1st char of each word with caps
		String str = "this is a new task. please get it done.";
		
		String newstr[] = str.split(" ");
		String mystr = null;
		String mystr1 = null;
		char a = ' ';
			
		for (int i=0; i<newstr.length; i++) {
			
//			 System.out.println(newstr[i]);
			 a = newstr[i].toUpperCase().charAt(0);
			 mystr = newstr[i].substring(1);
			 mystr1 = String.valueOf(a)+mystr;
			 System.out.print(mystr1+" ");
			 	 
		}
		System.out.println();
		System.out.println("----------------------------------------------");

		
		//2.Find every occurrence of i in the string using While loop
		String str1 = "This is my java code and I am so happy i am an expert";
		System.out.println(str1.indexOf('i'));          //1st occurrence of i => 2
//		int b = str1.indexOf('i');
		System.out.println(str1.indexOf('i', str1.indexOf('i')+1));     //2nd occurrence of i => 5
		
		System.out.println(str1.indexOf('i', (str1.indexOf('i')+1)+1));
		System.out.println("----------------------------------------------");
		
		
		//3. Remove special symbols from a STring
		String price1 = "$7,098.23";
		String price2 = "₹5,100.44";      //WINDOWS+. for curreny symbols
		String price3 = "£34,987.98";
		String text = "HomeSweet!#$!%#^%$&*^()Home";
		
		System.out.println(price1.replaceAll("[$,]", ""));
		System.out.println(price2.replaceAll("[₹,]", ""));
		System.out.println(price3.replaceAll("[£,]", ""));
		System.out.println(text.replaceAll("[^0-9,a-z,A-Z]", ""));   //Remove all chars except alpha-numeric from text
		
		
		
	}

}
