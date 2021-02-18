package com.vijesh.algorithms.sort;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        Comparable[] a = {9,8,7,6,5,4,3,2,1,0};
        Shuffling shuffling = new Shuffling();
//        shuffling.shuffle(a);
        print(a);
        
        Sort sort = new QuickSortDupKey();
        
        sort.sort(a);
        
        print(a);
    }

    private static void print(Comparable[] a) {
        System.out.print("Sorted array = [");
        Arrays.stream(a).forEach(v->System.out.print(v+","));
        System.out.println("]");
    }
}
