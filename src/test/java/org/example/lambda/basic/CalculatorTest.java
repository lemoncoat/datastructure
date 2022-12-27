package org.example.lambda.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testtt() {
        //람다식을 쓰기 위한 전제조건
        // 해당 인터페이스에 추상메서드가 반드시 단 한개일것!
        Calculator addCalc = (n1, n2) -> n1 + n2;
        addCalc.calc(10, 20);

        Operator op = new Operator(10,20);
        int r3 = op.operate((n1,n2) -> n1-n2);
        System.out.println("r3 = " +r3);

    }
}