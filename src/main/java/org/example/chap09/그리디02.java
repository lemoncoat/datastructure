package org.example.chap09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class 그리디02 {
    public static void main(String[] args) {

        //문자열 분리함수
        //split
        String str = "100-40+50+74-30+29-45+43+11";
        StringTokenizer st = new StringTokenizer(str,"-");
        int answer=0;
        boolean flag=true;
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            int sum = makeSum(s);
            System.out.println(s);
            if(flag) {
                answer += sum;
                flag=false;
            }
            answer-=sum;
        }
    }

    private static int makeSum(String s) {
        int sum=0;
        StringTokenizer a = new StringTokenizer(s,"+");
        while(a.hasMoreTokens()){
            sum+=Integer.parseInt(a.nextToken());
        }
        return sum;
    }
}
