package com.pakhomovHW3;
import java.util.Scanner;

public class HWtask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to see the century: ");
        int a = sc.nextInt();
        int b = (a / 100) + 1;
        String years = (a % 100 == 0) ? "This " + a / 100 + " century" : "This " + b + " century";
        System.out.println(years);
    }
}
