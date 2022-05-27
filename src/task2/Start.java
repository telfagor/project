package task2;

import java.util.Scanner;

public class Start {
    private final Service service = new Service();

    public void showMenu() {
        String[] options = {"Create new user", "Show all users",
                "Add task to user", "Show user's tasks", "Exit"};

        System.out.println();
        System.out.println("Menu:");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ". " + options[i]);
        }
        System.out.println();
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select the option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> service.addUser(scanner);
                case 2 -> service.showAllUsers();
                case 3 -> service.addTaskToUser(scanner);
                case 4 -> service.showAllUserTasks(scanner);
                case 5 -> {
                    run = false;
                    System.out.println("Have a nice day!");
                }
            }
        }
    }
}
