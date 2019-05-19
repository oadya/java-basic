package com.java.constructor;

public class Superclass {
	  int num = 100;
	  
	//no-arg constructor
	  Superclass(){	 
		  System.out.println("no-arg Constructor of parent class");
	  }
	  
	   //arg constructor
	  Superclass(String str){
		System.out.println("parameterized constructor of parent class call with param: "+str);
	   }
	  
	   //Overridden method
	   void display(){
		System.out.println("Parent class method\n");
	   }
}
