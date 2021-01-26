package com.pakhomovHW4;
import java.util.Arrays;

public class HWtask3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(a) + "= " + Arrays.stream(a).sum());
        for (int j = 0; j < b.length; j++) {
            b[j] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(b) + "= " + Arrays.stream(b).sum());
        if (Arrays.stream(a).sum() > Arrays.stream(b).sum()) {
            System.out.print("Array 'a' is greater than array 'b'" + "\n" + Arrays.toString(a));
        } else if (Arrays.stream(a).sum() < Arrays.stream(b).sum()) {
            System.out.print("Array 'b' is greater than array 'a'" + "\n" + Arrays.toString(b));
        } else if (Arrays.stream(a).sum() == Arrays.stream(b).sum()) {
            System.out.println("Arrays are equal" + "\n" + Arrays.toString(a) + " " + Arrays.toString(b));
        }
    }
}
