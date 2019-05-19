package com.java.generic;

// class className<type-param-list> implements interfaceName<type-param-list> {
// // ....
// }

public class MinMaxImpl<T extends Comparable<T>>  implements MinMax<T> {

	   T[] vals;

    public MinMaxImpl(T[] vals) {
		this.vals = vals;
	}

	     
	@Override
	public T min() {
		
		T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                 v = vals[i];
            }
        }

         return v;
	}

	@Override
	public T max() {
		  T v = vals[0];

          for (int i = 1; i < vals.length; i++) {
             if (vals[i].compareTo(v) > 0) {
                  v = vals[i];
             }
          }

          return v;
	}

}
