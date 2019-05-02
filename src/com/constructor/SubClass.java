package com.constructor;

public class SubClass extends Superclass {

    int num = 110;
    
    SubClass(){
    	//When we explicitly placed super in the constructor, the java compiler didn’t call the default no-arg constructor of parent class.
    	//must be the first statement
    	super("Hahaha");
    	/* Compile implicitly adds super() here as the
    	 *  first statement of this constructor.
    	 */
    	System.out.println("Constructor of child class");
       }
    
    
    SubClass(int num){
    	/*
    	 * The compiler still adds the no-arg super() here
    	 */
    	System.out.println("arg constructor of child class");
       }

  //Overriding method
    void display(){
    	System.out.println("Child class method!");
       }
    
    void printMsg(){
    	//This would call Overriding method
    	display();
    	//This would call Overridden method
    	super.display();
       }
    
    void printNumber(){
    	
	System.out.println(num);
	
	//Accessing the num variable of parent class
	System.out.println(super.num);
    }
    
	public static void main(String[] args) {
		SubClass obj= new SubClass();
		obj.printMsg(); 
		
//		obj.printNumber();		
//		obj.display();
//		
		SubClass obj2= new SubClass(10);
		obj2.display();
		
		

	}

}
