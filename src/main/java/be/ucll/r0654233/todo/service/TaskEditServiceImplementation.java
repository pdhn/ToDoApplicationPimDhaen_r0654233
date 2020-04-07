package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.MainTask;
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
    public MainTask getMainTask(int id) {
        return (MainTask) taskRepository.getOne(id);
    }

    @Override
    public void updateTask(int id, TaskDTO taskDTO) {
        MainTask mainTask = taskRepository.getOne(id);
        mainTask.setTitle(taskDTO.getTitle());
        mainTask.setDescription(taskDTO.getDescription());
        mainTask.setDue(taskDTO.getDue());
        taskRepository.save(mainTask);
    }
}
