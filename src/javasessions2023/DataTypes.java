package javasessions2023;

public class DataTypes {

	public static void main(String[] args) {
		
		//java: Strict data type concept
		//data types:
		//1.primitive data types: 
			//No need to create objects and class
		
		//2.non-primitve data types: String, Class, Interfaces, Arrays, Object
		
		//primitive data types:
		//boolean type: true/false
		//Numeric Type:
			//Integral Value:
				//1.Integer: byte, short, int, long
				//2.floating-point: float, double
			//character-type: char
		
		//1.byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 --> -2^7 to 2^7-1
		byte b = 10;
		b = 20;
		b = 30;
		byte b1 = 40;
		byte b2 = -30;
		byte b3 = -128;
		byte b4 = 0;
		byte age = 30;
		//age, months, week
		
		System.out.println(age);
		
		//2.short:
		//size: 2 bytes = 2*8 = 16 bits
		//range: -32768 to 32767 --> -2^15 to 2^15-1
		short s1 = 1000;
		short s2 = 1;
		System.out.println(s1+s2);
		
		//3.int:
		//size: 4 bytes = 4*8 = 32 bits
		//range: -2147483648 to 2147483647 --> -2^31 to 2^31-1
		int i = 10;
		//bill amount, price, salary
		
		//4.long:
		//size: 8 bytes = 8*8 = 64 bits
		//range: -2^63 to 2^63-1
		long l = 765857646;
		long l1 = 875764536L;
		System.out.println(l1);
		//World population, distance, medical ranges
		
		//Phone, ssn, debit, etc - String is the right data type
		//Use Long, float data types only if any calculations need to be done
		long phone = 658654321L;  
		String phone1 = "658654321";
		
		//5.float:
		//size: 4 bytes = 32 bits
		//range: after . can take upto 7 digits
		float f1 = 10.675f;
		System.out.println(f1);
		
		float f2 = (float) 54.987654;
		System.out.println(f2);
		
		float f3 = 100;
		System.out.println(f3);
		
		//6.double:
		//size: 8 bytes = 64 bits
		//range: after . can take upto 15 digits
		double d1 = 12.32423432;
		System.out.println(d1);
		double buildNumber = 1.1; //not recommended
		System.out.println(buildNumber + 1.1);
		//price, temp, weight, tax
		//190.34.55.66 - do not use double or float. Use String data type
		
		//char: only single digit value
		//range: a-z, A-Z
		//size: 2 bytes = 16 bits
		//ASCII values
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		char c = 'a'; //alphabet
		char c1 = '1'; //0-9
		char c2 = '$'; //special character
		
		char n1 = 'a';
		char n2 = 'b';
		System.out.println(n1);  //a
		System.out.println(n2);  //b
		System.out.println(n1+n2); //97+98=195  (uses ASCII incase of calculation)
		System.out.println(n1+n2-1);  //97+98-1=194
		
		//Unicode --> ASCII values
		System.out.println('1');  //1
		System.out.println(1);    //1
		System.out.println('1'+'2');  //48+49=99
		
		System.out.println(c);   //a
		System.out.println((byte)c);  //97 - ASCII of c
		System.out.println((byte)'$');  //36 - ASCII of $
		
		System.out.println(100+'a');   //100+97=197
		System.out.println('a'+'b');  //97+98=195
		System.out.println('a'+""+'b');  //ab
		System.out.println(n1);  //a
		
		//boolean: true/false
		//size: ~1 bit
		//range: no range
		boolean flag = true;
		boolean pop = false;
		boolean isUserActive = true;
		
		int k;
		k=100;
		System.out.println(k);
		
		String pc="12%";
		float pec = 12.33f;
		
		
		
		
		
		
		
		

	}

}
