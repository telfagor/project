package task2;

public class Task {
    private String title;
    private String taskDescription;
    private User user;

    public Task(String title, String taskDescription, User user) {
        this.title = title;
        this.taskDescription = taskDescription;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                '}';
    }
}
