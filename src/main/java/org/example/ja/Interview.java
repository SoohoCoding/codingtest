package org.example.ja;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N/4; i++) {
            System.out.println("long");
        }
        System.out.println("int");
    }
}
