package org.example.ja;

import javax.imageio.IIOException;
import java.io.*;
import java.util.StringTokenizer;

public class caseadd {
    public static void main(String[] args) throws IOException {

        //BufferedReader , BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력처리
        int T = Integer.parseInt(br.readLine());

        //문자열 정리
        StringTokenizer st;


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," "); // 입려되는 것을 읽어와 공백을 기준으로 문자열을 나누는 StringTokenizer 생성, 띄어쓰기 마다 토큰을 구분한다.
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+(num1+num2) +"\n");
        }
        br.close();

        bw.flush(); // 버퍼 비우기, 버퍼 내용을 출력 장치로 내보냄
        bw.close(); //출력 스트림 닫기

    }
}
