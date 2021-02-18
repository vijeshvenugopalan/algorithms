package com.vijesh.algorithms.uf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class QuickUnion {

    private int[] a;
    private int[] sz;

    public QuickUnion(int n) {
        a = new int[n];
        sz = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (i != a[i]) {
            a[i] = a[a[i]];
            i = a[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int proot = root(p);
        int qroot = root(q);
        if (proot == qroot) {
            return;
        }
        if (sz[proot] > sz[qroot]) {
            a[qroot] = proot;
            sz[proot] = sz[proot] + sz[qroot];
        } else {
            a[proot] = qroot;
            sz[qroot] = sz[proot] + sz[qroot];
        }
    }

    public boolean isConnected(int p, int q) {
        return (root(p) == root(q));
    }

    @Override
    public String toString() {
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < a.length; i++) {
            int root = root(a[i]);
            List<Integer> list =  map.get(root);
            if (null == list) {
                list = new ArrayList<Integer>();
                map.put(root, list);
            }
            list.add(i);
        }
        
        StringBuilder builder = new StringBuilder();
        
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            builder.append(key);
            builder.append("=[");
            List<Integer> list = map.get(key);
            for (Iterator it2 = list.iterator(); it2.hasNext();) {
                Integer value = (Integer) it2.next();
                builder.append(value+",");
            }
            builder.append("],");
        }
        return builder.toString();
    }
}
