package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAssignment {

	public static void main(String[] args) {
		
		//1.Search for an element in ArrayList and break the loop
		ArrayList<Object> myList = new ArrayList<Object>(Arrays.asList("Farheen",25,'F',2009,"22Jan"));
		
		for (Object myList1 : myList) {
			if(myList1.equals("22Jan")) {
				break;
			}
			else
				System.out.println(myList1);
		}
		System.out.println("-----------------------------------------------------");
		
		//2.sort a numeric array and a string array.
		//Numeric Array
		int[] a = {5,2,9,3,8,1,7};
		
		int temp = 0;
		for (int i=0; i<=a.length-1; i++) {
			for (int j=i+1 ; j<=a.length-1; j++) {
				if (a[i] < a[j]) {
					continue;
					}
				else
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}		
		}
		
		System.out.println("Sorted Array of integers is: "+Arrays.toString(a));
		
		//Using Arrays.sort();
		int[] aa = {198, 451, 1008, 12, 87987, 323341};
		Arrays.sort(aa);
		System.out.println("Sorted Array using Arrays.sort is: "+Arrays.toString(aa));
		
		//String Array
		String[] ar = {"Java", "Python", "C#", "Cypress", "Selenium"};
		Arrays.sort(ar);
		System.out.println("Sorted Array is: "+Arrays.toString(ar));
		List al = Arrays.asList(ar);             //Convert Array to ArrayList
		Collections.reverse(al);
		System.out.println("Reverse ArrayList: " +al);
		System.out.println("----------------------------------------------------------");
		
		
		//3.Swap numbers without using temp
		int c =10;
		int d = 8;
		
		c = c+d;    //18
		d = c-d;    //10
		c = c-d;    //8
		
		System.out.println("c= "+c+", d= "+d);
		System.out.println("----------------------------------------------------------");
		
		//4.Sum up values of an array
		int []values = new int[5];
		values[0] = 5;
		values[1] = 3;
		values[2] = 8;
		values[3] = 6;
		values[4] = 2;
		
		System.out.println(Arrays.toString(values));
		
		int sum = 0;
		for (int i=0; i<=values.length-1; i++) {
			sum = sum + values[i];
		}
		System.out.println("The Sum of the values of Arrays is: "+sum);
		System.out.println("----------------------------------------------------------");
		
		//5.Print a grid of '-' of 10X10
		int rows = 10;
		int cols = 10;
		int count = 0;
		
		do{
		for (int i=1; i<=rows; i++) {
			System.out.print("-");
			}
		System.out.println();
			count++;
		}
		while(count<cols);
		
		
		
		//6.program to insert an element into the array list at the first position.
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("Happy","Sad","Angry"));
		al1.add(0, "Confused");
		System.out.println(al1);
		
		//7. program to retrieve an element (at a specified index) from a given array list.
		System.out.println(al1.get(1));
		
		//8.program to update an array element by the given element.
		al1.set(3, "Calm");
		System.out.println(al1);
		
		
		//9.program to remove the third element from an array list.
		al1.remove(2);
		System.out.println(al1);

		//10.program to search for an element in an array list.
		for (int i=0; i<=al1.size()-1; i++) {
			if(al1.get(i).equalsIgnoreCase("happy")) {
				System.out.println();
			}
		}
		
		
		
	}
	
	
	
	
	
}
		
		
		
		
		

		
		
		
		
		
		
		

	


