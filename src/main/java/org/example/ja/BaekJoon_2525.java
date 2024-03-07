package org.example.ja;

import java.util.Scanner;

public class BaekJoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b += c;
        a += b / 60;
        b %= 60;
        a %= 24;

        System.out.println(a + " " + b);

    }
}
