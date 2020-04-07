package be.ucll.r0654233.todo.controller;

import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.service.TaskNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks/{id}/sub/create")
public class TaskAddNewSubController {

    private final TaskNewService taskNewService;

    @Autowired
    public TaskAddNewSubController(TaskNewService taskNewService){
        this.taskNewService = taskNewService;
    }

    @GetMapping
    public String getForm(@PathVariable("id")int id, Model model) {
        model.addAttribute(id);
        return "tasksAddSub";
    }

    @PostMapping
    public String addTask(@PathVariable("id")int id, @ModelAttribute TaskDTO taskDTO) {
        taskNewService.addSubTask(id, taskDTO);
        return "redirect:/tasks";
    }


}
