package org.example.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", taskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", taskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over lab2", taskStatus.COMPLETED));
    }

    public List<TaskItem> getAllTasks() {
        return new ArrayList<>(tasks);

    }
    public List<TaskItem> getByStatus(taskStatus status) {
        List<TaskItem> statusTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                statusTasks.add(task);
            }
        }
        return statusTasks;
    }
    public List<TaskItem> getTasksById(int id) {
        List<TaskItem> idTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= id) {
                idTasks.add(task);
            }
        }
        return idTasks;
    }
    public void printTaskDescriptions() {
        tasks.stream()
                .forEach(task -> System.out.println(task.getTaskDescription()));
    }
}