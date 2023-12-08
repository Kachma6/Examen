import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.SignUp;
import task.validations.IsLoginSuccesfull;

public class LoginExamen extends BaseTest {
    @Test
    public void menuTest(){
        Login.as(webDriver,"karen12@gmail.com", "123456");
        Assert.assertTrue(IsLoginSuccesfull.visibleButtonLogout(webDriver));
    }

}
