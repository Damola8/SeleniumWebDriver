//import org.testng.annotations.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JUnitTestBeforeAfterClass {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Running before class..");
    }

    @Test
    public void test_add(){
        Addition addition = new Addition();
        assertEquals(10, addition.add(4,6) );
        //assertEquals(15, addition.add(4,6) );
        assertNotSame(50, addition.add(48,6) );
        System.out.println("Running after class...");
    }

    @Test
    public void test_add2(){
        Addition addition = new Addition();
        assertEquals(-10, addition.add(-4,-6) );
        //assertEquals(15, addition.add(4,6) );
        assertNotSame(-50, addition.add(-48,-6) );
        System.out.println("Running addition test for negative numbers...");
    }

    @AfterClass
    public static void afterTest(){
        System.out.println("Running...");
    }
}
