package Assignments;

public class LoopsAssignment {

	public static void main(String[] args) {
		
		//1.Print "I am Batman" 5 times
		for (int i=1; i<=5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("--------------------------");
		
		//2.Print "I am Batman" 9 times with numbers
		for (int i=1; i<=9; i++) {
			System.out.println("I am Batman "+i);
		}
		System.out.println("--------------------------");
		
		//3.print 10 to 1 using for, while and do-while loop
		System.out.println("10 to 1 using for loop");
		for (int j=10; j>=1; j--) {
			System.out.println(j);
		}
		
		System.out.println("10 to 1 using while loop");
		int k = 10;
		while (k>=1) {
			System.out.println(k);
			k--;
		}
		
		System.out.println("10 to 1 using do while loop");
		int l = 10;
		do {
			System.out.println(l);
			l--;
		}
		while (l>=1);
		System.out.println("--------------------------");
		
		//4.print "Hello World" ten times using while loop
		int m = 1;
		while (m<=10) {
			System.out.println(m+".Hello World");
			m++;
		}
		System.out.println("----------------------------");

		//5.print all the multiples of 5 from 1 to 100 using while /for/do-while loop
		System.out.println("Multiples of 5 using for loop");
		for (int n=1; n<=100; n++ ) {
			if (n%5 == 0) {
				System.out.println(n);
			}
		}
		
		int o=1;
		System.out.println("Multiples of 5 using while loop");
		while (o<=100) {
			if (o%5 == 0) {
				System.out.println(o);
			}
			o++;
		}
		
		int p=1;
		System.out.println("Multiples of 5 using do while loop");
		do {
			if (p%5 == 0) {
				System.out.println(p);
			}
			p++;
		}
		while (p<=100);
		System.out.println("--------------------------");
		
		//6. Print all Odd and Even numbers between 1 to 100
		System.out.println("Even Numbers");
		for (int q=0; q<=100; q++) {
			if (q%2 == 0) {
				System.out.println(q);
			}
		}
		
		System.out.println("Odd Numbers");
		for (int q=0; q<=100; q++) {
			if (q%2 != 0) {
				System.out.println(q);
			}
		}
		System.out.println("--------------------------");
		
		//7.Check output -- Infinite loop as condition will always satisfy. so, break; of increment.
		int r=1;
		while (r<=1) {
			System.out.println("Hi Java");
			break;
			//r++;
		}
		System.out.println("----------------------");
		
		//8.Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		System.out.println(" A-Z , a-z, 0-9 with  the respective ASCII using for loop");
		for (char s='A'; s<='Z'; s++) {
			System.out.println(s+"-"+(byte)s);
		}
		
		for (char s1='a'; s1<='z'; s1++) {
			System.out.println(s1+"-"+(byte)s1);
		} 
		
		for (char s2='0'; s2<='9'; s2++) {
			System.out.println(s2+"-"+(byte)s2);
		}
		
		System.out.println(" A-Z , a-z, 0-9 with  the respective ASCII using while loop");
		char t ='A';
		while (t<='Z') {
			System.out.println(t+"-"+(byte)t);
			t++;
		}
		
		char t1 ='a';
		while (t1<='z') {
			System.out.println(t1+"-"+(byte)t1);
			t1++;
		}
		
		char t2 ='0';
		while (t2<='9') {
			System.out.println(t2+"-"+(byte)t2);
			t2++;
		}
		System.out.println("--------------------------");
		
		//9. Print the series - 1.0 2.0 3.0  ...... 10.0 and 0 9 18 27 36 …99
		System.out.println("Print Series:");
		for (float u=1.0f; u<=10.0; u++ ) {
			System.out.print(u+" ");
		}
		System.out.println();
		
		for (int v=0; v<=100; v++) {
			if (v%9 == 0) {
				System.out.print(v+" ");
			}
		}
		System.out.println("------------------------------");
		
		//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		System.out.println("Vowels using for loop");
		for (char ch='a'; ch<='z'; ch++) {
			if (ch == 'a')
				System.out.println(ch);
			else if (ch == 'e')
				System.out.println(ch);
			else if (ch == 'i')
				System.out.println(ch);
			else if (ch == 'o')
				System.out.println(ch);
			else if (ch == 'u')
				System.out.println(ch);
		}
		
		System.out.println("Vowels using While loop");
		char ch1 = 'a';
		while (ch1<='z') {
			if (ch1 == 'a')
				System.out.println(ch1);
			else if (ch1 == 'e')
				System.out.println(ch1);
			else if (ch1 == 'i')
				System.out.println(ch1);
			else if (ch1 == 'o')
				System.out.println(ch1);
			else if (ch1 == 'u')
				System.out.println(ch1);
			ch1++;
		}
		System.out.println("--------------------------------");
		
		//11.Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		System.out.println("Break the loop on multiple of 7");
		int w = 1;
		while (w<=10) {
			System.out.println(w);
			if (w%7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
			w++;
		}
		
		
	}
}
