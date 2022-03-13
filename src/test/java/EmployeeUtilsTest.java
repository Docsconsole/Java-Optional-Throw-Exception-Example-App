import com.docsconsole.tutorials.optaional.exception.EmployeeNotFoundException;
import com.docsconsole.tutorials.optaional.util.EmployeeUtils;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeUtilsTest {
    @Test
    public void getEmployeeByNameTest() throws Exception {

        Exception exception = assertThrows(EmployeeNotFoundException.class, () -> {
            new EmployeeUtils().getEmployeeByName("");
        });
        String expectedMessage = "Employee is not existed with given Name.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void getEmployeeByIdTest() throws Exception {

        Exception exception = assertThrows(NullPointerException.class, () -> {
            new EmployeeUtils().getEmployeeById(null);
        });
        String expectedMessage = "Employee is not existed with given Id.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
