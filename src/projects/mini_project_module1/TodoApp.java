package projects.mini_project_module1;

import java.util.Scanner;

/**
 * @author azamov
 * @description This todo project for learning using programming principles and also learning java
 * @since 10/14/2025
 * @time 12:19 AM
 * @version v1.0
 * */
public class TodoApp {
    public static String[] tasks = new String[10];
    public static String[] taskStatus = new String[10];
    public static int lastItem = 0;
    public static Runnable[] actions = {TodoApp::addTask, TodoApp::viewTasks, TodoApp::updateTask, TodoApp::deleteTask, TodoApp::findTasks, () -> {
        System.out.println("Exiting...");
        System.exit(0);
    }, () -> System.out.println("Another task")};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            actions[choice - 1].run();
        }
    }


    private static void findTasks() {
        if (lastItem == 0) {
            System.out.println("No lessons.module1.tasks found");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter task to find: ");
            String task = scanner.next();
            for (int i = 0; i < tasks.length; i++) {
                if (tasks[i] != null && tasks[i].contains(task)) {
                    System.out.println((i + 1) + ". " + tasks[i] + " - Status: " + taskStatus[i]);
                }
            }
        }
    }

    private static void deleteTask() {
        if (lastItem == 0) {
            System.out.println("No lessons.module1.tasks found");
        } else {
            for (int i = 0; i < tasks.length; i++) {
                if (tasks[i] != null) {
                    System.out.println((i + 1) + ". " + tasks[i] + " - Status: " + taskStatus[i]);
                }
            }
            System.out.print("enter task num to delete: ");
            Scanner scanner = new Scanner(System.in);
            int taskNum = scanner.nextInt();
            if (taskNum > 0 && taskNum <= tasks.length && tasks[taskNum - 1] != null) {
                tasks[taskNum - 1] = null;
                taskStatus[taskNum - 1] = null;
                lastItem--;
                System.out.println("Task deleted successfully");
            }
        }
    }

    private static void updateTask() {
        if (lastItem == 0) {
            System.out.println("No lessons.module1.tasks found");
        } else {
            for (int i = 0; i < tasks.length; i++) {
                if (tasks[i] != null) {
                    System.out.println((i + 1) + ". " + tasks[i] + " - Status: " + taskStatus[i]);
                }
            }
            System.out.print("enter task num to update: ");
            Scanner scanner = new Scanner(System.in);
            int taskNum = scanner.nextInt();
            if (taskNum > 0 && taskNum <= tasks.length && tasks[taskNum - 1] != null) {
                System.out.println("Choose one of the status:  1 -> Pending, 2 -> In Progress, 3 -> Done ");
                int status = scanner.nextInt();
                if (status == 1 || status == 2 || status == 3) {
                    taskStatus[taskNum - 1] = status == 1 ? "Pending" : status == 2 ? "In Progress" : "Done";
                    System.out.println("Task updated successfully Status: " + taskStatus[taskNum - 1]);
                } else {
                    System.out.println("Invalid status");
                }
            }
        }
    }

    private static void viewTasks() {
        if (lastItem == 0) {
            System.out.println("No lessons.module1.tasks found");
        } else {
            for (int i = 0; i < lastItem; i++) {
                System.out.println((i + 1) + ". " + tasks[i] + " - Status: " + taskStatus[i]);
            }
        }
    }

    private static void addTask() {
        if (lastItem == tasks.length) {
            tasks = resize(tasks);
            taskStatus = resize(taskStatus);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a task: ");
        tasks[lastItem] = scanner.nextLine();
        taskStatus[lastItem] = "Pending";
        System.out.println("Task added successfully Status: " + taskStatus[lastItem]);
        lastItem++;
    }

    private static String[] resize(String[] tasks) {
        String[] newTasks = new String[tasks.length + tasks.length / 2];
        System.arraycopy(tasks, 0, newTasks, 0, tasks.length);
        return newTasks;
    }

    public static void displayMenu() {
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Find Task");
        System.out.println("6. Exit");
    }
}
