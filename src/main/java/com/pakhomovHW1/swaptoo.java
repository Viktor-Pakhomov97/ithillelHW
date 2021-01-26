package com.pakhomovHW1;
public class swaptoo {
    public static void main(String[] args) {
        int a, b;
        a = 2;
        b = 3;
        a = a + b - (b = a);
        System.out.println(a);
        System.out.println(b);
    }
}
