package com.day2;
import java.util.*;
public class AssignmentOperrator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a= s.nextInt();
		a/=a;
		System.out.println("div value"+a);
		a*=a;
		System.out.println("mul value"+a);
		a%=a;
		System.out.println("mod value"+a);
		a+=a;
		System.out.println("add value"+a);
		a-=a;
		System.out.println("sub value"+a);
	}

}
