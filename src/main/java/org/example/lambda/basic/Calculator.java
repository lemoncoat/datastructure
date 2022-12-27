package org.example.lambda.basic;

@FunctionalInterface//람다식을 쓸 쑤 있는 인터페이스인지 컴파일라인에서 체크
public interface Calculator {

    int calc(int n1,int n2);

}
