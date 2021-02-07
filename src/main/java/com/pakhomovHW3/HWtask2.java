package com.pakhomovHW3;
import java.util.Scanner;

public class HWtask2 {
    public static void main(String[] args) {
        System.out.println("**Body Mass Index Calculations**" + "\n" + "Example of data entry: " +
                "Height: 170; Weight: 73;");
        System.out.println("Enter your height and weight: ");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        height = height / 100;
        System.out.println("Height: " + height + ";" + "\n" + "Weight:" + weight + ";");
        double bmi = weight / (Math.pow(height, 2));
        System.out.println("Result: " + bmi + ";");
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 25.0) {
            System.out.println("Normal");
        } else if (bmi <= 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
