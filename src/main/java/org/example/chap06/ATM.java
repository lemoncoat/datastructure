package org.example.chap06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//백준 11399
public class ATM {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N]; // 수를 저장할 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(A);

        // 구간 합배열 생성
        int[] S = new int[N + 1];

        for (int i = 1; i < S.length; i++) {
            S[i] = S[i - 1] + A[i - 1];
        }

        // 합배열 총합 구하기
        int total = 0;
        for (int i = 1; i < S.length; i++) {
            total += S[i];
        }
        System.out.println(total);
    }
}
