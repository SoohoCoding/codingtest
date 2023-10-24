package org.example.ja;

import java.util.Scanner;

public class tffao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a+b;
        int minus = a-b;
        int multiplication = a*b;
        int division = a/b;
        int remainder = a%b;

        System.out.println(add);
        System.out.println(minus);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);
    }
}
