/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lok.mathutil.main;

import com.lok.mathutil.MathUtility;

/**
 *
 * @author test
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muon test xem 5! co bang 120 ko?
        long expected=120;//t hy vong 120 la gia tri tra ve 
        int n=5; //neu t 5!
        long actual=MathUtility.getFactorial(n);//tui y vong actual: cai value ham thuc su tra ve 
        //ta di so sanh' bang mat de luan xem may ham` ta viet chay dung' hay ko
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        
        //tinh huong test so 2 0! xem sao?
        //tinh huong test, tinh` huong xai`, goi la test case
        
        n=0; // tui muon tinh 0!
        expected=1; // hy vong nhan ve 1
        actual=MathUtility.getFactorial(n);
        //dung mat luan ket qua again
         System.out.println("0!: Expected: "+expected+"; Actual: "+actual);
        
//        // TODO code application logic here
//        System.out.println("Hello GitHub");
//        System.out.println("This is 1st upload connects to remote GitHub Server");
    }
    
}

//Trong quy trinh lap trinh chuyn nghiep/ o cac cty, dac biet la lam cho japan
//Moi ham hay class ban viet ra deu phai duoc test ky cang` truoc khi ghep no vao trong cac cuc tinh nang vaf gheps voi UI, Back-end
//Lam` sao de test cac ham, cac clss
//dan dev co nhieu cach
//1. cach1: sout(ket qua xy ly ham`)
//2. cach2: JOptionPane(pop-up len ket qua xu ly ham`) ben JAVA DESKTOP
//3. cach3: ghi vao LOG file trong mon JAVA WEB, hay in ket qua xu ly ra 1 trang web tam nao` do'
//voi 3 cach nay`, ta goi ham`, nhin ket qua tra ve ham`- ACTUAL VALUE
//      va ta ngam so sanh voi cac ket qua ma` ta tu tinh toan truoc do'
//      khi chua goi ham` - ta goi la GIA TRI KI` VONG. - EXPECTED VALUE
//neu EXPECTED VALUE == ACTUAL VALUE (thuc te va ki` vong. khop' nhau)
//A' DU`, CHAY. HAM` DUNG'
//neu ko bang, du`, ham` xu ly sai
//3 cach tren doi` hoi DEV phai dung` mat de luan ket qua dung' sai
//neu nhieu test case ta rat de bi bo? sot' or nhin` sai ket qua?
// ky thuat nhu o tren goi la` Manual test
//test khi code vua moi xong tung ham` goi la Unit Test


//Con` cach' xin. xo` thu 4
//ta ko can nhin` bang mat tung truong hop 
//ta nho` may' so sanh' dum` luon Expected luon 
//va neu tat ca cac tinh huong deu khop, bang nhau, nem' ra 1 mau` xanh
//neu hau het deu` khop, chi co it nhat 1 cai' ko khop, ham` ko on dinh. nem' ra mau` do -> canh bao dan Dev Code co truc trac
// vay luc nay` ta chi? nhin` mau` la du?, ko can` luan tung` ket qua?
// ky thuat nay` goi la` Test Driven Development + Test Automation
// vua viet code vua viet test                     tu dong hoa viec test

// muon lam dc dieu` nay` a can them thu vien phu tro de tung ra mau`
//thu vien nay` deu co tuong ung o cac ngon ngu lap trinh`
// java: JUnit, TestNG,...
//c#: NUnit, xUnit, MSTest
//php: PHPUnit
//...


