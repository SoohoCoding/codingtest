package org.example.ja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // 아홉 개의 자연수를 입력받아 ArrayList에 저장
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        int max = numbers.get(0);  // 최댓값을 첫 번째 수로 초기화
        int index = 1;  // 최댓값이 몇 번째 수인지를 나타내는 변수

        for (int i = 1; i < 9; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
                index = i + 1;  // 인덱스는 1부터 시작하므로 +1
            }
        }

        // 최댓값 출력
        System.out.println(max);

        // 최댓값이 몇 번째 수인지 출력
        System.out.println(index);
    }
}