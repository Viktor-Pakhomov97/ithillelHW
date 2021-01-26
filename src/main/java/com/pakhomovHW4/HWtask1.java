package com.pakhomovHW4;
import java.util.Arrays;

public class HWtask1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
        int minValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
            }
        }
        System.out.println("MinValue = " + minValue);
    }
}
