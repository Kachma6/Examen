import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.HoverImagen1;

public class HoverTest extends BaseTest {
    @Test
    public void hoverTest(){
        HoverImagen1.as(webDriver);
    }
}
