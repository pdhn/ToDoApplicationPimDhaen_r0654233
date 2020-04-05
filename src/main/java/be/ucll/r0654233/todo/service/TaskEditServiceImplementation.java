package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskEditServiceImplementation implements TaskEditService {


    private final TaskRepository taskRepository;

    @Autowired
    public TaskEditServiceImplementation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getTask(int id) {
        return taskRepository.getTask(id);
    }

    @Override
    public void updateTask(int id, TaskDTO taskDTO) {
        taskRepository.update(id, taskDTO);
    }
}
