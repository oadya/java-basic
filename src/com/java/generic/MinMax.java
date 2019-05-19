package com.java.generic;

// The Generalized Syntax for a Generic Interface
// interface interfaceName<type-param-list> { // ...
// }
public interface MinMax<T extends Comparable<T>> {
	
    T min();

    T max();

}
