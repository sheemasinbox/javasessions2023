package javasessions2023;

public class Loops {

	public static void main(String[] args) {
		
		//Loops - 
				//1.While loop - Print 1-10 numbers
				int i=1;
				while(i<=10) {
					System.out.println(i);
					i++;
					//++i;
					//i=i+1;
				}
				System.out.println("-------------------------------------------------");
				
				//Example of Infinite loop
				boolean flag = false; // true value is infinite
				while(flag) {
					System.out.println("Welcome");
				}
				System.out.println("-------------------------------------------------");
				
				//Print "Hi" at multiples of 5
				int p=1;
				while(p<=100) {
					if (p%5 == 0) {
						System.out.println("Hi");
					//	break;   //here break; will make it come out of the entire while loop. So it will print only 1 2 3 4 Hi and break.
					}
					else
					System.out.println(p);
					p++;
				}
				System.out.println("-------------------------------------------------");
				
				//10 - 1 with While loop
				int w = 10;
				while (w>=1) {
					System.out.println(w);
					w--;
				}
				System.out.println("-------------------------------------------------");
				
				
				//2. for loop
				int k=1;
				for (;k<=10;) {
					System.out.println(k);
					k++;
				}
				System.out.println("-------------------------------------------------");
				
				//infinite for loop - interview question
				for(; ;) {
					System.out.println("bye");
					break;     //if no break then infinite loop
				}
				System.out.println("-------------------------------------------------");

				//using byte
				for (byte j=10; j<=50; j++) {
					System.out.println("Print 10 - 50 using byte:");
					System.out.println(j);
				}
				System.out.println("-------------------------------------------------");
				
				//using float
				for (float fl=1.0f; fl<=5.5; fl++) {
					System.out.println("Print 1 - 5 using float:");
					System.out.println(fl);
				//	fl = fl +0.1f;
				}
				System.out.println("-------------------------------------------------");
				
				//using char
				for (char ch='a'; ch<='z'; ch++) {
					System.out.println(ch);
					System.out.println(ch+ " = " +(byte) ch);
				}
				System.out.println("-------------------------------------------------");
				
				//A-Z
				for (char ch1='A'; ch1<='Z'; ch1++) {
					System.out.println(ch1);
				}
				System.out.println("-------------------------------------------------");
				
				//0-9
				for (char ch2='0'; ch2<='9'; ch2++) {
					System.out.println("Printing 0-9 using char: "+ch2);
				}
				System.out.println("-------------------------------------------------");
				
				
				//Print a-z using ASCII values
				for (char cg=97; cg<=122; cg++) {
					System.out.println(cg);                    //a-z as data type is char
					System.out.println(cg+ " = " +(byte) cg);  //ASCII values
				}
				System.out.println("-------------------------------------------------");
				
				//10 - 1
				for (int i1=10; i1>=1;i1--) {
					System.out.println(i1);
				}
				System.out.println("-------------------------------------------------");
				
				//Print ODD nums using for loop -------------------------------------------------------
				for (int o = 1; o<=10; o++) {
					System.out.println(o);
					o++;
				}
				System.out.println("-------------------------------------------------");
				
				//
				for (int o1 = 1; o1<=10; o1+=2) {
					System.out.println(o1);
				}
				System.out.println("-------------------------------------------------");
				
				//
				for (int o2 = 1; o2<=10; ) {
					System.out.println(o2);
					o2 = o2 + 2;
				}
				System.out.println("-------------------------------------------------");
				
				//Print EVEN nums using for loop -------------------------------------------------------
				for (int e = 0; e<=10; e++) {
					System.out.println(e);
					e++;
				}
				System.out.println("-------------------------------------------------");
				
				//
				for (int e1 = 0; e1<=10; e1+=2) {
					System.out.println(e1);
				}
				System.out.println("-------------------------------------------------");
				
				//
				for (int e2 = 0; e2<=10; ) {
					System.out.println(e2);
					e2 = e2 + 2;
				}
				System.out.println("-------------------------------------------------");
				
				// num%2=0
				for (int l=0; l<=100; l++) {
					if (l%2 == 0) {
						System.out.println("Even numbers are: "+l);
					}
				}
				System.out.println("-------------------------------------------------");
				
				
				
				
				//3.do while loop ------------------------------------------
				int d = 1;
				do {
					System.out.println(d);
					d++;     //without this increment it will go into infinite loop
				}
				while (d<=10);

	}

}
