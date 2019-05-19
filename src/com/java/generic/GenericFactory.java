package com.java.generic;

// Java Generic Class Syntax
//  class name<T1, T2, ..., Tn> { /* ... */ }
public class GenericFactory<T> {

	  Class theClass = null;

	    public GenericFactory(Class theClass) {
	         this.theClass = theClass;
	    }

	    public T createInstance() throws IllegalAccessException, InstantiationException {
	        return (T) this.theClass.newInstance();
	    }
	    
}
