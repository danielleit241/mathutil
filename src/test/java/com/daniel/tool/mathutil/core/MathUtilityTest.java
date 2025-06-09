package com.daniel.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@Test mang ý nghĩa biến hàm ở sát dưới thành hàm main() thì mới chạy lệnh test được
    //khi run app!!!
    //TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0
    void testFactorialGivenRightArgument0RunWell() {
        int n = 0;
        long expected = 1;  //hy vọng n = 0 tức là 0! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so dùm tao theo thực tế có như kì vọng không, nếu không thì ra màu đỏ
        //nếu có thì ra màu xanh
    }

    @Test
    //TEST CASE #2: VERIFY GETFACTORIAL WITH N = 1
    void testFactorialGivenRightArgument1RunWell() {
        int n = 1;
        long expected = 1;  //hy vọng n = 1 tức là 1! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so dùm tao theo thực tế có như kì vọng không, nếu không thì ra màu đỏ
        //nếu có thì ra màu xanh
    }

    @Test
    //TEST CASE #3:
    void testFactorialGivenRightArgumentRunWell() {
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }

    //TEST CASE #4:
    //Verify with n < 0, e.g n = -5 to throw exception
    //Steps:
    //1. Given an invalid number n = -5
    //2. Call/invoke the function getFactorial(-5)
    //3. Expected result = IllegalArgument Exception will be throw
    //Nếu đưa -5 cà cớn thì hi vọng sẽ ném ngoại lệ
    @Test
    void testFactorialGivenWrongArgumentThrowIllegalArgumentException() {
        //Ta phải kiểm soát, ta phải đo xem, ngoại lệ đã đến chưa nếu là -5
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-5);
        });
    }
}