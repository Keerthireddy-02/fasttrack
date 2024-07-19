package com.day2;
import java.util.*;
public class ScannerClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.nextLine();
		System.out.println("enter a number");
		int a=s.nextInt();
		System.out.println("enter a float number");
		float b=s.nextFloat();
		System.out.println("enter a word");
		String word=s.next();
		System.out.println("enter any double interger");
		double d=s.nextDouble();
		System.out.println(name+" "+a+" "+b+" "+word+" "+d);
	}

}
