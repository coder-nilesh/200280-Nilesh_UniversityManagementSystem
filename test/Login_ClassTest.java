import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Login_ClassTest {

    // Login with valid data
    @Test
    public void successTestCase() {
        String username ="nilesh";
        String pass = "nilesh1";
        Login_Class login_test = new Login_Class();
        boolean result = login_test.userLogin(username,pass);
        assertEquals(true,result);
    }

    // Login with invalid Data
    @Test
    public void failTestCase() {
        String username ="nilesh";
        String pass = "nilesh28";
        Login_Class login_test = new Login_Class();
        boolean result = login_test.userLogin(username,pass);

        assertNotEquals(true,result);

    }


}