package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.dto.TaskDTO;

public interface TaskEditService {

    public MainTask getTask(int id);

    public void updateTask(int id, TaskDTO taskDTO);
}
