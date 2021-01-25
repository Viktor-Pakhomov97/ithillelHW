package com.pakhomovHW4;

import java.util.Scanner;

public class HWtask4 {
    public static void main(String[] args) {
        System.out.println("Enter the number from which you want to find the factorial:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
