package org.example.week3;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    private static final String CONNECTION_STRING =
            "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "CHANGE";
    private Connection connection = null;
    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING,
                    USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<TaskItem> fetchAllTasks() {
        List<TaskItem> tasks = new ArrayList<>();
        String query = "SELECT id, description, status FROM tasks";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("description");
                taskStatus status = taskStatus.valueOf(rs.getString("status"));
                tasks.add(new TaskItem(id, description, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }


    public TaskItem fetchTaskById(int id) {
        TaskItem task = null;
        String query = "SELECT id, description, status FROM tasks WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String description = rs.getString("description");
                taskStatus status = taskStatus.valueOf(rs.getString("status"));
                task = new TaskItem(id, description, status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }


    public void createTask(TaskItem task) {
        String query = "INSERT INTO tasks (description, status) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, task.getTaskDescription());
            pstmt.setString(2, task.getTaskStatus().name());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void updateTaskName(int id, String newDescription) {
        String query = "UPDATE tasks SET description = ? WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, newDescription);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
