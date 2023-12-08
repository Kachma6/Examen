import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.ExpandMenu;
import task.validations.IsVisibleMenu;

public class Menu extends BaseTest {
    @Test
    public void menuTest(){
        ExpandMenu.as(webDriver);
        Assert.assertTrue(IsVisibleMenu.visible(webDriver));
    }
}
