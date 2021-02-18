package com.vijesh.algorithms.sort;

public class MergeSort implements Sort{

    @Override
    public void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
        
    }
    
    public void sort(Comparable[] a, Comparable[] aux, int lo, int hi ) {
        if (hi<=lo) {
            return;
        }
        int mid = (hi+lo)/2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }
    
    public void merge(Comparable[] a, Comparable[] aux, int lo, int mid,int hi ) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if (i>mid) {
                a[k] = aux[j];
                j++;
            } else if (j>hi) {
                a[k] = aux[i];
                i++;
            } else if (less(aux[j],aux[i])) {
                a[k] = aux[j];
                j++;
            } else {
                a[k] = aux[i];
                i++;
            }
        }
    }

}
