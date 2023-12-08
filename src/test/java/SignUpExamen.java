import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.ExpandMenu;
import task.tasking.SignUp;
import task.validations.IsLoginSuccesfull;
import task.validations.IsVisibleMenu;

public class SignUpExamen extends BaseTest {
    @Test
    public void menuTest(){
        SignUp.as(webDriver, "karen","karen2132323@gmail.com","123456");
        Assert.assertTrue(IsLoginSuccesfull.visibleButtonLogout(webDriver));
    }
}
