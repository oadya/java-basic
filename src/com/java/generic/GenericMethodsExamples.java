package com.java.generic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericMethodsExamples {

//	The Syntax for Defining Generic Method
//	<type-Parameters> return_type method_name(parameter list)
//	{
//	  // ..
//	}
	 public static <T> List<T> fromArrayToList(T[] a) {
         return Arrays.stream(a).collect(Collectors.toList());
    }
	 
	 
	 // definition of a generic method
	    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
	         return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
	    }
	    
	    //Generics in method
	    public static <T> boolean isEqual(GenType<T> g1, GenType<T> g2){
	         return g1.getVar1().equals(g2.getVar1());
	    }
	    
	    public static <T extends Comparable<T>> int compare(T t1, T t2){
	         return t1.compareTo(t2);
	    }
	 
	public static void main(String[] args) {
		
		// testing the generic method with Integer
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        List<Integer> list = fromArrayToList(intArray);
        list.forEach(e -> System.out.println(e));
        
        
        // testing the generic method with String
        String[] stringArray = { "hello1", "hello2", "hello3", "hello4", "hello5" };
        List<String> strList = fromArrayToList(stringArray);
        strList.forEach(e  -> System.out.println(e));
        
     // testing the generic method with Integer and String type
        Integer[] intArr = { 1, 2, 3, 4, 5 };
        List<String> stringList = fromArrayToList(intArr, Object::toString);
        stringList.forEach(e -> System.out.println(e));
        
        GenType<String> g1 = new GenType<>();
        g1.setVar1("demo");
        
        GenType<String> g2 = new GenType<>();
        g2.setVar1("demo");
        
        boolean isEqual = GenericMethodsExamples.<String>isEqual(g1, g2); 
      // or :
      //  isEqual = GenericMethodsExamples.isEqual(g1, g2);
        System.out.println(isEqual);
        
        
        System.out.println(GenericMethodsExamples.compare("abc","abc"));
        

	}

}
