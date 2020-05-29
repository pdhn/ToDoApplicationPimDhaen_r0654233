package be.ucll.r0654233.todo;

import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.service.TaskNewService;
import be.ucll.r0654233.todo.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskNewService taskNewService;

    @Test
    public void testGetTasks() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);
        taskNewService.addTask(taskDTO);

        assertEquals(taskDTO.getTitle(), taskService.getTasks().get(0).getTitle());
        assertEquals(taskDTO.getDescription(), taskService.getTasks().get(0).getDescription());
        assertEquals(taskDTO.getDue(), taskService.getTasks().get(0).getDue());
        assertEquals(taskDTO.getUniqueID(), taskService.getTasks().get(0).getUniqueID());
    }

}
