package org.example.ja;

import java.util.Scanner;

public class BaekJoon_2753 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) { // 윤년
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
