package com.example.todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoApp app = new ToDoApp();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to your To-Do List!");

        while (true) {
            System.out.println("\nEnter a command (add, list, delete, exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter a task:");
                    String task = scanner.nextLine();
                    app.addTask(task);
                    break;
                case "list":
                    app.listTasks();
                    break;
                case "delete":
                    System.out.println("Enter the task number to delete:");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    app.deleteTask(taskNumber - 1);
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
