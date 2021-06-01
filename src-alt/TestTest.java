import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TestTest {
    @Test
    public void testHello() {
        Haloo hello = new Haloo();
        assertEquals("Hello, World!", hello.sayHello());
    }
}
