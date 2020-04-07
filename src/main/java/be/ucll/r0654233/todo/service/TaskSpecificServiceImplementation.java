package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskSpecificServiceImplementation implements TaskSpecificService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskSpecificServiceImplementation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public MainTask getMainTask(int mainTaskId) {
        return taskRepository.getOne(mainTaskId);
    }
}
