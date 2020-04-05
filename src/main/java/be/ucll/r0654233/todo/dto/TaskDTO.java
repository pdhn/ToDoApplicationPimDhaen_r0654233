package be.ucll.r0654233.todo.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class TaskDTO {

    private int taskNumber;
    private String title, detail;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateDue;
    private LocalTime timeDue;

    public LocalTime getTimeDue() {
        return timeDue;
    }

    public void setTimeDue(LocalTime timeDue) {
        this.timeDue = timeDue;
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

    public LocalDate getDateDue() {
        return dateDue;
    }

    public void setDateDue(LocalDate dateDue) {
        this.dateDue = dateDue;
    }

    public String getMonth() {
        String month = dateDue.getMonth().toString();
        month = month.charAt(0) + month.toLowerCase().substring(1);
        return month;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public int getDay() {
        return dateDue.getDayOfMonth();
    }

    public int getYear() {
        return dateDue.getYear();
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "taskNumber=" + taskNumber +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", dateDue=" + dateDue +
                ", timeDue=" + timeDue +
                '}';
    }
}
