package com.java.arrayList;

import java.util.*;


public class SortAndInitializationArrayList {

	public static void main(String[] args) {

		// ========================= Initialization using Arrays.asList ===========================//

		System.out.println("\n1- Initialization using Arrays.asList ");

		List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(10, 15, 58, 255, 47));
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(Integer l1 : list){
			System.out.println(l1);
		} 
	
		// ========================= Anonymous inner class method to initialize ArrayList ===========================//

		System.out.println("\n2 - Anonymous inner class method to initialize ArrayList ");
		
		ArrayList<String> cyties = new ArrayList<String>(){{
			add("jean");
			add("lea");
			add("laura");
				
		}};
		
		Collections.sort(cyties);
		
		for(int index=0 ; index < cyties.size(); index ++) {
			System.out.println(cyties.get(index));
		}
	
		
		// ========================= Normal way of ArrayList initialization ===========================//

		System.out.println("\n 3 - Normal way of ArrayList initialization ");
		
		List <String> books  = new ArrayList<>();
		books.add("Java");
		books.add("Spring");
		books.add("Hibernate");
		
		Collections.sort(books);
		
	    /* While Loop for iterating ArrayList*/
		int count =0;
		while(books.size()>count){
			System.out.println(books.get(count));
			count++;
		}
		
		/*Looping Array List using Iterator*/
		System.out.println("/*** using Collections.reverseOrder()***/");
		Collections.sort(books, Collections.reverseOrder());
		
		Iterator<String> itr = books.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		// ========================= iterate arraylist elements using Enumeration interface ===========================//

		System.out.println("\n 4 - iterate arraylist elements using Enumeration interface ");
		
		ArrayList<Integer> inList = new ArrayList<>(Collections.nCopies(5, 2));
		
		Enumeration<Integer> en = Collections.enumeration(inList);
		
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		
		// ========================= Sorting ArrayList<Object> multiple properties with Comparator ===========================//

		System.out.println("\n 5 - Sorting ArrayList<Object> multiple properties with Comparator ");
		
		   ArrayList<Student> arraylist = new ArrayList<Student>();

		   arraylist.add(new Student(101, "pierre", 26));
		   arraylist.add(new Student(505, "paul", 24));
		   arraylist.add(new Student(809, "jack", 32));
		   
		   System.out.println("Sorting by Name");
		   Collections.sort(arraylist, Student.compareByName);
		   
			for(Student std : arraylist){
				System.out.println(std);
			} 
			
		   System.out.println("Sorting by Age");
		   Collections.sort(arraylist, Student.compareByAge);
			  
				for(Student std : arraylist){
					System.out.println(std);
				} 
		   
	}
   
	
}
