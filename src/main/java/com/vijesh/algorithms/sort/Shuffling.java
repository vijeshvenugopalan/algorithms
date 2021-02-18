package com.vijesh.algorithms.sort;

public class Shuffling {
    public void shuffle(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int random = (int) (Math.random() * (i+1));
            Sort.exch(i, random, a);
        }
    }
}
