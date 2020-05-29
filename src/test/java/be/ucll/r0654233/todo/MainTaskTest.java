package be.ucll.r0654233.todo;
import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.domain.SubTask;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MainTaskTest {

    @Test
    public void testAddSubTask() {
        MainTask mainTask = new MainTask();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        mainTask.setUniqueID(1);
        mainTask.setTitle("title");
        mainTask.setDescription("description");
        mainTask.setDue(calendar);

        SubTask subTask = new SubTask();
        // Create sub task
        subTask.setUniqueID(2);
        subTask.setTitle("titleSub");
        subTask.setDescription("descriptionSub");
        subTask.setDue(calendar);

        assertEquals(0, mainTask.getSubTasks().size());
        mainTask.addSubTask(subTask);
        assertEquals(1, mainTask.getSubTasks().size());
        assertEquals("titleSub", mainTask.getSubTasks().get(0).getTitle());
    }

    @Test
    public void testRemoveSubTask() {
        MainTask mainTask = new MainTask();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        mainTask.setUniqueID(1);
        mainTask.setTitle("title");
        mainTask.setDescription("description");
        mainTask.setDue(calendar);

        SubTask subTask = new SubTask();
        // Create sub task
        subTask.setUniqueID(2);
        subTask.setTitle("titleSub");
        subTask.setDescription("descriptionSub");
        subTask.setDue(calendar);

        mainTask.addSubTask(subTask);
        assertEquals(1, mainTask.getSubTasks().size());
        mainTask.removeSubTask(2);
        assertEquals(0, mainTask.getSubTasks().size());
    }

    @Test
    public void testUpdateSubTask() {
        MainTask mainTask = new MainTask();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        mainTask.setUniqueID(1);
        mainTask.setTitle("title");
        mainTask.setDescription("description");
        mainTask.setDue(calendar);

        SubTask subTask = new SubTask();
        // Create sub task
        subTask.setUniqueID(2);
        subTask.setTitle("titleSub");
        subTask.setDescription("descriptionSub");
        subTask.setDue(calendar);

        mainTask.addSubTask(subTask);
        assertEquals(1, mainTask.getSubTasks().size());
        subTask.setTitle("updatedTitle");
        mainTask.updateSubTask(subTask);
        assertEquals("updatedTitle", mainTask.getSubTasks().get(0).getTitle());
    }

}
