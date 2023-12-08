import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.HorizontalSlide;

public class SlideHorizontal extends BaseTest {
    @Test
    public void slideTest(){
        HorizontalSlide.as(webDriver);
    }
}
