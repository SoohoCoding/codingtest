package org.example.ja;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfCenturies {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("N 입력 : ");
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        int count = 0;
        System.out.println(" 배열에 들어갈 숫자 입력 :  ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println("찾을 숫자 입력 : ");
        int V = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if(numbers[i] == V){
                count ++;
            }
        }
        System.out.println(count);
        br.close();


    }
    }

