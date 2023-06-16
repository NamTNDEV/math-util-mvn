/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nhatnam.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.nhatnam.mathutl.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
    }
    
}

//Học kỹ thuật kiểm thử cho dân DEV - kỹ thuật DDT
//Data Driven Testing

//TDD: Test Driven Development:
//Kĩ thuật lập trình mà dân dev viết code đến đâu thì viết bộ test 
//case đến đó (JUnit, NUnit, Mocha) và dùng 2 màu xanh đỏ để đảm  
//bảo chất lượng code/ chất lượng hàm!!! ĐÃ HỌC XONG

//Học kĩ thuật kiểm thử cho dân dev - kĩ thuật DDT
//DDT: Data Driven Testing = Hỗ trợ cho việc xài Unit Test
//giúp các test case dễ đọc hơn, dễ đọc hơn, dễ bảo trì hơn 
//phần mở rộng thêm của TDD

//Là kĩ thuật viết code kiểm thử mà tách bộ data kiểm thử 
//ra khỏi câu lệnh Assertequals() cho dễ kiểm soát test case

//DDt là phần mở rộng cho TDD tức là giúp cho code test 
// ( UNit Test) trở nên dễ dàng đọc, bảo trì, dễ dàng phát hiện thiếu test case

//DDT tách data kiểm thử ra 1 chỗ riêng, thường là mảng 2 chiều
//vì có nhiều cột, các cột chính là data đưa vào và expected)
//và ta cần có nhiều dòng như thế, ứng với các test case

//Và mảng hai chiều này Fill/Đổ từ từ vào trong hàm Assertequals()
//kĩ thuật tách data test riêng ra 1 chỗ gọi là DDT
//Data