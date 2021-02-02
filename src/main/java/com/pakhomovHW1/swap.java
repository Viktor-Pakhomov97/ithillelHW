package com.pakhomovHW1;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
