package com.vijesh.algorithms.sort;

public class QuickSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        
        sort(a, 0, a.length-1);
    }
    
    private void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    
    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi+1;
        
        while(true ) {
            while(less(a[++i],a[lo])) {
                if (i == hi) {
                    break;
                }
            }
            while(less(a[lo],a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i>=j) {
                break;
            }
            
            Sort.exch(i, j, a);
        }
        Sort.exch(lo, j, a);
        return j;
    }
}
