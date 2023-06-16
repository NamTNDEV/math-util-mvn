/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.nhatnam.mathutl.main;

import org.nhatnam.mathutl.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtlMvn {

    public static void main(String[] args) {
        //Test case #1: check getF(0)
        int n = 0;
        long expected = 10;
        long actual; // = ? chwof hàm trả về 

        actual = MathUtility.getFactorial(n);

        //so sánh
        System.out.println(n + "! | expected: " + expected
                + " | actual: " + actual);

        //Test case #2: 
        System.out.println("1! | expected: 1"
                + " | actual: " + MathUtility.getFactorial(1));

        //Test case #3: 
        System.out.println("5! | expected: 120"
                + " | actual: " + MathUtility.getFactorial(5));

        //Test case #4: 
        System.out.println("4! | expected: 24"
                + " | actual: " + MathUtility.getFactorial(4));

        //Test case #5: -1! thì sao ???
        System.out.println("-1! | expected: NGOẠI LỆ VẢ VÀO MẶT"
                + " | actual: ");
        MathUtility.getFactorial(-1);
    }

    //CODE CHUẨN BỊ VIẾT, HAY ĐANG VIẾT, SẼ TIẾN HÀNH LUÔN CÁI VIỆC KIỂM THỬ
    //TỨC LÀ VIẾT CODE ĐẾN ĐÂU, CÓ CODE KIỂM THỬ ĐẾN ĐÓ ĐỂ HÀM ĐẢM BẢO NGON
    //KĨ THUẬT CODE VÀ TEST CODE NGON SONG HÀNH VỚI NHAU, ĐAN XEN VỚI NHAU
    //GỌI LÀ TDD - TEST DRIVEN DEVELOPMENT
    //Code đến đâu, test đến đó
    //Developer và QC có những thứ giống nhau, và có nhiều thứ khác nhau
    //Dev: việc chính yếu, duy nhất là viết code để ra cái app
    //QC: việc chính yếu, duy nhất là tìm ra bug từ app
    //Cả hai giống nhau điều dưới đây
    //Cả 2 đều phải tạo ra, viết ra, phát triển các test cases
    //QC tạo test ca
    //BI GIỜ CHÚNG TA SẼ LÀM CÁC TEST CASE CHO HÀM GETF() Ở VAI TRÒ DEV
    //Test case là một bộ data ( gồm input và expected ) dùng để mô phỏng
    //cách xài app, xài hàm của 1 ai đó dùng để verifify/kiểm thử xem
    //output của hàm/app có giống vs expected hay ko
    //Bộ test cases cho hàm getF()
    //có 2 cách viết test case, viết tự do và viết formal/chuẩn mực 
    //Viết tự do: nghĩ sao viết vậy
    //          các test case cho hàm getF()
    //Test case #3 ( mục đích của test case): check getF() with n = 5
    //Steps/Procedures ( các bước run test case ): đưa input, và click gì được gì đó
}
