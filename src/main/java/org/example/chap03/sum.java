package org.example.chap03;

import java.util.Arrays;
import java.util.Scanner;

// 백준 11659
public class sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열에 저장할 숫자 개수
        int M = sc.nextInt(); // 테스트 케이스 숫자 (합을 몇번 구할건지)

        int[] A = new int[N];
//        System.out.println(Arrays.toString(A));

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 합배열 S 구하기
        // S[i] = S[i-1] + A[i]
        int[] S = new int[A.length];

        S[0] = A[0];
        for (int i = 1; i < S.length; i++) {
            S[i] = S[i-1] + A[i];
        }
//        System.out.println(Arrays.toString(S));


        for (int i = 0; i < M; i++) {
            int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
            if (x > 0) {
                System.out.println(S[y] - S[x - 1]);
            } else {
                System.out.println(S[y]);
            }
        }
        sc.close();

    }
}