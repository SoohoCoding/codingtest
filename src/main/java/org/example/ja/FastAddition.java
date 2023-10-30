package org.example.Ja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스의 개수를 입력 받습니다. br.readLine()은 표준 입력으로부터 한 줄을 읽고,
        // 그 내용을 정수로 변환하여 변수 T에 저장합니다.
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            //StringTokenizer를 사용하여 현재 테스트 케이스에서 두 정수 A와 B를 입력 받습니다.
            // StringTokenizer는 입력 줄을 공백으로 분할하여 토큰으로 처리할 수 있도록 도와줍니다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());


            //이 부분은 A와 B를 더한 결과를 계산하고,
            // 그 결과를 BufferedWriter를 사용하여 출력합니다.
            // bw.newLine()는 새 줄로 넘어가는 역할을 합니다.
            int sum = A + B;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }


        // BufferedWriter를 플러시하고 닫습니다.
        // 이렇게 하면 모든 출력 내용이 출력
        // 스트림으로 보내지고, 스트림이 닫힙니다.
        bw.flush();
        bw.close();

        br.close();
    }
}
