package com.day2;
import java.util.*;
public class AirthmeticOperators {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		System.out.println("the sum of"+a+"and"+b+"is  "+c);
		System.out.println("the subtraction of"+a+"and"+b+"is  "+d);
		System.out.println("the multiplication of"+a+"and"+b+"is  "+e);
		System.out.println("the division of"+a+"and"+b+"is  "+f);
		System.out.println("the modulus of"+a+"and"+b+"is  "+g);
		
	}

}
