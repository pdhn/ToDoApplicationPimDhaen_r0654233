package be.ucll.r0654233.todo.service;

import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.domain.Task;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TaskService {

    public List<MainTask> getTasks();
}
