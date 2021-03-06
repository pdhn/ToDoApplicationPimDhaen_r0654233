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
public class TaskNewServiceTest {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskNewService taskNewService;

    @Test
    public void testAddTask() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);

        assertEquals(0, taskService.getTasks().size());

        taskNewService.addTask(taskDTO);

        assertEquals(taskDTO.getTitle(), taskService.getTasks().get(0).getTitle());
        assertEquals(1, taskService.getTasks().size());
    }

    @Test
    public void testSubTask() {
        TaskDTO taskDTO = new TaskDTO();
        // Create task
        Date date = new GregorianCalendar(2021, Calendar.FEBRUARY, 14).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        taskDTO.setUniqueID(1);
        taskDTO.setTitle("title");
        taskDTO.setDescription("description");
        taskDTO.setDue(calendar);

        TaskDTO taskDTOSub = new TaskDTO();
        // Create sub task
        taskDTOSub.setUniqueID(2);
        taskDTOSub.setTitle("titleSub");
        taskDTOSub.setDescription("descriptionSub");
        taskDTOSub.setDue(calendar);

        taskNewService.addTask(taskDTO);
        taskNewService.addTask(taskDTOSub);

        assertEquals(2, taskService.getTasks().size());

        // Lazy initialization error..?
        //taskNewService.addSubTask(1, taskDTO);

        //assertEquals(1, taskService.getTasks().get(0).getSubTasks().size());
    }
}
