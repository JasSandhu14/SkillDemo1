import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test
    public void getCountTest(){
        assertEquals(15, SkillDemo.getCount(1,15)); //success
    }
}
