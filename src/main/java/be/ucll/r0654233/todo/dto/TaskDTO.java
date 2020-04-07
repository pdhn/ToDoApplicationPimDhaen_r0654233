package be.ucll.r0654233.todo.dto;

import be.ucll.r0654233.todo.domain.DomainException;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;

public class TaskDTO {

    private int uniqueID;
    private String title, description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Calendar due;

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        if (uniqueID < 0)
            throw new DomainException("Invalid unique ID: Unique Id can't be negative.");
        this.uniqueID = uniqueID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new DomainException("Invalid Title: Empty title.");
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty())
            throw new DomainException("Invalid Description: Empty Description.");
        this.description = description;
    }

    public Calendar getDue() {
        return due;
    }

    public void setDue(Calendar due) {
        if (due == null)
            throw new DomainException("Invalid Date/time: Empty date given.");
        if (due.before(Calendar.getInstance()))
            throw new DomainException("Invalid Date/time: Date is in the past.");
        this.due = due;
    }

    public int getYearDue() {
        return due.get(Calendar.YEAR);
    }

    public int getMonthDue() {
        return due.get(Calendar.MONTH);
    }

    public int getDayDue() {
        return due.get(Calendar.DAY_OF_MONTH);
    }

    public String getTimeOfDayDue() {
        if (due.get(Calendar.AM_PM) == Calendar.AM) {
            return "AM";
        } else {
            return "PM";
        }
    }

    public int getHourDue() {
        return due.get(Calendar.HOUR);
    }
}
