package com.pakhomovHW1;

public class replacement {
    public static void main(String[] args) {

        String s1 = "Это просто пример строки для теста", s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase();
        for (int i = 1; i < s1.length(); i++) {
            if (" ".equals(s1.substring(i - 1, i)))
                s2 = s2 + s1.substring(i, i + 1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i + 1);
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
