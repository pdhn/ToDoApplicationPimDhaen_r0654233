package be.ucll.r0654233.todo.controller;

import be.ucll.r0654233.todo.service.TaskSpecificService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/tasks/{id}", method = RequestMethod.GET)
public class TaskViewSpecificController {


    private final TaskSpecificService taskSpecificService;

    @Autowired
    public TaskViewSpecificController(TaskSpecificService taskSpecificService) {
        this.taskSpecificService = taskSpecificService;
    }

    @PostMapping
    public String viewSpecificTask(@PathVariable("id") int id, Model model) {
        model.addAttribute("task", taskSpecificService.getMainTask(id));
        return "tasksSpecific";
    }

}
