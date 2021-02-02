package com.pakhomovHW3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HWtask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours did Nathan bike ride ?");
        try {
            double time = sc.nextDouble();
            double litres = time * 0.5;
            System.out.println("Nathan will drink " + Math.floor(litres) + " liters of water");
        } catch (InputMismatchException e) {
            System.err.println("Enter a number using a comma not a period");

        }
    }
}
