package be.ucll.r0654233.todo.domain;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainTask extends Task {

    private List<SubTask> subTasks;

    public MainTask(int uniqueId, String title, String description, Calendar due) {
        super(uniqueId, title, description, due);
        this.subTasks = new ArrayList<>();
    }

    public MainTask(String title, String description, Calendar due) {
        super(title, description, due);
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void addSubTask(SubTask subTask) {
        if (subTask == null)
            throw new DomainException("Subtask can't be null.");
        subTasks.add(subTask);
    }

    public void removeSubTask(int subTaskId) {
        if (subTaskId < 0)
            throw new DomainException("Subtask id can't be negative.");
        boolean foundFlag = false;
        for (int i = 0; i < subTasks.size(); i++) {
            if (subTasks.get(i).getUniqueID() == subTaskId) {
                subTasks.remove(i);
                foundFlag = true;
            }
        }
        if (!foundFlag)
            throw new DomainException("Sub task does not exist: could not delete.");
    }

    public void updateSubTask(SubTask newSubTask) {
        boolean foundFlag = false;
        for (int i = 0; i < subTasks.size(); i++) {
            if (subTasks.get(i).getUniqueID() == newSubTask.getUniqueID()) {
                subTasks.set(i, newSubTask);
                foundFlag = true;
            }
        }
        if (!foundFlag)
            throw new DomainException("Sub task does not exist: could not update.");
    }
}
