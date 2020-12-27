package intromethods;

import java.util.ArrayList;
import java.util.Arrays;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList tl = new TodoList();

        tl.addTodo("inni");
        tl.addTodo("enni");
        tl.addTodo("inni");
        tl.addTodo("fogat mosni");
        tl.addTodo("fürödni");
        tl.addTodo("aludni");

        System.out.println(tl.todosToFinish());
        System.out.println(tl.numberOfFinished());

        tl.finishTodos("inni");
        System.out.println(tl.todosToFinish());
        System.out.println(tl.numberOfFinished());

        tl.finishAllTodos(Arrays.asList("fogat mosni", "enni"));
        System.out.println(tl.todosToFinish());
        System.out.println(tl.numberOfFinished());

        System.out.println(tl.toString());

    }
}
