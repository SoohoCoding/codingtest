package org.example.ja;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SmallerThanX {
    public static void main(String[] args) throws IOException {

        // 입력을 읽기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 라인에서 공백으로 구분된 두 정수 N과 X를 읽음
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        int X = Integer.parseInt(st.nextToken()); // 비교 대상


        // 결과를 저장하기 위한 StringBulder 생성
        StringBuilder sb = new StringBuilder();

        // 두 번째 라인에서 공백으로 구분된 N개의 정수를 읽고 처리
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());


            // value가 x 보다 작으면 StringBuilder에 추가
            if(value < X)
                sb.append(value).append(' ');
        }
        // 결과 출력
        System.out.println(sb);





    }
}
