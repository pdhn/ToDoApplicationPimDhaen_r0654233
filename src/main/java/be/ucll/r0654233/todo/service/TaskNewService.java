package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.dto.TaskDTO;

public interface TaskNewService {

    public void addTask(TaskDTO taskDTO);

    public void addSubTask(int mainTaskId, TaskDTO taskDTO);
}
