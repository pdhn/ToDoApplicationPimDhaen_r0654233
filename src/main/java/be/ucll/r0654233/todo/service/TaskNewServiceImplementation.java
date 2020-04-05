package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;
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
    public void addTask(TaskDTO taskDTO) {
        Task task = new Task(taskDTO.getTitle(), taskDTO.getDetail(), taskDTO.getDateDue());
        taskRepository.addTask(task);
    }
}
