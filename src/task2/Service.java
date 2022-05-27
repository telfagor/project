package task2;

import java.util.Scanner;
import java.util.List;

public class Service {
    private final ManagerUser managerUser = new ManagerUser();

    public void addUser(Scanner scanner) {
        System.out.println("=== Add a new user ===");
        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        String userName = scanner.nextLine();
        User user = new User(name, lastName, userName);
        managerUser.add(user);
        System.out.println("User added!");
    }

    public void showAllUsers() {
        System.out.println("=== Show all users ===");
        List<User> users = managerUser.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void addTaskToUser(Scanner scanner) {
        System.out.println("=== Add task to user ===");
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        managerUser.addTaskToUser(name);
    }

    public void showAllUserTasks(Scanner scanner) {
        System.out.println("=== Show all user tasks ===");
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        List<Task> userTasks = managerUser.findAllUserTasks(name);
        System.out.println("The user with " + name + "has tasks: ");
        for (Task task : userTasks) {
            System.out.println(task);
        }
    }
}
