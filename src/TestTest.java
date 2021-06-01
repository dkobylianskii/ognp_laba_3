import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TestTest {
    @Test
    public void testHello() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, World!", hello.sayHello());
    }
}
