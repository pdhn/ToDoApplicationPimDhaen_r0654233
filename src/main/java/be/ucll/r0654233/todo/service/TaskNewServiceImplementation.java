package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.dto.MainTaskDTO;
import be.ucll.r0654233.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskNewServiceImplementation implements TaskNewService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskNewServiceImplementation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void addTask(MainTaskDTO mainTaskDTO) {
        taskRepository.addMainTask(new MainTask(mainTaskDTO.getTitle(), mainTaskDTO.getDescription(), mainTaskDTO.getDue()));
    }
}
