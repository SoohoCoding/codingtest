package org.example.Ja;

import java.util.Scanner;

public class MultiplcationTable {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int a = sc.nextInt();
     sc.close();
     int sum = 0 ;
        for (int i = 1; i < a; i++) {
            sum += a;
        }
        System.out.println(sum);
    }
}


