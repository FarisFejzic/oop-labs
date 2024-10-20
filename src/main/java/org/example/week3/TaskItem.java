package org.example.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private taskStatus Status;

    public TaskItem(int taskId, String taskDescription, taskStatus taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.Status = taskStatus;
    }
    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public taskStatus getTaskStatus() {
        return Status;
    }


}
