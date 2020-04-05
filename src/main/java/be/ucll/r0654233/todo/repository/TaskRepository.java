package be.ucll.r0654233.todo.repository;

import be.ucll.r0654233.todo.domain.MainTask;
import be.ucll.r0654233.todo.domain.SubTask;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {

    private Map<Integer, MainTask> tasks;

    private final static int MAX_ID_VALUE = 1000;

    public TaskRepository() {
        tasks = new HashMap<>();

        addMainTask(new MainTask(1, "jeff", "jeffDescription", Calendar.getInstance()));
        addSubTask(1, new SubTask(11, "jeffsubtask", "jeffsubtaskDescription", Calendar.getInstance()));
        addSubTask(1, new SubTask(12, "klsubtask", "klsubtaskDescription", Calendar.getInstance()));

        addMainTask(new MainTask(2, "blue", "blueDescription", Calendar.getInstance()));
        addSubTask(2, new SubTask(21, "bluesubtask", "bluesubtaskDescription", Calendar.getInstance()));
        addSubTask(2, new SubTask(22, "redsubtask", "redsubtaskDescription", Calendar.getInstance()));


    }

    public List<MainTask> getTasks() {
        return new ArrayList<>(tasks.values());
    }

    public MainTask getMainTask(int uniqueId) {
        if (uniqueId < 0)
            throw new RepositoryException("Invalid ID: id can't be negative.");
        if (!tasks.containsKey(uniqueId))
            throw new RepositoryException("Invalid ID: id does not exist in database.");
        return (MainTask) tasks.get(uniqueId);
    }

    public void addMainTask(MainTask mainTask) {
        if (tasks.containsKey(mainTask.getUniqueID()))
            throw new RepositoryException("ID not unique: task with that id already exists.");
        if (mainTask.getUniqueID() == 0)
            mainTask.setUniqueID(generateUniqueID());
        tasks.put(mainTask.getUniqueID(), mainTask);
    }

    public void updateMainTask(int uniqueId, MainTask mainTask) {
        tasks.put(uniqueId, mainTask);
    }

    public void removeMainTask(int uniqueId) {
        if (uniqueId < 0)
            throw new RepositoryException("Invalid ID: id can't be negative.");
        if (!tasks.containsKey(uniqueId))
            throw new RepositoryException("Invalid ID: id does not exist in database.");
        tasks.remove(uniqueId);
    }

    public void addSubTask(int mainTaskId, SubTask subTask) {
        MainTask mainTask = getMainTask(mainTaskId);
        mainTask.addSubTask(subTask);
        tasks.put(mainTaskId, mainTask);
    }

    public void updateSubTask(int mainTaskId, SubTask newSubTask) {
        MainTask mainTask = getMainTask(mainTaskId);
        mainTask.updateSubTask(newSubTask);
        tasks.put(mainTaskId, mainTask);
    }

    public void removeSubTask(int mainTaskId, int subTaskId) {
        MainTask mainTask = getMainTask(mainTaskId);
        mainTask.removeSubTask(subTaskId);
        tasks.put(mainTaskId, mainTask);
    }

    private int generateUniqueID() {
        while (true){
            int randomID = new Random().nextInt(MAX_ID_VALUE);
            if (!tasks.containsKey(randomID))
                return randomID;
        }
    }

}
