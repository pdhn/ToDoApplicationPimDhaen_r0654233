package be.ucll.r0654233.todo;

import be.ucll.r0654233.todo.dto.TaskDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDTOTest {

    private TaskDTO taskDTO;

    /*
    SETUP raises unknown problems
    @BeforeEach
    public void setUp() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);
    }
    */

    @Test
    public void testGetSetUniqueID() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);

        assertEquals(1, taskDTO.getUniqueID());
    }

    @Test
    public void testGetSetTitle() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);

        assertEquals("title", taskDTO.getTitle());
    }
    @Test
    public void testGetSetDescription() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);

        assertEquals("description", taskDTO.getDescription());
    }
    @Test
    public void testGetSetDue() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);

        assertEquals(calendar.getTime(), taskDTO.getDue().getTime());
    }

}
