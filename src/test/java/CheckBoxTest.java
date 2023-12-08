import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Checkboxes;
import task.tasking.Login;
import task.validations.IsCheckboxChecked;
import task.validations.IsLoginSuccesfull;

public class CheckBoxTest extends BaseTest {
    @Test
    public void Checkbox1CheckedTest(){
        Checkboxes.as(webDriver);
        Assert.assertTrue(IsCheckboxChecked.checked(webDriver));

    }
    @Test
    public void Checkbox2CheckedDefaultTest(){
        Checkboxes.as(webDriver);
        Assert.assertTrue(IsCheckboxChecked.checkedDefault(webDriver));

    }

}
