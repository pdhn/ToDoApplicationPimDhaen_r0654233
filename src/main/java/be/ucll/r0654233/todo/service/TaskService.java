package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TaskService {

    public List<Task> getTasks();

    public void addTask(TaskDTO taskDTO);

}
