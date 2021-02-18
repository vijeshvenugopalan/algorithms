package com.vijesh.algorithms.sort;

public class SelectionSort implements Sort {

    public void sort(Comparable[] a) {
        
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i+1; j < a.length; j++) {
                if (less( a[j],a[index])) {
                    index = j;
                }
            }
            Sort.exch(index,i,a);
        }
    }

}
