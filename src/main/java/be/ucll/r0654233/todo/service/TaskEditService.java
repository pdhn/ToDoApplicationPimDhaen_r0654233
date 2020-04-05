package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;

public interface TaskEditService {

    public Task getTask(int id);

    public void editTask(int id, TaskDTO taskDTO);
}
