package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todos.add(todo);
    }

    public void finishTodos(String caption) {
        for (Todo t: todos) {
            if (caption.equalsIgnoreCase(t.getCaption())) {
                t.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String ts: todosToFinish) {
            finishTodos(ts);
        }
    }

    public List<String> todosToFinish() {
        List<String> finished = new ArrayList<>();
        for (Todo t: todos) {
            if (!t.isFinished()) {
                finished.add(t.getCaption());
            }
        }
        return finished;
    }

    public int numberOfFinished() {
        int f = 0;
        for (Todo t: todos) {
            if (t.isFinished()) {
                f++;
            }
        }
        return f;
    }

    @Override
    public String toString() {
        return todos.toString();
    }
}
