package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.dto.MainTaskDTO;

public interface TaskNewService {

    public void addTask(MainTaskDTO mainTaskDTO);

    public void addSubTask(int mainTaskId, MainTaskDTO mainTaskDTO);
}
