package org.example;

class Main {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            if(total ==0){
                for (int i = 0; i < num; i++) {
                    if(i==0) answer[i]=0-(num/2);
                    else answer[i]=answer[i-1]+1;
                }
            }else{
                int mid = total/num;
                if(mid*num==total){
                    for (int i = 0; i < num; i++) {
                        if(i==0) answer[i]=mid-(num/2);
                        else answer[i]=answer[i-1]+1;
                    }
                }else{
                    for (int i = 0; i < num; i++) {
                        if(i==0) answer[i]=mid-(num/2)+1;
                        else answer[i]=answer[i-1]+1;
                    }
                }

            }
            return answer;
        }
    }
}