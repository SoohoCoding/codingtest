package org.example.ja;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuffer b = new StringBuffer(); //StringBuffer 는 문자열을 효율적으로 처리할수있다

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                b.append("*");
            }
            b.append("\n");
        }

        System.out.println(b);

    }
}

