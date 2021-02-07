package interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable {
    private List<String> tasks = new ArrayList<>();

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        do  {
            nextStep();
        }
        while (nextStep());

    }

    private boolean nextStep() {
        if (tasks.size() > 0) {
            tasks.remove(tasks.size()-1);
        }
        return tasks.size() > 0;
    }
}
