package week07d04;

import java.time.LocalDate;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompletedAt(LocalDate completedAt) {
        this.completedAt = completedAt;
    }

    public void complete() {
        setCompletedAt(LocalDate.now());
        completed = true;
    }

    public void complete(LocalDate kesz) {
        setCompletedAt(kesz);
        completed = true;
    }

    public String toString() {
        String status = "nem készült el.";
        if (completed) {
            status = "elkészült ekkor:" + getCompletedAt();
        }
        return getTitle() + " című feladat " + status;
    }

}
