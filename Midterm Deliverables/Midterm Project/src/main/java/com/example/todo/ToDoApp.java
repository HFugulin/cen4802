package com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoApp {
    private List<String> tasks;

    public ToDoApp() {
        tasks = new ArrayList<>();
    }

    // Add a task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // List all tasks
    public void listTasks() {
        System.out.println("Your To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Delete a task by index
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task removed: " + tasks.get(index));
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
