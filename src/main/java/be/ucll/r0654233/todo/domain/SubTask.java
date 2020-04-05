package be.ucll.r0654233.todo.domain;

import java.util.Calendar;

public class SubTask extends Task {

    public SubTask(int uniqueId, String title, String description, Calendar due) {
        super(uniqueId, title, description, due);
    }
}
