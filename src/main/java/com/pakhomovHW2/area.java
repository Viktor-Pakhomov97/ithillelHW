package com.pakhomovHW2;

public class area {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int p = (a + b + c) / 2;
        System.out.println("Result p: " + p);
        //s=√(p-a)*(p-b)*(p-c);
        double s;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Result S: " + s);


    }
}
