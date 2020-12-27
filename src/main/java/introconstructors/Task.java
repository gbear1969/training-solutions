package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    private String title;
    private String  description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("Task", "ld. a leírást");

        task.start();
        task.setDuration(20);

        System.out.println(task.getTitle() + " a feladat, így csináld: " +
                task.getDescription() + ", kezdted ekkor: " +
                task.getStartDateTime() + ", a befejezés kb. " +
                task.getDuration() + " perccel később. ");
    }
}
