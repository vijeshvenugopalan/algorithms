package com.vijesh.algorithms.uf;


public class UnionFind {

    private int[] a;

    public UnionFind(int n) {
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[0] = i;
        }
    }

    public void union(int p, int q) {
        int pid = a[p];
        int qid = a[q];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == pid) {
                a[i] = qid;
            }
        }
    }

    public boolean isConnected(int p, int q) {
        return (a[p] == a[q]);
    }
}