package org.example.chap03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Good {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0 ; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0; // 좋은 수의 갯수
        int point1 = 0; //스타터 포인트
        int target =1;
        int point2 = target-1; //end point
        // 투 포인터 알고리즘
        // start와 end가 역전될 때까지
       while(target<A.length){

            if(A[target] ==A[point1]+A[point2]&&point1!=point2){
                count++;
                target++;
                point1=0;
                point2 = target-1; //end point
            }else if(A[target] > A[point1]+A[point2]&&point1!=point2){
                point1++;
            }else if (A[target] < A[point1]+A[point2]&&point1!=point2 ){
                point2--;
            }else if(point2<=point1){
                target++;
                point2 = target-1; //end point
                point1=0;
            }

        }
        System.out.println(count);

    }
}
