package org.example.ja;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수의 개수 N 입력받기
        int[] numbers = new int[N]; // N개의 정수를 담을 배열 선언

        // N개의 정수를 배열에 저장
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int v = sc.nextInt(); // 찾으려는 정수 v 입력받기

        int count = 0;

        // 배열을 순회하면서 v와 일치하는 원소의 개수를 count
        for(int number : numbers) {
            if(number == v) {
                count++;
            }
        }
        System.out.println(count); // v가 몇 개 있는지 출력
            }
        }


