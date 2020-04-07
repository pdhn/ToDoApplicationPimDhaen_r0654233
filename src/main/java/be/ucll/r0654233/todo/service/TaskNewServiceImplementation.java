package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.domain.SubTask;
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
        taskRepository.save(new MainTask(taskDTO.getTitle(), taskDTO.getDescription(), taskDTO.getDue()));
    }

    @Override
    public void addSubTask(int mainTaskId, TaskDTO taskDTO) {
        MainTask task = taskRepository.getOne(mainTaskId);
        task.addSubTask(new SubTask(taskDTO.getTitle(), taskDTO.getDescription(), taskDTO.getDue()));
        taskRepository.save(task);
    }

}
