package com.daniel.tool.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //tách data ra khỏi hàm test
    //dựng 1 mảng 2 chiều, input và expected
    //sau đó nhồi vào fill vào câu lệnh assert
    //mảng này sẽ là nguồn dữ liệu để hàm so sánh gọi, nhiều lần như thế, do nhiều bộ data
    //-> nguồn dữ liệu này là static để tìm kiếm nhanh chóng

    public static Object[][] initValidTestData(){
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 7200}
        };
    }

    @ParameterizedTest
    @MethodSource("initValidTestData")
    void testFactorialGivenRightArgumentRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}