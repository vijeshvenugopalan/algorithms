package com.vijesh.algorithms.sort;

public class InsertionSort implements Sort{

    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j],a[j-1])) {
                    Sort.exch(j, j-1, a);
                } else {
                    break;
                }
            }
        }
    }

}
