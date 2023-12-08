import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.validations.IsLogout;

public class LogoutExamen extends BaseTest {
    @Test
    public void logoutTest(){
        Logout.as(webDriver,"karen12@gmail.com", "123456");
        Assert.assertTrue(IsLogout.visibleButtonLogout(webDriver));
    }

}
