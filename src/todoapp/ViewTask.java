package todoapp;

import javax.swing.*;
import java.util.List;

public class ViewTask {
    public static void view(TaskManager taskManager, JFrame parent) {
        List<String> tasks = taskManager.getTasks();
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(parent, "No tasks to show.");
        } else {
            StringBuilder sb = new StringBuilder("Your Tasks:\n");
            for (int i = 0; i < tasks.size(); i++) {
                sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(parent, sb.toString());
        }
    }
}
