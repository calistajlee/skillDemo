import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    
    @Test
    public void testPowerOfTwo() {
        assertEquals(4, skillDemo.powerOfTwo(2));
        assertEquals(9, skillDemo.powerOfTwo(3));
        assertEquals(16, skillDemo.powerOfTwo(4));
        assertEquals(25, skillDemo.powerOfTwo(5));
    }
}
