package org.example.ja;


import java.io.*;
import java.util.*;


public class ArrayCounting {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] numbers = new int[n];

        int count = 0 ;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if(numbers[i] == v){
                count ++;
            }
        }
        System.out.println(count);
        br.close();
    }

}
