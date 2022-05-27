package task2;

import java.util.List;
import java.util.ArrayList;

public class ManagerUser {
    private final List<User> users = new ArrayList<>();
    private final List<Task> tasks = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void addTaskToUser(String name) {
        User user = validateName(name);
        Task task = new Task("task1", "description", user);
        tasks.add(task);
    }

    public List<Task> findAllUserTasks(String name) {
        User user = validateName(name);
        List<Task> userTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getUser().getName().equalsIgnoreCase(name)) {
                userTasks.add(task);
            }
        }
        return userTasks;
    }

    private User findByName(String key) {
        User user = null;
        for (User item : users) {
            String name = item.getName();
            if (key.equalsIgnoreCase(name)) {
                user = item;
                break;
            }
        }
        return user;
    }

    private User validateName(String name) {
        User user = findByName(name);
        if (user == null) {
            throw new UserNotFoundException("User with " + name + " does not exists!");
        }
        return user;
    }
}
