package org.example.ja;

import java.util.Scanner;

public class foradd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i < a; i++) {
            System.out.println(i + a);
        }
    }
}
