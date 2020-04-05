package be.ucll.r0654233.todo.repository;

import be.ucll.r0654233.todo.domain.Task;
import be.ucll.r0654233.todo.dto.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> tasks;

    public TaskRepository() {
        tasks = new ArrayList<>();
        tasks.add(new Task(1, "friend", "it is a one description", LocalDate.now(), LocalTime.now()));
        tasks.add(new Task(2, "guy", "it is a two description", LocalDate.now(), LocalTime.now()));
        tasks.add(new Task(3, "buddy", "it is a three description", LocalDate.now(), LocalTime.now()));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(int id) {
        if (id < 0)
            throw new IllegalArgumentException("Invalid id");
        for (Task t : tasks) {
            if (t.getTaskNumber() == id) {
                return t;
            }
        }
        return null;
    }

    public void addTask(Task task) {
        if (tasks.contains(task))
            throw new IllegalArgumentException("Duplicate task");

        this.tasks.add(task);
    }


    public void edit(int id, TaskDTO taskDTO) {
        int index = tasks.indexOf(tasks.get(id));
        tasks.remove(index);
        tasks.add(new Task(taskDTO.getTitle(), taskDTO.getDetail(), taskDTO.getDateDue()));
    }
}
