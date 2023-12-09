import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CreateTodo;
import task.tasking.Proyect;
import task.validations.IsCreatedTodo;

public class AddTodoExamen extends BaseTest {
    @Test
    public void Test(){
        CreateTodo.as(webDriver,"karen12@gmail.com","123456");
        Assert.assertTrue(IsCreatedTodo.visibleTarea(webDriver));
    }
}
