package com.daniel.tool;

import com.daniel.tool.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0RunWell();
        testFactorialGivenRightArgument1RunWell();
        testFactorialGivenRightArgumentRunWell();
    }

    //TEST THỬ HÀM VỪA CÓ
    //CẦN CÓ TEST CASE
    //TEST CASE #1: CHECK/VERIFY GETFACTORIAL() METHOD WITH N = 0
    //STEPS: GIVEN N = 0
    //       CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY ĐÃ
    public static void testFactorialGivenRightArgument0RunWell(){
        var n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected + ", 0! actual: " + actual);
    }


    //TEST CASE #2: CHECK/VERIFY GETFACTORIAL() METHOD WITH N = 1
    //STEPS: GIVEN N = 1
    //       CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 1!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY ĐÃ
    public static void testFactorialGivenRightArgument1RunWell(){
        var n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! expected: " + expected + ", 1! actual: " + actual);
    }

    //TEST CASE #3: CHECK/VERIFY GETFACTORIAL() METHOD WITH N = 2
    //STEPS: GIVEN N = 2
    //       CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 2 AS THE RESULT OF 2!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY ĐÃ
    public static void testFactorialGivenRightArgumentRunWell(){
        System.out.println("2! expected: 2" + ", 2! actual: " + MathUtility.getFactorial(2));
        System.out.println("3! expected: 6" + ", 3! actual: " + MathUtility.getFactorial(3));
        System.out.println("4! expected: 24" + ", 4! actual: " + MathUtility.getFactorial(4));
        System.out.println("5! expected: 120" + ", 5! actual: " + MathUtility.getFactorial(5));
    }
}
//TDD: TEST DRIVE DEVELOPMENT
//VIẾT CODE CHÍNH VÀ VIẾT TEST CASE/TEST RUN XONG XONG VỚI NHAU
//CỨ VIẾT ĐƯỢC CODE ĐOẠN NÀO THÌ CÓ NGAY TEST CASE CHO NÓ
//TEST CASE DÙNG ĐỂ TEST CÁC HÀM (CHỨ KHÔNG PHẢI TEST MÀN HÌNH)
//VÀ CHỈ DÀNH CHO CHÍNH DÂN DEV THÔI, KHÔNG PHẢI CHO DÂN QA/QC KO DÍNH VÀO CODE CỦA PROJECT

//NHỜ TDD, TDD ĐÓNG GÓP 1 PHẦN GIÚP TA TỰ ĐỘNG HÓA QUÁ TRÌNH BUILD, CHECK ERROR, CHECK BUG, ĐÓNG GÓI NẾU CODE ỔN
// VÀ DEPLOY LÊN STAGING SERVER (SERVER ĐỂ TEST APP)
// CÒN GIÚP TA TỰ ĐỘNG HÓA
//CODE CHECK VAR CODE -> UNIT TEST, TDD
//     -> OK THÌ ĐÓNG GÓI APP
//              ĐƯA APP LÊN SERVER
//QUY TRÌNH NÀY ĐƯỢC GỌI LÀ CI/CD

//CV CÓ MỘT MỤC:
//TECHNICAL SKILLS ------------
//JUNIT
//TDD
//CI/CD
//MAVEN