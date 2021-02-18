package com.vijesh.algorithms.sort;

public interface Sort {

    void sort(Comparable[] a);

    static void exch(int i, int j, Comparable[] a) {
        if (i == j) {
            return;
        }
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    default boolean less(Comparable a, Comparable b) {
        return (a.compareTo(b) < 0);
    }
}
