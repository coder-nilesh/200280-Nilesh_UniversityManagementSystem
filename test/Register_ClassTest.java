import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Register_ClassTest {

    @Test
    // testing class not null
    public void testConstructor() {
        Register_Class registerClass = new Register_Class();
        assertNotNull(registerClass);
    }

    @Test
    // Register inserting test pass
    public void testGetters() {
        Register_Class registerClient = new Register_Class("Nilesh","Kadel","nileshkadel1@gmail.com","nilesh1", "nilesh28");
        String expected = "nilesh1";
        String actual = registerClient.getUsername();
        assertEquals(expected,actual);
    }

}