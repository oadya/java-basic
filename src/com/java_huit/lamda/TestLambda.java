package com.java_huit.lamda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestLambda {

	private final static Comparator<Developer> comparByAge= new Comparator<Developer>(){

		@Override
		public int compare(Developer o1, Developer o2) {
			return o1.getAge() - o2.getAge();
		}

	};
	
	private final static Comparator<Developer> compareByName = new Comparator<Developer>() {

		@Override
		public int compare(Developer o1, Developer o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	private final static Comparator<Developer> compareBySalary = new Comparator<Developer>() {

		@Override
		public int compare(Developer o1, Developer o2) {
			return o1.getSalary().compareTo(o2.getSalary());
		}
	
	};
	
	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort 1");
		Iterator<Developer> iterate  = listDevs.iterator();
		while(iterate.hasNext()){
			System.out.println(iterate.next());
		}
		
		System.out.println("Before Sort 2");
		
		int count=0;
		while(listDevs.size()>count){
			System.out.println(listDevs.get(count));
			count++;
		}

		System.out.println("After Sort");
		
		
		// sort by age
		Collections.sort(listDevs, comparByAge);
		
		Iterator<Developer> sortedList = listDevs.iterator();
		while (sortedList.hasNext()) {
			System.out.println(sortedList.next());
		}
		
		System.out.println("After Sort wth lambda age");
		//listDevs.sort( (Developer o1, Developer o2) -> o1.getAge()-o2.getAge());
		listDevs.sort( (o1, o2) -> o1.getAge()-o2.getAge());
		Iterator<Developer> sortedList2 = listDevs.iterator();
		while (sortedList2.hasNext()) {
			System.out.println(sortedList2.next());
		}
		
		System.out.println("After Sort wth lambda name");
		listDevs.sort( (o1,o2)->o1.getName().compareTo(o2.getName()));
		listDevs.forEach( d -> System.out.println(d.getAge()) );
		
		System.out.println("reverse sort by salary ");
		Comparator<Developer> comparatorSalary = (o1,o2)-> o1.getSalary().compareTo(o2.getSalary());
		listDevs.sort(comparatorSalary.reversed()); 
		
		listDevs.forEach(d -> System.out.println(d));
		listDevs.forEach(System.out::println);
		
		listDevs.forEach(d -> {
			if(d.getName().equals("mkyong")){
				System.out.println("salary ok kyoung is"+ d.getSalary());
			}
		});
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}
