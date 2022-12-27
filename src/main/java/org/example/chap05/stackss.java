package org.example.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//백준 1874
public class stackss {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //한줄에 여러 숫자 입력받기
        //5 3
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int x=st.nextToken();=5  int y = st.nextToken();=3
        //만들어야할 수열
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]= Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        // 자연수 변수
        int num =1;

        //수열 배열 a에서 값을 하나씩 타겟팅해서 push,pop여부 확인
        StringBuilder result =new StringBuilder("");
        for (int i = 0; i < n; i++) {
           int targetNum= a[i]; //현재 타겟 값

            //push 경우
            if(targetNum>=num){
                while (targetNum>=num){

                    stack.push(num++);
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            }
            //pop인 경우
            else if(targetNum<num&&targetNum==stack.peek()){
                stack.pop();
                result.append("-\n");
            }else if(targetNum<num&& targetNum!=stack.peek()){
                result = new StringBuilder("NO");
                break;
            }
        }
        System.out.println(result);

    }
}
