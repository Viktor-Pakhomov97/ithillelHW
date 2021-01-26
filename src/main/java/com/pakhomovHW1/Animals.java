package com.pakhomovHW1;
import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        System.out.println("Введите возраст человека, для рассчета возраста: ");
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e;
        b = 15;
        c = 9;
        d = 5;
        e = 4;
        a = scanner.nextInt();
        System.out.println("Возраст человека: " + a);

        if (a == 1) {
            System.out.println("Возраст собаки: " + b + "\n" + "Возраст кошки: " + b);
        } else if (a == 2) {
            System.out.println("Возраст собаки: " + (b + c) + "\n" + "Возраст кошки: " + (b + c));
        } else if (a == 3) {
            System.out.println("Возраст собаки: " + (b + c + e) + "\n" + "Возраст кошки: " + (b + c + d));
        } else {
            System.out.println("Возраст собаки: " + (b + c + e + e) + "\n" + "Возраст кошки: " + (b + c + d + d));

        }
    }
}
