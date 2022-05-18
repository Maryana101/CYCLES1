import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
package ru.netology.sqr;


public class SQRServiceTest {
    @Test
    public void shouldCountSqrtForMiddleDiapason () {
        SQRService sqrService = new SQRService();
        int actual = sqrService.sqrCount(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected,actual);
   }
    @Test
   public void shouldCountSqrtForSmallDiapason (){
        SQRService sqrService=new SQRService();
        int actual=sqrService.sqrCount(0,1);
        int expected =2;

        Assertions.assertEquals(expected,actual);
   }
    @Test
   public void shouldCountSqrtForBigDiapason (){
        SQRService sqrService=new SQRService();
        int actual=sqrService.sqrCount(0,10000000);
        int expected=3163;

        Assertions.assertEquals(expected,actual);
   }
    @Test
   public void negativeTest(){
        SQRService sqrService=new SQRService();
        int actual=sqrService.sqrCount(-100,100);
        int expected=11;

        Assertions.assertEquals(expected,actual);
   }
}
