package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskSpecificServiceImplementation implements TaskSpecificService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskSpecificServiceImplementation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public Task getTask(int id) {
        return taskRepository.getTask(id);
    }
}
