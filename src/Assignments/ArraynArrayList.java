package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraynArrayList {

	public static void main(String[] args) {
		
		//Arrays
		//1.Delete a specific number from an array
		int p[] = {1,4,5,2,3,22,31,2};	
		int[] p1 = new int[p.length-1];
		
		int j=0;
		for (int i=0; i<=p.length-1; i++) {			
				if (p[i] != 22) {
					p1[j] = p[i];
					j++;
				}				
		}
		System.out.println(Arrays.toString(p1));
		System.out.println("-----------------------------");
		
		//Replace a number 23 with 46 in the array
		int []q = {5, 12, 8, 11, 23, 20};
		int[] q1 = new int[q.length];
		
		int k = 0;
		for (int l=0; l<=q.length-1; l++) {
			if (q[l] != 23) {
				q1[k] = q[l];
			}
			else
				q1[k] = 46;
			k++;
		}
		System.out.println(Arrays.toString(q1));
		System.out.println("-----------------------------");
		
		//Insert a number 99 after 23 in the array
		int []r = {5, 12, 8, 11, 23, 20, 15};
		int[] r1 = new int[r.length+1];
		
		int m = 0;
		for (int n=0; n<=r.length-1; n++) {
			if (r[n] != 23) {
				r1[m] = r[n];
			}
			else if(r[n] == 23){
				r1[m] = 23;   //r1[4]
				m++;
				r1[m] = 99;   //r1[5]
			}
			m++;
		}
		System.out.println(Arrays.toString(r1));
		System.out.println("-----------------------------");
		
		
		//2.Create a static array for cricket data- name, age, DOB, gender, strike rate. 
		// Create multiple Object Arrays for different players.
		
		//Object cricData[] = new Object[5];
		Object cricData1[] = {"Imran", 27, "12/07/1995", 'M', 12.33};
		Object cricData2[] = {"Umar", 25, "22/07/2000", 'M', 18.23};
		Object cricData3[] = new Object[5];
		cricData3[0] = "Harry";
		cricData3[1] = 28;
		cricData3[2] = "15/03/1999"; 
		cricData3[3] = 'M';
		cricData3[4] = 5.89;
		
		Object cricData4[] = new Object[]{"Hey", 25, "22/07/2000", 'M', 18.23};;
		
		System.out.println(Arrays.toString(cricData1));
		System.out.println(Arrays.toString(cricData2));
		System.out.println(Arrays.toString(cricData3));
		System.out.println("-----------------------------");
		
		//ArrayList
		//1.Create a new ArrayList of all color names. Print colors using loops.
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Indigo");
		System.out.println(colors);
		colors.add(1, "Pink");
		System.out.println(colors);
		
		ArrayList<String> subColors = new ArrayList<String>();
		subColors.add("Purple");
		subColors.add("Burgundy");
		subColors.add("Violet");
		System.out.println(subColors);
		
		colors.addAll(1, subColors);
		System.out.println(colors);
		
		//for-each loop
		System.out.println("----------Using for-each loop----------");
		for (String color : colors) {
			System.out.println(color);
		}
		
		//for loop
		System.out.println("----------Using for loop----------");
		for (int i=0; i<=colors.size()-1; i++) {
			System.out.println(colors.get(i));
		}
		
		//while
		System.out.println("----------Using while loop----------");
		int a = 0;
		while (a<colors.size()) {
			System.out.println(colors.get(a));
			a++;
		}
		
		//2.Retrieve an element from a specified index from an ArrayList
		System.out.println("---------Retrieve an element from a specified index from an ArrayList-----------");
		String getColor = colors.get(2);
		System.out.println(getColor);
		System.out.println(colors.get(2));
		
		//3.Update specific array element by a given element
		System.out.println("------------------------Update specific array element by a given element-----------------");
		subColors.set(0, "Ivory");
		System.out.println(subColors);
		System.out.println(colors);
		
		//4.Remove 3rd element from an array list
		System.out.println("-----------------------Remove 3rd element from an array list----------------------");
		ArrayList<Integer> numb = new ArrayList<Integer>();
		numb.add(12);
		numb.add(31);
		numb.add(65);
		numb.add(15);
		numb.add(99);
		System.out.println(numb);
		numb.remove(2);           //removes 65 from 3rd position
		System.out.println(numb);
		
		//5.search an element in an array list using for loop. Once we find that element, break the loop.
		System.out.println("--------------search an element in an array list using for loop. Once we find that element, break the loop.------");
		ArrayList<Object> student1 = new ArrayList<Object>();
		student1.add(1);
		student1.add("Adam");
		student1.add('A');
		student1.add(98.23);
		student1.add("Science");
		student1.add(true);
		
		Object search = "Adam";
		for (int i=0; i<student1.size(); i++) {
			System.out.println(student1.get(i));
		//	if (student1.get(i).equals(98.23))             //DOes not work with == operator
		//   break;     	                               // DOes not break the loop
		//	if (student1.get(i) == (Character)'A')         // Typecasting Works
		//	if (student1.get(i) == (Boolean) true)          // Typecasting Works
		//	if (student1.get(i) == (Integer) 1)             // Typecasting Works
		//	if (student1.get(i) == "Adam")                  //Works	
			if (student1.get(i).equals(search))                //works
					break;
					
		}
		
		//6.Reverse the ArrayList
		System.out.println("-----------------Reverse the ArrayList-----------------");
		ArrayList<Double> decimalNum = new ArrayList<Double>();
		decimalNum.add(12.34);
		decimalNum.add(16.98);
		decimalNum.add(98.54);
		System.out.println(decimalNum);
		
		Collections.reverse(decimalNum);
		System.out.println(decimalNum);
		Collections.shuffle(decimalNum);
		System.out.println(decimalNum);
		
		//7.Extract a portion of an array
		System.out.println("------------------Extract a portion of an array-------------------");
		ArrayList<String> portion = new ArrayList<String>(colors.subList(3, 6));
		System.out.println(portion);
		
		//8. Empty an ArrayList
		System.out.println("---------------- Empty an ArrayList------------");
		ArrayList<String> sample = new ArrayList<String>();
		sample.add("Flat");
		sample.add("Condo");
		sample.add("Bunglow");
		sample.add("Castle");
		System.out.println(sample);
		sample.clear();
//      sample.removeAll(sample);                   //Makes array completely empty without even default values
		System.out.println(sample);
		
		//9.trim the virtual capacity of an array list to the current list size.
		System.out.println("The size is: "+colors.size());
		colors.trimToSize();
		System.out.println(colors.size());
		
		//10.Print all the elements of an ArrayList using the position of the elements.
		System.out.println("----------------Print all the elements of an ArrayList using the position of the elements--------------------");
		ArrayList<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		int z=1;
		for (int i=0; i<months.size(); i++) {
			System.out.println(z+". Element at index "+i+" is: "+months.get(i));
			z++;
		}
		System.out.println(Collections.disjoint(colors, months));  //returns true is both the lists have nothing in common
		System.out.println(Collections.disjoint(portion, colors));  //returns false is they have common 
		
		
		
		
		
		
		
		
	}

}
