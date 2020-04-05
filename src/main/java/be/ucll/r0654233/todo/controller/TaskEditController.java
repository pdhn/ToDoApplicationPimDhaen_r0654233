package be.ucll.r0654233.todo.controller;

import be.ucll.r0654233.todo.dto.TaskDTO;
import be.ucll.r0654233.todo.repository.TaskRepository;
import be.ucll.r0654233.todo.service.TaskEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks/edit/{id}")
public class TaskEditController {

    private final TaskEditService taskEditService;

    @Autowired
    public TaskEditController(TaskEditService taskEditService) {
        this.taskEditService = taskEditService;
    }

    @GetMapping
    public String getForm(@PathVariable int id, Model model) {
        model.addAttribute("task", taskEditService.getTask(id));
        return "tasksEdit";
    }

    @PostMapping
    public String editForm(@ModelAttribute TaskDTO taskDTO, @PathVariable int id) {
        taskEditService.editTask(id, taskDTO);
        return "redirect:/tasks/" + id ;
    }

}
