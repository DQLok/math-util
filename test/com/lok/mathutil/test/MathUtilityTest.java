/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lok.mathutil.test;

import com.lok.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author test
 */
public class MathUtilityTest {

    //ta se viet nhung loai code o day de test ham` chinh' getFactorial()
    // ben MathUtility coi may` chya. co dung' ko 
    //viet code de test code chinh'
    //dung' sai o day chung' toi dung` mau` sac Xanh Do
    @Test //bien ham` thuong thanh ham` main()
    //shift-f6 de chay
    public void testFactorialGivenRightArgumentReturnsGoodResult() {

        int n = 5;//tui muon tinh 5!
        long expect = 120;//tui hy vong tra ve 120
        long actual = MathUtility.getFactorial(n);
        assertEquals(expect, actual);
        //neu khop thi` mau` xanh ,sai lenh thi mau` do?
        // mau` xanh xuat hien khi tat ca cac tinh huong xai` app deu mau` xanh
        //mau` do xuat hienj ngay khi co it nhat 1 thang do 
        //                      mot test case sai, tat ca bo? di
        //an y': ham` da~ dung' thi phai dung' cho tat ca cac' test case

        assertEquals(720, MathUtility.getFactorial(6)); //6! co dung 720 ko
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
    }// khi mau` do co 2 tinh huong: ham` ban. tinh sai ko nhu ki` vong.
    // ham` tinh dung' ban. ki` vong. sai 
    
    
    //ta se di test ham` co nem' ra ngoai le. nhu thiet ke hay ko 
    // ham` do' thiet ke rang: dua tham so 0..20 -> tinh' dung' n!
    //ham` dc thiet ke' rang: dua tham so ca chon' <0 > 20
    //                  nem' ra ngoi le. canh bao' sai tham so ngoai mien gia tri tinh'
    //chot: dua tham so ca` chon' phai nem' ve ngoai le.
    //          neu' thay dung' la nme' ve ngoai le. khi dua tham so ca` chpn' thi ket luan dung', Xanh
    //thay ngoai le. khi dua n ca` chon, mung` roi nuoc' mat' vi` ham` chay dung nhu thiet ke'
    //ngoai le xiat hien khi 5! la ham` dung' ma`
    //ma` ngoai le. ko phai gia tri de so sanh' kieu asertEquals()
    //vay ta phai dug` kieu khac!!!
    @Test(expected = IllegalArgumentException.class) // ko nen bat muc cao nhat 
                                                        // mac du` ko sai 
    public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
    }// ca' luon 2 tk nay` nem' ve ngoai le IllegalArguemntException
    
    
}
