package com.pakhomovHW2;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        //ax^2+bx+c=0;
        System.out.println("Enter three variables: a,b,c ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        System.out.println("Variables value: " + a + ", " + b + ", " + c + ";");
        //find the discriminant: D=b^2-4ac;
        double dis = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Discriminant value: " + dis);
        /*
        if D> 0 - there will be two roots;
        if D= 0 - there is exactly one root;
        if D< 0 - no roots;
         */
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            if (x1 > x2) {
                System.out.println("Value x2: " + x2 + "; " + "Value x1: " + x1 + "; ");
            } else {
                System.out.println("Value x1: " + x1 + "; " + "Value x2: " + x2 + "; ");
            }
        } else if (dis == 0) {
            double x = (-b + Math.sqrt(dis)) / 2 * a;
            System.out.println("Value x1: " + x + "; ");
        } else {
            System.out.println("D<0 no roots, nothing to count");
        }
    }
}

