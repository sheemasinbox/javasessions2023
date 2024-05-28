package Assignments;

import java.util.Arrays;

public class MethodsAssignment {

	//1.print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method
	public int calculate(String math, int a, int b) {
		
		int result = -1;
		switch (math.trim().toLowerCase()) {
		case "addition":
			result = a+b;
			break;
		case "subtraction":
			result = a-b;
			break;
		case "division":
			result = a/b;
			break;
		case "multiplication":
			result = a*b;
			break;
		default:
			System.out.println("Enter proper method");
			break;
		}
		return result;
	}
	
	//2.returns the product of two double numbers entered by user.
	public double product(double a, double b) {
		double p = a*b;
		return p;
	}
	
	//3.print the circumference and area of a circle of radius entered by user by defining your own method. 
	public float[] circle(int radius) {
		System.out.println("The radius entered is: "+radius);
		float area = 3.14f * radius * radius;
		float circumference = 2 * 3.14f * radius;
		float []circleResult = {area, circumference};
		return circleResult;
	}
	
	//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	public void max(int a, int b, int c) {
		if (a>b) {
			if (a>c) {
				System.out.println(a+" is the max number");
			}
			else
				System.out.println(c+" is the max number");
		}
		else if (b>c) {
			System.out.println(b+" is the max number");
		}
		else
			System.out.println(c+" is the max number");
	}
	
	public void min(int a, int b, int c) {
		if (a<b) {
			if (a<c) {
				System.out.println(a+" is the min number");
			}
			else
				System.out.println(c+" is the min number");
		}
		else if (b<c) {
			System.out.println(b+" is the min number");
		}
		else
			System.out.println(c+" is the min number");
	}
	
	//5.find out whether a given number is even or odd - return true/false.
	public boolean evenOdd(int a) {
		System.out.println("The number entered is: "+a);
		if (a%2 == 0)
			return true;
		else 
			return false;
	}
	
	//6. A person is eligible to vote if his/her age is greater than or equal to 18.
    //Define a method to find out if he/she is eligible to﻿ vote. - return true/false
	public boolean voteEligibility(int age) {
		System.out.println("The age of the person is: "+age);
		if(age>=18)
			return true;
		else	
			return false;
	}
	
	//7.Ask the user to enter his/her marks (out of 100),display grades according to the marks.
	public String grades(int marks) {
		System.out.println("The student marks entered are: "+marks);
		
		if (marks>=91 && marks<=100) {
			return "AA";
		}
		else if (marks>=81 && marks<=90) {
			return "AB";
		}
		else if (marks>=71 && marks<=80) {
			return "BB";
		}
		else if (marks>=61 && marks<=70) {
			return "BC";
		}
		else if (marks>=51 && marks<=60) {
			return "CD";
		}
		else if (marks>=41 && marks<=50) {
			return "DD";
		}
		else if (marks>=0 && marks<=40) {
			return "Fail";
		}
		System.out.println("Please enter valid marks.");
		return null;
	}
	
	//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
	//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
	//4! = 1*2*3*4 = 24
	//3! = 3*2*1 = 6
	//2! = 2*1 = 2 
	//Also,
	//1! = 1
	//0! = 1
	public int factorial(int num) {
		System.out.println("The Factorial of "+num+" is: ");
		
		if (num > 0) {
			int fact=1;
		for (int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
		}
		else if (num ==0 ) {
			return 1;
		}
		else
			return -1;
	}
	
	
	public static void main(String[] args) {
		
		MethodsAssignment ma = new MethodsAssignment();
		
		System.out.println("1.---------------Arithematic of 2 numbers--------------");
		int result = ma.calculate("multiplication", 5, 10);
		System.out.println(result);
		
		//
		System.out.println("2.--------------Product of 2 numbers-------------------");
		double pro = ma.product(12.368, 15.989);
		System.out.println(pro);
		
		//
		System.out.println("3.--------------Area and Circumference of a circle------------");
		float[] res = ma.circle(3);
		System.out.println("The area and circumference of a circle are: "+Arrays.toString(res));
		
		//
		System.out.println("4.-------------Max and Min numbers among 3 numbers--------------");
		ma.max(2, 5, 3);
		ma.min(6, 1, 4);
		
		//
		System.out.println("5.-------------Even or Odd------------");
		boolean flag = ma.evenOdd(5);
		if (flag == true)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		//
		System.out.println("6.------------Vote Eligibility-------------");
		boolean flag1 = ma.voteEligibility(2);
		if (flag1)
		System.out.println("Eligible to vote.");
		else
			System.out.println("Underage! Not eligible to vote.");
		
		//
		System.out.println("------------Display grades according to marks--------------");
		String grade = ma.grades(103);
		System.out.println("Grade - "+grade);
		
		//
		System.out.println("-----------Factorial of a number---------------");
		int fact = ma.factorial(1);
		if (fact == -1) {
			System.out.println("Enter valid positive number");
		}
		else
		System.out.println(fact);
	}

}
