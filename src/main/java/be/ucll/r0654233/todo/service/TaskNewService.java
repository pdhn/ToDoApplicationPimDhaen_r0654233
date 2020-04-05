package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;

public interface TaskNewService {

    public void addTask(TaskDTO taskDTO);
}
