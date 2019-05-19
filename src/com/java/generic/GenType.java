package com.java.generic;

// Java Generic Class Syntax
// class name<T1, T2, ..., Tn> { /* ... */ }

public class GenType<T> {

	 private T var1;

	public T getVar1() {
		return var1;
	}

	public void setVar1(T var1) {
		this.var1 = var1;
	}
	 
}
