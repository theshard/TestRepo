import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class helloTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Test");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("Test Test Test");
    }

}