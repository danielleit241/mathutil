package com.daniel.tool.mathutil.core;

public class MathUtility {
    //CLASS NÀY CHƯ CÁC HÀM STATIC, LÀ NHỮNG HÀM TIÊN TÍCH DÙNG CHUNG CHO MỌI NƠI

    //ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    //HÀM NÀY TÍNH N!
    //N! = 1.2.3.4. ... .N
    //KO CÓ GIAI THỪA SỐ ÂM
    //0! = 1
    //20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! LÀ VƯỢT KIỂU LONG
//    public static long getFactorial(int n){
//        //ĐEM CODE CHÍNH RA SỬA THÌ GỌI LÀ REFACTORING
//
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 and 20");
//         //bạn đưa cà chớn, invalid data tớ ném ra ngoại lệ -> hàm ko được chạy thành công, ko value trả về
//
//        //sống xót đến đây
//        if(n == 0 || n == 1)
//            return 1;
//
//        //sống sót đến đây n = 1 ... 19
//        //for mà tính
//        long result = 1; //thuật toán cộng dồn con heo đất
//        for(int i = 2; i <= n; i++)
//            result *= i; //nhân dồn vào từng cháu i
//
//        return result;
//    }
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20");

        if(n == 0 || n == 1)
            return 1;

        return n*getFactorial(n-1);
        //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    }
}
