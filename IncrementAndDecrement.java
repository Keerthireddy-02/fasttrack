package com.day2;
import java.util.*;
public class IncrementAndDecrement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int x=s.nextInt();
		System.out.println("preincrementor value of "+x+" is "+ ++x);
		System.out.println("postincrementor value of "+x+" is "+ x++);
		System.out.println("predecrementor value of "+x+" is "+ --x);
		System.out.println("postincrementor value of "+x+" is "+ x--);
	}

}
