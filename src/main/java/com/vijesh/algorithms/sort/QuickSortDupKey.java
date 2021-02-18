package com.vijesh.algorithms.sort;

public class QuickSortDupKey implements Sort {

    @Override
    public void sort(Comparable[] a) {
        
        sort(a, 0, a.length-1);
    }
    
    private void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) {
            return;
        }
        int lt = lo,gt= hi;
        Comparable v = a[lo];
        int i = lo;
        
        while(i<=gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                Sort.exch(i++, lt++, a);
            } else if (cmp > 0) {
                Sort.exch(i,gt--, a);
            } else {
                i++;
            }
        }
        
        sort(a, lo, lt-1);
        sort(a, gt, hi);
    }
}
