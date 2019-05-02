package com.java_huit.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class TestFilter {
	
    public static void main(String[] args) {

    	List<String> list = Arrays.asList("spring", "node", "mkyong","java");
    	
    List<String> list2 =	list.stream() // transform list to stream
    	.filter(elt-> !"mkyong".equals(elt)) // all except mkyoung
    	.collect(Collectors.toList()); // collect the output and convert the stream to a List
    
    list2.forEach(p->System.out.println(p));
    
    List<Person> list3 = Arrays.asList( 
    		new Person("mkyong", 26),
    		new Person("jack", 16),
    		new Person("paul", 28) 
    		);
    
    System.out.println("Sort by age");
    list3.sort((o1,o2) -> o1.getAge()-o2.getAge() );
    list3.forEach(System.out::println);   
    
    System.out.println("Sort by name");
    Comparator<Person> comparatorByName = (o1,o2)-> o1.getName().compareTo(o2.getName());
    list3.sort(comparatorByName.reversed());
    list3.forEach(p->System.out.println(p));
    
    System.out.println("looking for paul");
    Person p = list3.stream()
    		.filter(x ->x.getName().equals("paul"))
    		.findAny() // if 'findAny' then return found
    		.orElse(null); // else return null
    
    System.out.println(p); 
    
    String name = list3.stream()
    		.filter(x->x.getName().equals("jack") && x.getAge()==16)
    		.map(Person::getName) // transform to String
    		.findAny()
    		.orElse(null);
    
    System.out.println("name =" +name);
    
    System.out.println("List of name");
    List<String> listPerson = list3.stream()
    		.map(Person::getName)
    		.collect(Collectors.toList());
    
    listPerson.forEach(System.out::println);
    
    }
}
