import java.beans.Transient;
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    //here, we add a test for our subtract function
    @Test
    public void subtraction() {
        assertEquals(0, SkillDemo.subtract(1,1));
    }
}
