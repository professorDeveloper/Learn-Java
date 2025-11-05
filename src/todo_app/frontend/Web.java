package todo_app.frontend;

import todo_app.backend.dtos.TodoDTO;
import todo_app.backend.enums.Category;
import todo_app.backend.enums.Priority;
import todo_app.backend.domains.Todo;
import todo_app.backend.services.impl.TodoServiceImpl;
import todo_app.backend.utils.Utils;

import javax.swing.text.Utilities;
import java.util.Scanner;

public class Web {
    static TodoServiceImpl todoService = new TodoServiceImpl();

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------------Menu--------------------");
            System.out.println("1. Add todo");
            System.out.println("2. Update todo");
            System.out.println("3. Delete todo");
            System.out.println("4. Get all todo");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addTodo();
                case "2" -> updateTodo();
                case "3" -> deleteTodo();
                case "4" -> getAllTodos();
                case "5" -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void updateTodo() {
        Scanner scanner = new Scanner(System.in);
        getAllTodos();
        System.out.println("Choose todo with number:");
        System.out.print("Enter todo id: ");
        String id = scanner.nextLine();
        System.out.print("Enter todo title: ");
        String title = scanner.nextLine();
        System.out.print("Enter todo priority:(LOW, MEDIUM, HIGH): ");
        String priorityTxt = scanner.nextLine();
        Priority priority = Priority.valueOf(priorityTxt);
        System.out.print("Enter todo priority:(WORK, PERSONAL, DEFAULT): ");
        String categoryTxt = scanner.nextLine();
        TodoDTO todo = new TodoDTO(id, title, priority, Category.valueOf(categoryTxt), false);
        todoService.update(todo);
    }

    private static void addTodo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter todo title: ");
        String title = scanner.nextLine();
        System.out.print("Enter todo priority: ");
        String priority = scanner.nextLine();
        Todo todo = Todo.builder().setTitle(title).setPriority(Priority.valueOf(priority)).build();
        todoService.create(todo);
    }

    public static void getAllTodos() {
        var todos = todoService.getAll();
        System.out.println("---------------Todo List--------------------");
        for (Todo todo : todos) {
            System.out.println(todo);
        }
        System.out.println("-----------------------------------");
    }

    public static void deleteTodo() {
        Scanner scanner = new Scanner(System.in);
        getAllTodos();
        System.out.println("Choose todo with number:");
        System.out.print("Enter todo id: ");
        String id = scanner.nextLine();
        todoService.delete(String.valueOf(id));
    }

}
