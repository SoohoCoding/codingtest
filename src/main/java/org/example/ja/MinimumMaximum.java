package org.example.ja;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            result.add(sc.nextInt());
        }
        Collections.sort(result);
        int firstElement = result.get(0);
        int lastElement = result.get(A-1);
        System.out.println(firstElement + " " + lastElement);
    }
}
