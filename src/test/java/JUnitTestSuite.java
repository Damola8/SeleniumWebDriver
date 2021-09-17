import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //Provide all the test you want to run
        JUnitTestBeforeAfterClass.class,
        JUnitTest.class
})
public class JUnitTestSuite {

}
