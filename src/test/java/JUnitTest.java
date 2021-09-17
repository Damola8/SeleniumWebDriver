//import org.testng.annotations.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotSame;

public class JUnitTest {
    @Before
    public void beforeTest(){
        System.out.println("Running...");
    }

    @Test
    public void test_add(){
        Addition addition = new Addition();
        assertEquals(10, addition.add(4,6) );
        //assertEquals(15, addition.add(4,6) );
        assertNotSame(50, addition.add(48,6) );
        System.out.println("Running addition test for positive numbers...");
    }

    @Test
    public void test_add2(){
        Addition addition = new Addition();
        assertEquals(-10, addition.add(-4,-6) );
        //assertEquals(15, addition.add(4,6) );
        assertNotSame(-50, addition.add(-48,-6) );
        System.out.println("Running addition test for negative numbers...");
    }

    @After
    public void afterTest(){
        System.out.println("Running...");
    }
}
