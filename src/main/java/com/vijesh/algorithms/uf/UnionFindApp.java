package com.vijesh.algorithms.uf;

/**
 * Hello world!
 *
 */
public class UnionFindApp 
{
    public static void main( String[] args )
    {
        QuickUnion uf = new QuickUnion(10);
        System.out.println(uf.toString());
        uf.union(3, 6);
        System.out.println(uf.toString());
        uf.union(4, 8);
        System.out.println(uf.toString());
        uf.union(0, 9);
        System.out.println(uf.toString());
        uf.union(4, 2);
        System.out.println(uf.toString());
        uf.union(2, 3);
        System.out.println(uf.toString());
        
    }
}
