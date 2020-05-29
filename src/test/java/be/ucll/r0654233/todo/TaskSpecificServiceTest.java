package be.ucll.r0654233.todo;

import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.service.TaskNewService;
import be.ucll.r0654233.todo.service.TaskService;
import be.ucll.r0654233.todo.service.TaskSpecificService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class TaskSpecificServiceTest {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskNewService taskNewService;

    @Autowired
    private TaskSpecificService taskSpecificService;

    @Test
    public void testGetMainTask() {
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

        taskSpecificService.getMainTask(1);

        // Lazy initialization error, could not locate issue.
    }

}
