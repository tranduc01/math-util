package com.tranduc.mathutil.test.core;

import com.tranduc.mathutil.core.MathUtil;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Tranduc
 */
public class MathUtilTest {
    // day là class sẽ sử dụng các hàm của thư viện /framework JUnit để kiểm tra code chính - Hàm tính giai thừa bên core.MathUtil
    //viet code de test code 
    
    //co nhieu qui tac dat ten ham kiem thu
    //nhung thuong se la noi len muc dich cua cac case kiem thu tinh huong xai ham theo kieu thanh cong va that bai
    
    //ham duoi day la tinh huong test ham chay thanh cong, tra ve ngon
    //ta se xai ham nay kieu well - dua 5!, 6! hok choi dua -5!, 30!
    
    //@Test JUnit se phoi hop voi JVM de chay ham nay
    //@Test phia hau truong chinh la public static void main()
    //co nhieu @Test ung vs nhieu case khac nhau de kiem thu ham tinh giai thua
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; //test thu tinh huong tu te dau vao, may phai chay dung
        long expected = 1; //hy vong 0!=1
        //long actual = ; //goi ham can test been core chinh
        long actual = MathUtil.getFactorial(n);
        
        //so sanh expected vs actual dung xanh xanh do do, framework
        Assert.assertEquals(expected, actual);
        
        
        //gop them vai case thanh cong nua !!! ham phai tinh ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //tui mun 1!=1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //tui mun 2!=2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //tui mun 3!=6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //tui mun 4!=24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); //tui mun 5!=120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //tui mun 6!=720
        
    } //ham giup so sanh 2 gia tri nao do co giong nhau hay ko
      //neu giong -> mau xanh den duuong - duong thong, code ngon it nhat cho case dang test
      //neu ko giong -> mau do den duong
      //                ham y expected va actual ko giong nhau
    
    //hàm getF() ta thiet ke có 2 thinh huóng xử lý 
    //1. đưa data tử tế trong đoạn 0-20  -> tính đúng -> done
    //2. đưa data vào cà chớn, âm >20; thiết kế của hàm là ném ra ngaoij lệ
    //tao kỳ vọng ngaoij lệ xuất hiện khi n<0 || n>20
    //rat mong ngoai le xuát hiện với n cà chớn 
    
    // néu hàm nhận n<0 || n>20 và ném ra ngoại lệ
    //hàm chạy đúng như thiết kế -> màu xanh phải xuất hiện
    
    // néu hàm nhận n<0 || n>20 và éo ném ra ngoại lệ
    //sure, sai thiết kế, sai kỳ vọng -> Màu đỏ
    
    
    //Test case: :
    //Input: -5
    //expected: IllegalExepction xuất hiện 
    //tình hướng bất thường, ngaoij lệ, ngoài dự tính
    // là những thứ ko thể đo lường so sánh theo kiểu value mà chỉ có thể đo lường bằng cách chúng có xuất hiện hay ko 
    //asserEqual ko dùng để so sánh 2 ngoại lệ 
    //equal() là bằng nhau hay ko trên value
    
    
    //màu đó đó em, do hàm đúng là có ném ngaoij lệ thật sự
    //nhưng ko phải là ngoại lệ như kỳ vọng - thực sự là kỳ vọng sai
    // chứ ko phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowExeption(){
//        MathUtil.getFactorial(-5); //hàm @test chạy hay getF chạy 
//                                   // sẽ ném ngoại lệ NumberFormat....
//    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowExeption(){
        MathUtil.getFactorial(-5); //hàm @test chạy hay getF chạy 
                                   // sẽ ném ngoại lệ NumberFormat....
    }
    
    //cách khác để bắt ngoại lệ xauats hiện, viết tự nhiên hơn
    ///asdasdasdasd
    
}
