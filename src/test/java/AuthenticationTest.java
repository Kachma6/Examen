import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginInvalid;
import task.validations.IsLoginSuccesfull;

public class AuthenticationTest extends BaseTest {
//    @Test
//    public void authenticationTest(){
//        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
//        Assert.assertTrue(IsLoginSuccesfull.visibleTitle(webDriver));
//    }
    @Test
    public void authenticationMessageTest(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        Assert.assertTrue(IsLoginSuccesfull.visibleMessage(webDriver));
        Assert.assertEquals(IsLoginSuccesfull.getTextSuccess(webDriver), "You logged into a secure area!\n" + "×");
    }
    @Test
    public void authenticationInvalidUsernameTest(){
        Login.as(webDriver,"tomsmithaa","SuperSecretPassword!");
        Assert.assertTrue(IsLoginInvalid.visibleInvalidName(webDriver));
        Assert.assertEquals(IsLoginInvalid.getTextInvalid(webDriver), "Your username is invalid!\n" + "×");
    }
    @Test
    public void authenticationInvalidPasswordTest(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!error");
        Assert.assertTrue(IsLoginInvalid.visibleInvalidName(webDriver));
        Assert.assertEquals(IsLoginInvalid.getTextInvalid(webDriver), "Your password is invalid!\n" + "×");
    }
}
