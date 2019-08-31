package main;

import task.Task;

import java.util.ArrayList;

public class Ui {
    private final String border = "    ____________________________________________________________";

    public void printList(ArrayList<Task> arr) {
        System.out.println(border);
        System.out.println("     Here are the tasks in your list:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("     " + (i + 1) + "." + arr.get(i));
        }
        System.out.println(border);
    }

    public void printAdd(ArrayList<Task> arr) {
        System.out.println(border);
        System.out.println("     Got it. I've added this task: ");
        System.out.println("       " + arr.get(arr.size() - 1));
        System.out.printf("     Now you have %s tasks in the list.\n", arr.size());
        System.out.println(border);
    }

    public void printDone(ArrayList<Task> arr, int index) {
        arr.get(index).markAsDone();
        System.out.println(border);
        System.out.println("     Nice! I've marked this task as done: ");
        System.out.println("       " + arr.get(index));
        System.out.println(border);
    }

    public void printRemove(ArrayList<Task> arr, Task task) {
        System.out.println(border);
        System.out.println("     Noted. I've removed this task:");
        System.out.println("       " + task);
        System.out.printf("     Now you have %s tasks in the list.\n", arr.size());
        System.out.println(border);
    }

    public void printBye() {
        System.out.println(border + "\n" + "     Bye. Hope to see you again soon!" + "\n" + border);
    }

    public void printError(String errorMessage) {
        System.out.println(border);
        System.out.println("     " + errorMessage);
        System.out.println(border);
    }

    public void printMessage(String message) {
        System.out.println(border);
        System.out.println("     " + message);
        System.out.println(border);
    }
}