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
public class SubTaskTest {

    @Test
    public void testSubTaskConstructor() {
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

        assertNotEquals(null, subTask);
    }
}
