package com.basics;

public class Operatotrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic operators
		int num1=150,num2=20;
		
		System.out.println("Sum of num1 & num2 is " +(num1+num2));
		System.out.println("Sum of num1 & num2 is " +(num1-num2));
		
		
		//Relational operators 
		boolean res=(num1 >num2);
		System.out.println("num1 >num2 is " +res);
		System.out.println("num1 <num2 is " +(num1 <num2));
		System.out.println("num1 ==num2 is " +(num1 ==num2));
		System.out.println("num1 !=num2 is " +(num1 !=num2));
		
		//Logical Operators
		//logical operator- joining the multiple condition
		int num3=550;
		//boolean result= ((num1 >num2)||(num1 >num3));
		boolean result= ((num1 >num2)&&(num1 >num3));
		//boolean result= ((num1 >num2)||(num1 >num3));
		System.out.println("Result is "+result);
	}

}
