package module4.projects.todo;

import module4.projects.todo.dto.Todo;
import module4.projects.todo.service.TaskService;
import module4.projects.todo.service.imp.TaskServiceImp;

import java.time.*;
import java.util.*;
import java.util.logging.Logger;

public class App {
    static {
        initializeLogging();
    }

    private static void initializeLogging() {

        var resource = App.class.getClassLoader().getResource("logging_todo.properties");

        System.setProperty("java.util.logging.config.file", resource.getFile());
    }

    private static final Logger logger = Logger.getLogger(App.class.getName());

    private final TaskService taskService = new TaskServiceImp();
    private final Scanner scanner = new Scanner(System.in);

    public static final String RESET = "\033[0m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String CYAN_BRIGHT = "\033[0;96m";

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {
        System.out.println("Todo App Started");
        taskService.startScheduler();
        displayMenu();
    }

    private void displayMenu() {
        while (true) {
            System.out.println("1. Add todo");
            System.out.println("2. Update todo");
            System.out.println("3. Delete todo");
            System.out.println("4. Get all todos");
            System.out.println("5. Show calendar");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            switch (scanner.nextLine()) {
                case "1" -> addTodo();
                case "2" -> updateTodo();
                case "3" -> deleteTodo();
                case "4" -> getAllTodos();
                case "5" -> printCalendar(LocalDate.now());
                case "6" -> exit();
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void addTodo() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String desc = scanner.nextLine();
        LocalDateTime dateTime = chooseDateTime();
        taskService.add(new Todo(title, desc, false, dateTime));
        System.out.println("Todo added");
    }

    private void updateTodo() {
        getAllTodos();
        System.out.print("Enter title to update: ");
        String title = scanner.nextLine();

        Todo todo = findByTitle(title);
        if (todo == null) {
            System.out.println("Not found");
            return;
        }

        System.out.print("New description: ");
        String desc = scanner.nextLine();

        LocalDateTime time = chooseDateTime();

        taskService.update(new Todo(todo.getTitle(), desc, false, time));
        System.out.println("Updated");
    }

    private void deleteTodo() {
        getAllTodos();
        System.out.print("Enter title to delete: ");
        String title = scanner.nextLine();

        Todo todo = findByTitle(title);
        if (todo == null) {
            System.out.println("Not found");
            return;
        }

        taskService.delete(todo);
        System.out.println("Deleted");
    }

    private void getAllTodos() {
        List<Todo> list = taskService.getAll();

        if (list.isEmpty()) {
            System.out.println("No todos");
            return;
        }

        for (Todo t : list) {
            System.out.println(t.getTitle() + " | " + t.getTaskTime());
        }
    }

    private Todo findByTitle(String title) {
        for (Todo t : taskService.getAll()) {
            if (Objects.equals(t.getTitle(), title)) return t;
        }
        return null;
    }

    private LocalDateTime chooseDateTime() {
        LocalDate today = LocalDate.now();

        System.out.println("Choose date:");
        printCalendar(today);

        int day;
        while (true) {
            try {
                System.out.print("Select day (1–" + today.lengthOfMonth() + "): ");
                day = Integer.parseInt(scanner.nextLine());

                LocalDate pickedDate = today.withDayOfMonth(day);

                if (!pickedDate.isBefore(today)) break;

            } catch (Exception ignored) {
            }
            logger.warning("Invalid day (day cannot be past). Try again.");
        }

        int hour;
        while (true) {
            try {
                System.out.print("Hour (0–23): ");
                hour = Integer.parseInt(scanner.nextLine());
                if (hour >= 0 && hour <= 23) break;
            } catch (Exception ignored) {
            }

            logger.warning("Invalid hour, try again.");
        }

        int minute;
        while (true) {
            try {
                System.out.print("Minute (0–59): ");
                minute = Integer.parseInt(scanner.nextLine());
                if (minute >= 0 && minute <= 59) break;
            } catch (Exception ignored) {
            }

            logger.warning("Invalid minute, try again.");
        }

        int second;
        while (true) {
            try {
                System.out.print("Second (0–59): ");
                second = Integer.parseInt(scanner.nextLine());
                if (second >= 0 && second <= 59) break;
            } catch (Exception ignored) {
            }

            logger.warning("Invalid second, try again.");
        }

        LocalDate pickedDate = today.withDayOfMonth(day);
        LocalDateTime dateTime = LocalDateTime.of(pickedDate.getYear(), pickedDate.getMonth(), pickedDate.getDayOfMonth(), hour, minute, second);

        if (dateTime.isBefore(LocalDateTime.now())) {
            logger.warning("Selected time cannot be in the past.");
            return chooseDateTime();
        }

        return dateTime;
    }

    private void exit() {
        logger.info("Exited");
        System.exit(0);
    }

    private void printCalendar(LocalDate dateTime) {
        Month month = dateTime.getMonth();
        int year = dateTime.getYear();
        System.out.printf("%s%s %d%s%n", CYAN_BRIGHT, month, year, RESET);

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("%s%s%s\t", CYAN_BRIGHT, day.toString().substring(0, 2), RESET);
        }
        System.out.println();

        int days = month.length(dateTime.isLeapYear());
        int firstDay = dateTime.withDayOfMonth(1).getDayOfWeek().getValue() % 7;

        for (int i = 0; i < firstDay; i++) System.out.print("\t");

        LocalDate now = LocalDate.now();

        for (int i = 1; i <= days; i++) {
            if (i == now.getDayOfMonth() && now.getMonth() == month && now.getYear() == year) {
                System.out.printf("%s%02d%s\t", RED_BRIGHT, i, RESET);
            } else {
                System.out.printf("%s%02d%s\t", CYAN_BRIGHT, i, RESET);
            }
            if ((i + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

}
