package be.ucll.r0654233.todo.controller;

import be.ucll.r0654233.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskViewAllController {

    private final TaskService taskService;

    @Autowired
    public TaskViewAllController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public void getTasks(Model model) {
        model.addAttribute("tasks", taskService.getTasks());

    }


}
