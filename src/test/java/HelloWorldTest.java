import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorldGetMessage() {
        assertEquals("Hello, World!", HelloWorld.getMessage());
    }
}
