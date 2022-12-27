package org.example.chap06.insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr){

        //2번째 데이터부터 타겟팅해서 시작
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j=i;
            while (j > 0 && arr[j-1]>=temp){
                //타겟에 왼쪽데이터가 타겟보다 크면
                //왼쪽데이터를 우측으로 한 칸 이동
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;

        }//enf-for:i
    }

    public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 삽입정렬

        System.out.println("정렬 후: " + Arrays .toString(arr));
    }
}
