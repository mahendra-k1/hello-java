import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        assertEquals("Hello from method!", HelloWorld.greet());
    }
}