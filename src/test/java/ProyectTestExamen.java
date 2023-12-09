import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Proyect;
import task.validations.IsCreateProyect;
import task.validations.IsLoginSuccesfull;

public class ProyectTestExamen extends BaseTest {
    @Test
    public void menuTest(){
        Proyect.as(webDriver,"karen12@gmail.com","123456");
        Assert.assertTrue(IsCreateProyect.visibleProyect(webDriver));

    }
}
