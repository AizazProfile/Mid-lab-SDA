package todoapp;

import javax.swing.*;

public class AddTask {
    public static void add(TaskManager taskManager, DefaultListModel<String> listModel, JFrame parent) {
        String task = JOptionPane.showInputDialog(parent, "Enter new task:");
        if (task != null && !task.trim().isEmpty()) {
            taskManager.addTask(task);
            listModel.addElement(task);
        }
    }
}
