/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lok.mathutil;

/**
 *
 * @author test
 */
public class MathUtility {

    //class nay` chua cac ham` toan' hoc fake lai class chuan cua JDK
    //java.util.Math ben trong chua cac ham toan hoc sqrt() abs() sin().
    // cai j dung` chugn cho moi noi, thi ta dat la static
    public static final double PI = 3.1415;

    //ham` dung` chung tinh' giai thua`()
    // quy uoc' n!=1.2.3.4...n
    // 0!=1!=1
    //ko co giai thua so am
    //giai thua tang rat nhanh, 20! vua` khop kieu long
    // 21! tran` long, bi sai neu rang luu bien long
    //long: 10^18 18 con so 0
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid argument. N must between 0..20");
//
//        //cpu chay den day thi sure n tu 0..20
//        if (n == 0 || n == 1) 
//            return 1;       
//
//        long result = 1;//co tinh heng de thay' do?
//        for (int i = 2; i <= n; i++) 
//            result *= i;    
//
//        return result;
//    }
    
     public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. N must between 0..20");

        //cpu chay den day thi sure n tu 0..20
        if (n == 0 || n == 1) 
            return 1;       

        return n*getFactorial(n-1); // de quy
            //n!=n*(n-1)!

    }
}
