package be.ucll.r0654233.todo.domain;

import javax.persistence.Entity;
import java.util.Calendar;

@Entity
public class SubTask extends Task {


    public SubTask() {

    }

    public SubTask(int uniqueId, String title, String description, Calendar due) {
        super(uniqueId, title, description, due);
    }

    public SubTask(String title, String description, Calendar due) {
        super(title, description, due);
        setUniqueID(0);
    }
}
