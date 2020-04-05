package be.ucll.r0654233.todo.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Task {

    private int taskNumber;
    private String title, detail;
    private LocalDate dateDue;
    private LocalTime timeDue;

    public Task(int taskNumber, String title, String detail, LocalDate dateDue, LocalTime timeDue) {
        this.taskNumber = taskNumber;
        this.title = title;
        this.detail = detail;
        this.dateDue = dateDue;
        this.timeDue = timeDue;
    }

    public Task(String title, String detail, LocalDate dateDue) {
        this.taskNumber = 0;
        this.title = title;
        this.detail = detail;
        this.dateDue = dateDue;
        this.timeDue = LocalTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public LocalDate getDateDue() {
        return dateDue;
    }

    public void setDateDue(LocalDate dateDue) {
        this.dateDue = dateDue;
    }

    public LocalTime getTimeDue() {
        return timeDue;
    }

    public void setTimeDue(LocalTime timeDue) {
        this.timeDue = timeDue;
    }

    public int getHour() {
        return this.timeDue.getHour();
    }

    public String getTimeOfDay() {
        if (timeDue.getHour() < 12)
            return "am";
        else {
            return "pm";
        }
    }

    public String getMonth() {
        String month = dateDue.getMonth().toString();
        month = month.charAt(0) + month.toLowerCase().substring(1);
        return month;
    }

    public int getDay() {
        return dateDue.getDayOfMonth();
    }

    public int getYear() {
        return dateDue.getYear();
    }

}
