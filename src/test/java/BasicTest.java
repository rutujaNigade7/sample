import org.com.Basics;

public class BasicTest {

    @Test
    public void compare(){
        Basics basicTest = new Basics();
        int value = basicTest.compare(2,1);
        Assertion.assertEquals(1,value);
    }
}
