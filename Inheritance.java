package com.day3;
 class Parent 
 {   //Parent class 
	 void show() {
	int salary =4000;
			System.out.println(salary);
	
    }
 }
	  class Child extends Parent {   
	 void display(){
	 int bonous = 1000;
	 System.out.println(bonous);
	 } 
 }
 class Grandchild extends Child{
	 void display1() {
		 System.out.println("Its a grand Child calss");
	 }
 }

