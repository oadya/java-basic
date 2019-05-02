package com.constructor;

public class Employee  {
	
	   int empId;  
	   String empName; 
	   String address; 
	   
	 // constructor doesn’t have a return type
	 // this is a no argument constructor , 
	 public Employee  (){
		//this() should always be the first statement in constructor  this() in constructor is used for calling the default
		
		 //this will call the constructor with int param
		 this(1);	 
		 
		 // initialize empName
		 this.empName="Remy";
		 
	 }
	 
	 // Parameterized constructor
	 public Employee ( int empId){

		//call the constructor with (int, String) param
		 this(empId,"Remy");

		 // initialize
		 this.empId = empId; 
	 }
	 
	 // Parameterized constructor
	 public Employee ( int empId, String empName){
	
		//call the constructor with (int, String, String) param
		 this(empId, empName, "14 rue paul Gautier");
		 
		 // initialize
		 this.empId = empId; 
		 this.empName=empName ;
	 }
	 
	 // Parameterized constructor
	 public Employee ( int empId, String empName,  String address){
		 this.empId = empId; 
		 this.empName=empName ;
		 this.address=address;
	 }
	 
	   void display_1(){
	        System.out.println("Id: "+empId);
	   } 
	   
	   void display_2(){
	        System.out.println("Id: "+empId+" -Name: "+empName);
	   } 
	   
	   void display_3(){
	        System.out.println("Id: "+empId+" -Name: "+empName+ " -Address: "+address);
	   } 
	
	
	public static void main(String[] args) {
		
		System.out.println("\nConstructor with one params ");
        Employee emp1 = new Employee(1);
        emp1.display_1();
        
        System.out.println("\nConstructor with two params ");
        Employee emp2 = new Employee(2, "Krys");
        emp2.display_2();
        
        System.out.println("\nConstructor Chaining ");
        //As a rule, constructors with fewer arguments should call those with more
		// The new keyword  creates the object of class Employee and invokes the constructor to initialize this newly created object
		Employee  emp3 = new Employee ();
		emp3.display_1();
		emp3.display_2();
		emp3.display_3();
	}

}
