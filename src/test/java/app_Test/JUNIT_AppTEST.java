package app_Test;

import appCodes.AppforTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUNIT_AppTEST {
    AppforTest aTest= new AppforTest();
    @Test
    public void testSum(){
        int res;
        res= aTest.sumNumbers(2,2);
        Assertions.assertNotEquals(res,4,"sum mismatch");
        System.out.println("@Test1 method");
    }
    @Test
    public void test2(){
        System.out.println("Test2 method");
    }
    @Test
    public void test3(){
        System.out.println("@Test3 method");
    }

}
