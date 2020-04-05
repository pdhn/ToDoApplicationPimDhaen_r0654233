package be.ucll.r0654233.todo.controller;

import be.ucll.r0654233.todo.dto.MainTaskDTO;
import be.ucll.r0654233.todo.service.TaskNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks/new")
public class TaskAddNewController {

    private final TaskNewService taskNewService;

    @Autowired
    public TaskAddNewController(TaskNewService taskNewService){
        this.taskNewService = taskNewService;
    }

    @GetMapping
    public String getForm() {
        return "tasksAdd.html";
    }

    @PostMapping
    public String addTask(@ModelAttribute MainTaskDTO mainTaskDTO) {
        System.out.println(mainTaskDTO.getDue());
        taskNewService.addTask(mainTaskDTO);
        return "redirect:/tasks";
    }

}
