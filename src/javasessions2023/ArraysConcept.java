package javasessions2023;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//Array - non-primitive data type
		// can store similar kind of data types
		
		//Two major limitations of Arrays:
		//1.Size is fixed - Static Array
		//2.It can store only similar type of data, you can use Object Array to solve this issue.
		
		//1. Using new keyword
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i.length);
		System.out.println(i[1]);
//		System.out.println(i[4]);  //ArrayIndexOutOfBoundsException - AIOB
//		System.out.println(i[-1]); //AIOB
		System.out.println(i);     //address of the array -- random string
		System.out.println(Arrays.toString(i));
		
		//Print the values from the array using for loop
		for (int k=0; k<=3; k++) {
			System.out.println(i[k]);
			if (i[k] == 20) {
				System.out.println("Hi");
				break;
			}
			System.out.println("Bye");
		}
		
		//Default value of Integer family(byte, short, int, float, double, long) is 0.
		//Short Array   --- Default value: 0
		short sh[] = new short[3]; //0 to 2
		System.out.println("Length: "+sh.length);
		System.out.println("Li: "+0);
		System.out.println("Hi: "+(sh.length-1));
		System.out.println(Arrays.toString(sh));
		sh[0] = 10;
		sh[1] = 20;
		System.out.println(Arrays.toString(sh));
		
		for (int p=0; p<=sh.length-1; p++) {
			System.out.println(sh[p]);
		}
		
		//Char Array   --- Default value: space
		char ch[] = new char[4];
		ch[0] = 'a';
		System.out.println(Arrays.toString(ch));
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 100; //will print the value related to this ASCII
		System.out.println(Arrays.toString(ch));
		
		//float array   --- Default value: 0.0
		float f[] = new float[2];
		f[0] = 12.33f;
		System.out.println(Arrays.toString(f));
		f[1] = 25;
		System.out.println(Arrays.toString(f));
		
		//OBJECT ARRAY  -- Default value: null
		//Emp Data: name(String), age(int), salary(double), gender(char), isPermanent(boolean)
		//Object array- It can store any type of data
		
		Object empData[] = new Object[5];
		empData[0] = "Shilpa";
		empData[1] = 25;
		empData[2] = 25.55;
		empData[3] = 'f';
		empData[4] = true;
		System.out.println(Arrays.toString(empData));
		System.out.println(empData.length);
		
		Object empData1[] = new Object[5];
		empData1[0] = "Sheema";
		empData1[1] = 37;
		empData1[2] = 25.55;
		empData1[3] = 'f';
		empData1[4] = true;
		System.out.println(Arrays.toString(empData1));
		System.out.println(empData1.length);
		
		//String Array  --- Default value: null
		String product[] = new String[4];
		product[0] = "MacBook air";
		product[1] = "MacBook pro";
		product[2] = "iPad";
	//	product
		System.out.println(Arrays.toString(product));
		
		for (int x=0; x<=product.length-1; x++) {
			System.out.println(product[x]);
			if (product[x] == "MacBook air") {
				System.out.println("Out of Stock");
				break;
			}
		}
		
		for (int y=product.length-1; y>=0; y--) {
			System.out.println(product[y]);
		}
		
		//Static Array examples:
		//1.BookMyShow.com -- fixed seats
		//2.Flight Booking -- fixed seats
		//3.Month array -- 0 to 11 - 12
		
		//Dynamic Array examples:
		//1.Booking Uber - 100 - 200... cabs
		//2.ecomm -- User Reg. -- new customers
		//3.emp dropdown -- dynamic
		
		
		
		
		

	}

}
