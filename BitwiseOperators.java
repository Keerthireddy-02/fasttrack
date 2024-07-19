package com.day2;
import java.util.*;
public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("entyer second number");
		int b=s.nextInt();
		System.out.println("bitwise and operator(a&b) value is"+ (a&b));
		System.out.println("bitwise or operator(a|b) value is"+ (a|b));
		System.out.println("negation value(~a) value is"+ (~a));
		System.out.println("biwise xor(a^b) value is"+ (a^b));
	}

}
