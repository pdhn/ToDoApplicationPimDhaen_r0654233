package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskEditServiceImplentation implements TaskEditService {


    private final TaskRepository taskRepository;

    @Autowired
    public TaskEditServiceImplentation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getTask(int id) {
        return taskRepository.getTask(id);
    }

    @Override
    public void editTask(int id, TaskDTO taskDTO) {
        taskRepository.edit(id, taskDTO);
    }
}
