package com.day4;

public class Student {
	
		public int roll_no;
	    public String name;
	    Student(int roll_no, String name)
	    {
	        this.roll_no = roll_no;
	        this.name = name;
	    }

		public static void main (String[] args)
	    {
	        // declares an Array of integers.
	        Student[] arr;
	 
	        // allocating memory for 5 objects of type Student.
	        arr = new Student[2];
	 
	        // initialize the first elements of the array
	        arr[0] = new Student(1,"keerthi");
	 
	        // initialize the second elements of the array
	        arr[1] = new Student(2,"elsa");
	        
	        for (int i = 0; i < arr.length; i++)
	            System.out.println("Element at " + i + " : " +
	                        arr[i].roll_no +" "+ arr[i].name);
	    }
	}






