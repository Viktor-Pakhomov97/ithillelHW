package com.pakhomovHW3;
import java.util.Scanner;

public class HWtask4 {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 0 && age < 13) {
            System.out.println("You child");
        } else if (age > 12 && age < 18) {
            System.out.println("You are a teenager");
        } else if (age > 17 && age < 65) {
            System.out.println("You are an adult");
        } else if (age > 64) {
            System.out.println("You are an elderly person");
        }
    }
}
